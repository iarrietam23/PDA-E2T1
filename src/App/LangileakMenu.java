package App;
import java.util.Scanner;

public class LangileakMenu {

    // Langileen menua erakusteko metodoa
    public static void erakutsi() {
        Scanner sc = new Scanner(System.in);
        int aukera;

        do {
            System.out.println("\n=== LANGILEEN MENUA ===");
            System.out.println("1. Langile baten informazioa kontsultatu");
            System.out.println("2. Nagusi baten langileen zerrenda erakutsi");
            System.out.println("3. Atzera joan");
            System.out.print("Aukeratu zenbakia: ");

            while (!sc.hasNextInt()) {
                System.out.print("Zenbaki bat idatzi mesedez: ");
                sc.next();
            }
            aukera = sc.nextInt();
            sc.nextLine(); // salto de línea garbitu

            switch (aukera) {
                case 1:
                    System.out.println("\n>> Langile baten informazioa kontsultatzen...");
                    // hemen fitxategitik edo datu faltsu batzuk erabil daitezke
                    break;
                case 2:
                    System.out.println("\n>> Nagusi baten langileen zerrenda erakusten...");
                    // hemen beste metodo bat deitu liteke datuak erakusteko
                    break;
                case 3:
                    System.out.println("Atzera bueltatzen...");
                    return; // menura bueltatu
                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
                    break;
            }

        } while (true);
    }
}

