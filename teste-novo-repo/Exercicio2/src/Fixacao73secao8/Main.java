package Fixacao73secao8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();	
		System.out.print("How many dollars will be bought? ");
		double compra  = sc.nextDouble();
		System.out.print("Amount to be paid in reais? ");
		System.out.printf("%.2f%n", CurrencyConverter.valorReais(dollar, compra));	
		
		
		sc.close();

	}

}
