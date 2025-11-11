package App;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LangileakMenu {

    public static void erakutsi() {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;

        while (aukera != 3) {
            System.out.println("\n=== LANGILEEN MENUA ===");
            System.out.println("1. Langile baten informazioa ikusi");
            System.out.println("2. Nagusi baten langileak ikusi");
            System.out.println("3. Atzera");
            System.out.print("Aukeratu: ");
            aukera = sc.nextInt();
            sc.nextLine(); // enter garbitzeko

            if (aukera == 1) {
                // Langile baten informazioa erakutsi
                System.out.print("Idatzi langilearen izena: ");
                String izena = sc.nextLine();

                try {
                    Scanner fitx = new Scanner(new File("fitxategiak/langileak.txt"));
                    boolean aurkitua = false;

                    while (fitx.hasNextLine()) {
                        String lerroa = fitx.nextLine();
                        String[] datuak = lerroa.split(";");
                        if (datuak[0].equalsIgnoreCase(izena)) {
                            System.out.println("Izena: " + datuak[0]);
                            System.out.println("Telefonoa: " + datuak[1]);
                            System.out.println("Alta data: " + datuak[2]);
                            System.out.println("Nagusia: " + datuak[3]);
                            aurkitua = true;
                        }
                    }
                    fitx.close();

                    if (!aurkitua) {
                        System.out.println("Langilea ez da aurkitu.");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Errorea: fitxategia ez da aurkitu.");
                }
            }

            else if (aukera == 2) {
                // Nagusi baten langileak erakutsi
                System.out.print("Idatzi nagusiaren izena: ");
                String nagusia = sc.nextLine();

                try {
                    Scanner fitx = new Scanner(new File("fitxategiak/langileak.txt"));
                    boolean aurkitua = false;

                    System.out.println(nagusia + " nagusiaren langileak:");
                    while (fitx.hasNextLine()) {
                        String lerroa = fitx.nextLine();
                        String[] datuak = lerroa.split(";");
                        if (datuak[3].equalsIgnoreCase(nagusia)) {
                            System.out.println("- " + datuak[0]);
                            aurkitua = true;
                        }
                    }
                    fitx.close();

                    if (!aurkitua) {
                        System.out.println("Ez da langilerik aurkitu nagusi horrekin.");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Errorea: fitxategia ez da aurkitu.");
                }
            }
        }
    }
}
