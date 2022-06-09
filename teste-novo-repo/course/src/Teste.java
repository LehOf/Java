import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota nota = new Nota();
		
		nota.nome = sc.nextLine();
		nota.np1 = sc.nextDouble();
		nota.np2 = sc.nextDouble();
		nota.np3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n" , nota.media());
		
		if (nota.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", nota.Aprovacao());
		}else {
			System.out.println("PASS");
		}
		
		

	}

}
