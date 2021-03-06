package Entites;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensionato[] vect = new Pensionato[10];

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("rent#" + i+ ":");
			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("email: ");
			String email = sc.nextLine();
			System.out.println("room: ");
			int room = sc.nextInt();
			vect[room] = new Pensionato(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
		sc.close();
	}

}
