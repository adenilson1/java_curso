package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class ProgramExerc03Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double soma = 0.0;
		int cont = 0;
		Alturas[] vect = new Alturas[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Alturas(name, idade, altura);
		}

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				cont++;
			}
		}

		System.out.println();
		System.out.printf("Altura média: %.2f%n", soma / vect.length);
		
		System.out.printf(
				"Pessoa com menos de 16 anos: %.1f%% %n", cont*100.0/vect.length
				);
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}

		}
		sc.close();

	}

}
