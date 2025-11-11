package App;
import java.io.*;
import java.util.Scanner;

public class BezeroMenu {

    public static void erakutsi() {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;

        while (aukera != 3) {
            System.out.println("\n=== BEZEROEN MENUA ===");
            System.out.println("1. Bezero baten kontaktua ikusi");
            System.out.println("2. Faktura sortu");
            System.out.println("3. Atzera");
            System.out.print("Aukeratu: ");
            aukera = sc.nextInt();
            sc.nextLine(); // enter garbitzeko

            if (aukera == 1) {
                // Bezero baten informazioa bilatu
                System.out.print("Idatzi bezeroaren izena: ");
                String izena = sc.nextLine();

                try {
                    Scanner fitx = new Scanner(new File("fitxategiak/bezeroak.txt"));
                    boolean aurkitua = false;

                    while (fitx.hasNextLine()) {
                        String lerroa = fitx.nextLine();
                        String[] datuak = lerroa.split(";");
                        if (datuak[0].equalsIgnoreCase(izena)) {
                            System.out.println("Izena: " + datuak[0]);
                            System.out.println("Emaila: " + datuak[1]);
                            System.out.println("Telefonoa: " + datuak[2]);
                            aurkitua = true;
                        }
                    }
                    fitx.close();

                    if (!aurkitua) {
                        System.out.println("Bezero hori ez da aurkitu.");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Errorea: fitxategia ez da aurkitu.");
                }
            }

            else if (aukera == 2) {
                // Faktura sortu eta fitxategian gorde
                System.out.print("Bezeroaren izena: ");
                String izena = sc.nextLine();
                System.out.print("Eskaera zenbakia: ");
                String eskaera = sc.nextLine();
                System.out.print("Produktuaren izena: ");
                String produktua = sc.nextLine();
                System.out.print("Kopurua: ");
                int kop = sc.nextInt();
                System.out.print("Prezioa unitateko: ");
                double prezioa = sc.nextDouble();
                sc.nextLine();

                double guztira = kop * prezioa;

                // Faktura sortu testu batean
                String edukia = "FAKTURA\n" +
                        "Bezeroa: " + izena + "\n" +
                        "Eskaera zenb.: " + eskaera + "\n" +
                        "Produktu: " + produktua + "\n" +
                        "Kopurua: " + kop + "\n" +
                        "Unitateko prezioa: " + prezioa + " €\n" +
                        "GUZTIRA: " + String.format("%.2f", guztira) + " €\n";

                // Fitxategia gorde
                try {
                    File dir = new File("fitxategiak/fakturak");
                    if (!dir.exists()) dir.mkdirs(); // sortu karpeta, ez badago

                    File faktura = new File(dir, "faktura_" + eskaera + ".txt");
                    FileWriter idazlea = new FileWriter(faktura);
                    idazlea.write(edukia);
                    idazlea.close();

                    System.out.println("Faktura sortu da: " + faktura.getAbsolutePath());

                } catch (IOException e) {
                    System.out.println("Errorea faktura gordetzean.");
                }
            }
        }
    }
}
