package application;

import java.util.Scanner;

import entities.VetorA;
import entities.VetorB;
import entities.VetorC;

public class ProgramExerc06VetorABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		VetorA[] vecta = new VetorA[n];
		VetorB[] vectb = new VetorB[n];
		VetorC[] vectc = new VetorC[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vecta.length; i++) {
			vecta[i] = new VetorA(sc.nextInt());			
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vecta.length; i++) {
			vectb[i] = new VetorB(sc.nextInt());			
		}
		
		for(int i = 0; i < vecta.length; i++) {
			vectc[i] = new VetorC(vecta[i].getNumber(), vectb[i].getNumber());
			
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vecta.length; i ++) {
			System.out.println(vectc[i].getNumber());
		}
		
		sc.close();

	}

}
