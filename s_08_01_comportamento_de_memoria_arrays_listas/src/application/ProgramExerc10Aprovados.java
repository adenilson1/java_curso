package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aprovados;

public class ProgramExerc10Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Aprovados[] vect = new Aprovados[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");

			String nome = sc.next();
			sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();

			vect[i] = new Aprovados(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if ((vect[i].getNota1() + vect[i].getNota2()) / 2 >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();

	}

}
