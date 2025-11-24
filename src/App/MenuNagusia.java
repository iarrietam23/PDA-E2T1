package App;
import java.util.Scanner;

public class MenuNagusia {

    public static void hasieratu() {
        Scanner sc = new Scanner(System.in);
        int aukera = 0;

        erakutsiLogoa(); // erakutsi logotipoa

        while (aukera != 3) {
            System.out.println("\n=== MENUA NAGUSIA ===");
            System.out.println("1. Langileak");
            System.out.println("2. Bezeroak");
            System.out.println("3. Saioa itxi");
            System.out.print("Aukeratu: ");
            aukera = sc.nextInt();
            sc.nextLine(); // enter garbitzeko

            if (aukera == 1) {
                LangileakMenu.erakutsi();
            } 
            else if (aukera == 2) {
                BezeroMenu.erakutsi();
            } 
            else if (aukera == 3) {
                System.out.print("Ziur zaude saioa itxi nahi duzula? (bai/ez): ");
                String erantzuna = sc.nextLine();
                if (erantzuna.equalsIgnoreCase("bai")) {
                    System.out.println("Saioa itxita. Agur!");
                    
                    break;
                }
            }
        }
    }

    // Logotipoa erakusten du
    public static void erakutsiLogoa() {

        // --- ROMBO SUPERIOR ---
        int altura = 4;
        int ancho = 7;

        // Parte superior
        for (int i = 0; i < altura; i++) {

            // espacios
            for (int esp = 0; esp < i; esp++) {
                System.out.print(" ");
            }

            // estrellas
            for (int ast = 0; ast < ancho - (2 * i); ast++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior
        for (int i = altura - 2; i >= 0; i--) {

            for (int esp = 0; esp < i; esp++) {
                System.out.print(" ");
            }

            for (int ast = 0; ast < ancho - (2 * i); ast++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // --- PALO VERTICAL (3 líneas de una sola estrella centrada) ---
        for (int i = 0; i < 3; i++) {
            System.out.println("   *");
        }

        // --- ROMBO HUECO (cuadrado hueco con altura 5) ---
        int h = 5;

    }
    
}