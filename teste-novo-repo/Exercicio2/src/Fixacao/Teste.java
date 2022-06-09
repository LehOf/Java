package Fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria account;

		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);

		if (escolha == 'y') {
			System.out.println("Enter initial deposit value: ");
			double inicialDeposito = sc.nextDouble();
			account = new ContaBancaria(nome, numeroConta, inicialDeposito);
		} else {
			account = new ContaBancaria(nome, numeroConta);
		}

		System.out.println(" ");
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println(" ");
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		account.deposit(deposito);
		System.out.println(account);
		System.out.println(" ");
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		account.withdraw(saque);
		System.out.println(account);
		
		
		

		sc.close();

	}

}
