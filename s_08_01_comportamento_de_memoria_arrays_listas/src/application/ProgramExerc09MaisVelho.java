package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class ProgramExerc09MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		MaisVelho[] vect = new MaisVelho[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new MaisVelho(nome, idade);
		}
		
		int maisVelho = vect[0].getIdade();
		int posicao = 0;
		for(int i = 1; i < vect.length; i++) {
			if(vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
				posicao = i;
			}
		}
		
		System.out.println("A PESSOA MAIS VELHA: " 
		+ vect[posicao].getName());

	

		sc.close();

	}

}
