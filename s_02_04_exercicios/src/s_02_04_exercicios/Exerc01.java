package s_02_04_exercicios;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, soma;
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
