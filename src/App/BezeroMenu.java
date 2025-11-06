package App;
import java.util.Scanner;

public class BezeroMenu {

    public static void erakutsi() {
        Scanner sc = new Scanner(System.in);
        int aukera;

        do {
            System.out.println("\n=== BEZEROEN MENUA ===");
            System.out.println("1. Bezeroaren kontaktuak kontsultatu");
            System.out.println("2. Faktura sortu");
            System.out.println("3. Atzera joan");
            System.out.print("Aukeratu zenbakia: ");
            aukera = sc.nextInt();
            sc.nextLine();

            if (aukera == 1) {
                System.out.print("Bezeroaren izena: ");
                String izena = sc.nextLine();
                System.out.println("Izena: " + izena);
                System.out.println("Emaila: " + izena.toLowerCase() + "@posta.com");
                System.out.println("Telefonoa: 666777888");

            } else if (aukera == 2) {
                System.out.print("Eskaera zenbakia: ");
                String eskaera = sc.nextLine();
                System.out.print("Produktua: ");
                String produktua = sc.nextLine();
                System.out.print("Kopurua: ");
                int kop = sc.nextInt();
                System.out.print("Prezio unitarioa: ");
                double prezioa = sc.nextDouble();
                sc.nextLine();

                double totala = prezioa * kop;
                System.out.println("\n==== FAKTURA ====");
                System.out.println("Eskaera: " + eskaera);
                System.out.println("Produktua: " + produktua);
                System.out.println("Kopurua: " + kop);
                System.out.printf("Totala: %.2f €\n", totala);

            } else if (aukera == 3) {
                System.out.println("Atzera bueltatzen...");
                break;
            } else {
                System.out.println("Aukera okerra.");
            }

        } while (true);
    }
}
