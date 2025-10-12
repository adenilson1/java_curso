package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SomaVetor;

public class ProgramExerc02SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma = 0.0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int number = sc.nextInt();

		SomaVetor[] vect = new SomaVetor[number];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new SomaVetor(sc.nextDouble());
		}
		System.out.println();
		System.out.print("VALORES = ");
		for (int j = 0; j < vect.length; j++) {
			System.out.print(vect[j].getNumber() + "  ");
			soma += vect[j].getNumber();
		}

		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", soma / vect.length);

		sc.close();

	}

}
