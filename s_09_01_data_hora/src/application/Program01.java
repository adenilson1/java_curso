package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Program01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Alturas> listas = new ArrayList<>();

		System.out.print("Quantas pessoas serão digitadas? ");

		int n = sc.nextInt();
		double soma = 0.0;
		Integer cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessa: ");

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			Integer idade = sc.nextInt();

			System.out.print("Altura: ");
			Double altura = sc.nextDouble();

			Alturas alt = new Alturas(name, idade, altura);
			listas.add(alt);

			System.out.println();
			soma += altura;
		}

		System.out.printf("Altura média: %.2f%n", soma / n);

		for (Alturas altura : listas) {
			if (altura.getIdade() < 16) {
				cont++;
			}
		}

		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", cont * 100.0 / n);
		for (Alturas altura : listas) {
			if (altura.getIdade() < 16) {
				System.out.println(altura.getName());
			}
		}

		sc.close();

	}

}
