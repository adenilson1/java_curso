package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoDaMedia;

public class ProgramExerc07AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		AbaixoDaMedia[] vect = new AbaixoDaMedia[n];

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new AbaixoDaMedia(sc.nextDouble());
			soma += vect[i].getNumber();
		}

		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", soma / vect.length);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() < soma / vect.length)
				System.out.printf("%.1f%n", vect[i].getNumber());
		}

		sc.close();

	}

}
