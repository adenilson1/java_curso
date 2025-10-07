package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		if (X >= 1 && X <= 1000) {
			for (int i = 0; i < X; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("FORA DO INTERVALO");
		}

		sc.close();

	}

}
