package s_03_02_exercicios;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		sc.close();

	}

}
