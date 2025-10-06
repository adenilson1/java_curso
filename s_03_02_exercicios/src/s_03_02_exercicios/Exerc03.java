package s_03_02_exercicios;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		boolean mult = false;
		
		System.out.println("ENTRADA:");
		num1 = sc.nextInt(); num2 = sc.nextInt();
		
		if(num1 < num2) {
			if(num2%num1 == 0) {
				mult = true;
			}
		}else {
			if(num1%num2 == 0) {
				mult = true;
			}
		}
		
		if(mult == true) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();

	}

}
