package application;

import java.util.Scanner;

import entities.NumerosPares;

public class programExerc04NumeroPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		NumerosPares[] vect = new NumerosPares[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new NumerosPares(sc.nextInt());
		}
		int count = 0;
		System.out.println();
		System.out.println("NUMEROS PARES");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
				count++;
				System.out.print(vect[i].getNumber() + " ");
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + count);

		sc.close();

	}

}
