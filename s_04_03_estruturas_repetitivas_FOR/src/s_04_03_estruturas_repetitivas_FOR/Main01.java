package s_04_03_estruturas_repetitivas_FOR;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0 , N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();

	}

}
