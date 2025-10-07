package s_04_02_estruturas_repetitivas_WHILE;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, numero = sc.nextInt();
		
		while(numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();

	}

}
