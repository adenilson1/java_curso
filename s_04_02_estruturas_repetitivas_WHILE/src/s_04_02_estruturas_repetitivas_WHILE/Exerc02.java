package s_04_02_estruturas_repetitivas_WHILE;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as coordenadas X e Y\n");
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro\n");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo\n");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro\n");
			} else {
				System.out.println("quarto\n");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}
