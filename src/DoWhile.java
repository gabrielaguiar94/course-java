import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Forma errada

//		System.out.print("Digite a temperatura em Celsius: ");
//		double C = sc.nextDouble();
//		double F = 9.0 * C / 5.0 + 32.0;
//		System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
//		System.out.print("Deseja repetit (s/n)? ");
//		char resp = sc.next().charAt(0);
//
//		while (resp != 'n') {
//			System.out.print("Digite a temperatura em Celsius: ");
//			C = sc.nextDouble();
//			F = 9.0 * C / 5.0 + 32.0;
//			System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
//			System.out.print("Deseja repetit (s/n)? ");
//			resp = sc.next().charAt(0);
//		}

		// Forma 'correta'

//		char resp = 's';
//		
//		while(resp != 'n') {
//			System.out.print("Digite a temperatura em Celsius: ");
//			double C = sc.nextDouble();
//			double F = 9.0 * C / 5.0 + 32.0;
//			System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
//			System.out.print("Deseja repetit (s/n)? ");
//			resp = sc.next().charAt(0);
//		}

		// Forma com Do While

		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetit (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();
	}

}