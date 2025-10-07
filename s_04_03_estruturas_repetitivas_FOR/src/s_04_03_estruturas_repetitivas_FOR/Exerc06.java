package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
