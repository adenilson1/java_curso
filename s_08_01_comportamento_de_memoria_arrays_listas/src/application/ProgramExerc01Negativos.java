package application;

import java.util.Scanner;

import entities.Negativos;

public class ProgramExerc01Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		boolean v = false;
		while (v != true) {
			System.out.print("Quanto numeros voce vai digiatar? ");
			n = sc.nextInt();
			if (n >= 1 && n <= 10) {
				v = true;
			} else {
				System.out.println();
				System.out.println("digite um numero de 1 a 10");
				v = false;
			}
		}
		Negativos[] vect = new Negativos[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new Negativos(sc.nextInt());
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int j = 0; j < vect.length; j++) {
			if(vect[j].getNumber() < 0) {
				System.out.println(vect[j].getNumber());
			}
		}
		sc.close();

	}

}
