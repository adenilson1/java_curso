package application;

import java.util.Locale;
import java.util.Scanner;


import entities.MaiorPosicao;

public class ProgramExerc05MaiorNumero {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		MaiorPosicao[] vect = new MaiorPosicao[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new MaiorPosicao(sc.nextDouble());
		}
		
		double maiorPosicao = vect[0].getNumber();
		int posicao = 0;
		
		for(int i = 1; i < vect.length; i++) {
			if(vect[i].getNumber() > maiorPosicao) {
				maiorPosicao = vect[i].getNumber();
				posicao = i;
			}
	
		}
		
		System.out.println(
				"MAIOR VALOR = " + maiorPosicao
				);
		System.out.println(
				"POSICAO DO MAIOR VALOR = " + posicao
				);
		
		sc.close();

	}

}
