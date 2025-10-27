package App;
import java.util.Scanner;

public class Main {
	
	/**
	 * Programa hemendik hasten da
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, pass;

        do {
            System.out.print("Erabiltzailea: ");
            user = sc.nextLine();
            System.out.print("Pasahitza: ");
            pass = sc.nextLine();

            if (user.equals("imanol") && pass.equals("1234")) {
                System.out.println("Ongi etorri!");
                break;
            
            } else {
                System.out.println("Erabiltzaile edo pasahitz okerra. Saiatu berriro.");
            }
        } while (true);

        // Aurrerantzean menua erakutsi
        erakutsiMenua();
    }

    /**
     * Menua bistaratu Kontsolatik
     */
    static void erakutsiMenua() {
        System.out.println("===== MENU NAGUSIA =====");
        System.out.println("1. Langileak");
        System.out.println("2. Bezeroak");
        System.out.println("3. Saioa Itxi");
    }
}

