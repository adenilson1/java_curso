package s_02_04_exercicios;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		System.out.println("Digite 4 valores inteiros");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		System.out.println("DIFERENÇA = " + (A * B - C * D));
		sc.close();

	}

}
