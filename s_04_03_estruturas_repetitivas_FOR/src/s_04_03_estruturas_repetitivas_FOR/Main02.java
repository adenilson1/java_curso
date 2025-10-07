package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println("------------------------------------");
		//regressiva
		
		for(int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		sc.close();

	}

}
