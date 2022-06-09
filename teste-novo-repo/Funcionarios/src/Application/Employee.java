package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ss.Dados;

public class Employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Dados> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			while (hasId(list, id)) {
				System.out.println("This id does not exist! ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(new Dados(id, name, salary));
		}
		// PARTE - 2
		for (Dados x : list) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		Dados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist! ");
		} else {
			System.out.println("Enter the percentage: ");
			double porcentagem = sc.nextInt();
			emp.Salary(porcentagem);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Dados x : list) {
			System.out.println(x);
		}

		sc.close();
	}

	private static boolean hasId(List<Dados> list, int id) {
		return false;
	}

}
