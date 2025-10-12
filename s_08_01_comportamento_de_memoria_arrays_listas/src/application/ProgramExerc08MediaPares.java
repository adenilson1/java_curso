package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaPares;

public class ProgramExerc08MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		MediaPares[] vect = new MediaPares[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new MediaPares(sc.nextInt());
		}
		
		double soma = 0;
		boolean verif = false;
		int aux = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber()%2 == 0) {
				soma += vect[i].getNumber();
				aux++;
				verif = true;
			}
		}
		
		if(verif == true) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", soma/aux);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();

	}

}
