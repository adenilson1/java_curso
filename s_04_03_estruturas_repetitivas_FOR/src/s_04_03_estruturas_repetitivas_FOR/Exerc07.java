package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numLinha = sc.nextInt();

		for (int i = 1; i <= numLinha; i++) {
			System.out.println(i +" "+(int)Math.pow(i, 2)+" " +(int)Math.pow(i, 3));
		}
		sc.close();

	}

}
