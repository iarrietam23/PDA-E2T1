package App;
import java.util.Scanner;

public class MenuNagusia {

    // Metodo nagusia menua erakusteko
    public static void hasieratu() {
        Scanner sc = new Scanner(System.in);
        int aukera;

        do {
            // Menu nagusia
            System.out.println("\n===== MENU NAGUSIA =====");
            System.out.println("1. Langileak");
            System.out.println("2. Bezeroak");
            System.out.println("3. Saioa Itxi");
            System.out.print("Aukeratu zenbakia: ");

            // Balio zuzena dela egiaztatu
            while (!sc.hasNextInt()) {
                System.out.print("Zenbaki bat idatzi mesedez: ");
                sc.next();
            }
            aukera = sc.nextInt();
            sc.nextLine(); // salto de línea garbitu

            switch (aukera) {
                case 1:
                	LangileakMenu.erakutsi(); 
                    break;
                case 2:
                	BezeroMenu.erakutsi();
                    break;
                case 3:
                    System.out.print("Ziur saioa itxi nahi duzula? (B/E): ");
                    String erantzuna = sc.nextLine().trim().toLowerCase();
                    if (erantzuna.equals("B")) {
                        System.out.println("Saioa itxita. Agur!");
                        return; // irten programatik
                    }
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriro.\n");
                    break;
            }

        } while (true);
       
    }
}
