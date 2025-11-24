package App;
import java.util.*;

public class Login {

    // Saioa hasteko metodoa (3 erabiltzaile posible)
    public static boolean saioaHasi() {
        Scanner sc = new Scanner(System.in);
        String user, pass;

        // Erabiltzaileak eta pasahitzak
        Map<String, String> erabiltzaileak = new HashMap<>();
        erabiltzaileak.put("imanol", "1234");
        erabiltzaileak.put("ane", "abcd");
        erabiltzaileak.put("danel", "9999");

        boolean ondo = false;
        

        // Erabiltzaile eta pasahitza zuzena izan arte
        do {
            System.out.print("Erabiltzailea: ");
            user = sc.nextLine().trim().toLowerCase();
            System.out.print("Pasahitza: ");
            pass = sc.nextLine().trim();

            if (erabiltzaileak.containsKey(user) && erabiltzaileak.get(user).equals(pass)) {
                System.out.println("\nOngi etorri, " + user + "!\n");
                ondo = true;
            } else {
                System.out.println("Erabiltzaile edo pasahitz okerra. Saiatu berriro.\n");
            }
        } while (!ondo);

        return true;
    }
}
