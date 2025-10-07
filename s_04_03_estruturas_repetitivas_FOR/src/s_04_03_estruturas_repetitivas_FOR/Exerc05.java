package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = sc.nextInt(), fatorial = 1;

		for (int i = 0; i <=fat; i++) {
			if ((fat - i) != 0) {
				fatorial *= (fat - i);
			} else {
				fatorial *= 1;
			}

		}
		System.out.println(fatorial);
		sc.close();

	}

}
