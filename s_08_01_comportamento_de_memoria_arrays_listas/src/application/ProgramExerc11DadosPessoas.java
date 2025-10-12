package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoas;

public class ProgramExerc11DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		DadosPessoas[] vect = new DadosPessoas[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char sexo = sc.nextLine().toUpperCase().charAt(0);

			vect[i] = new DadosPessoas(altura, sexo);
		}

		double maiorAltura = vect[0].getAltura();
		double menorAltura = vect[0].getAltura();

		for (int i = 1; i < vect.length; i++) {
			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		}

		for (int i = 1; i < vect.length; i++) {
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
		}
		
		double soma = 0.0;
		int countF = 0;
		int countM = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getSexo() == 'F') {
				soma += vect[i].getAltura();
				countF++;
			}else {
				countM++;
			}

		}

		System.out.println(maiorAltura);
		System.out.println(menorAltura);


		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas  das mulheres = %.2f%n", soma / countF);
		System.out.println("Numero de homens = " + countM);

		sc.close();

	}

}
