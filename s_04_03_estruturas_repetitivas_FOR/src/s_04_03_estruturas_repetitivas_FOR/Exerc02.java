package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contIn = 0, contOut = 0, X = sc.nextInt();

		for (int i = 0; i < X; i++) {
			int N = sc.nextInt();
			if (N >= 10 && N <= 20) {
				contIn++;
			} else {
				contOut++;
			}
		}
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");

		sc.close();

	}

}
