package s_04_03_estruturas_repetitivas_FOR;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int testes = sc.nextInt();
		double media[];
		media = new double[testes];

		for (int i = 0; i < testes; i++) {
			double t1 = sc.nextDouble();
			double t2 = sc.nextDouble();
			double t3 = sc.nextDouble();
			media[i] = (t1 * 2 + t2 * 3 + t3 * 5) / (2 + 3 + 5);
		}

		for (int i = 0; i < testes; i++) {
			System.out.printf("%.1f%n", media[i]);
		}

		sc.close();

	}

}
