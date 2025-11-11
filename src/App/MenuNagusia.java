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
    private static void erakutsiLogoa() {
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println("   *       ");
        System.out.println("  *  *    ");
        System.out.println(" *    *      ");
        System.out.println("*      *       ");
        System.out.println("********");
        System.out.println("    *     ");
        System.out.println("    *     ");
        System.out.println("    *     ");
        System.out.println("********");
        System.out.println("   *       ");
        System.out.println("  *  *    ");
        System.out.println(" *    *      ");
        System.out.println("*      *       ");
    }
}
