package App;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		if (Login.saioaHasi()) {
			MenuNagusia.hasieratu();
		}
	}

	// Saioa hasteko metodoa (3 erabiltzaile posible)
	public static boolean saioaHasi() {
		Scanner sc = new Scanner(System.in);
		String user, pass;

		// Erabiltzaile eta pasahitzen mapa
		Map<String, String> erabiltzaileak = new HashMap<>();
		erabiltzaileak.put("imanol", "1234");
		erabiltzaileak.put("danel", "abcd");
		erabiltzaileak.put("ane", "abcd");

		boolean ondo = false;

		// Erabiltzaile eta pasahitza zuzena izan arte
		do {
			System.out.print("Erabiltzailea: ");
			user = sc.nextLine().trim().toLowerCase();
			System.out.print("Pasahitza: ");
			pass = sc.nextLine().trim();

			if (erabiltzaileak.containsKey(user) && erabiltzaileak.get(user).equals(pass)) {
				System.out.println("Ongi etorri, " + user + "!");
				ondo = true;
			} else {
				System.out.println("Erabiltzaile edo pasahitz okerra. Saiatu berriro.\n");
			}

		} while (!ondo);

		return true;
	}

	// Menu nagusia erakusten du
	public static void erakutsiMenua() {
		System.out.println("\n===== MENU NAGUSIA =====");
		System.out.println("1. Langileak");
		System.out.println("2. Bezeroak");
		System.out.println("3. Saioa Itxi");
		System.out.print("Aukeratu zenbakia: ");
	}
}
