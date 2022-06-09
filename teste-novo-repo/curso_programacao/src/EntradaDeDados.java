import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next(); // leitura de String
		int y;
		y = sc.nextInt(); // leitura de inteiros
		double z;
		z = sc.nextDouble();
		char d;
		d = sc.next().charAt(0);
		// System.out.println("Voce digitou: " + x +" "+ y + " " + z + " " + d);

		sc.close();
	}

// sc.close() quando não precisar mais do objeto sc 

// PARA LEITURA DE ENTRADA DE DADOS : 

	
	// nextLine(); para ler a linha toda até o usuário clicar enter
}