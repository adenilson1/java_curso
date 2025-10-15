package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Alunos> lista = new ArrayList<>();

		System.out.print("Quantos alunos seão digitados? ");
		int n = sc.nextInt();
		

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println(
					"Digite o nome, primeira e segunda nota do " 
					 + (i + 1) + "o aluno");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Primeira nota: ");
			Double nota1 = sc.nextDouble();

			System.out.print("Segunda nota: ");
			Double nota2 = sc.nextDouble();

			Alunos aluno = new Alunos(name, nota1, nota2);
			lista.add(aluno);
			
			System.out.println();
		}
		
		System.out.println("Alunos aprovados:");
		for (Alunos aluno : lista) {
			if(aluno.getmedia() >= 6.0) {
				System.out.println(aluno.getName());
			}
		}

		sc.close();

	}

}
