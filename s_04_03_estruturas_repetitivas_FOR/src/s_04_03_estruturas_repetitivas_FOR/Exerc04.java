package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double resultado[];
		resultado = new double[N];

		for (int i = 0; i < N; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if (n2 == 0) {
				resultado[i] = -1;
			} else {
				resultado[i] = (double) n1 / n2;
			}

		}
		for (int i = 0; i < N; i++) {
			if (resultado[i] != -1) {
				System.out.printf("%.1f%n", resultado[i]);

			} else {
				System.out.println("Divisão Impossível");

			}
		}

		sc.close();

	}

}
