package s_02_04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo1, codigo2, quantidade1, quantidade2;
		double valorUnitario1, valorUnitario2, valorPagar;
		
		System.out.println("ENTRADA: ");
		codigo1 = sc.nextInt(); quantidade1 = sc.nextInt(); valorUnitario1 = sc.nextDouble();
		codigo2 = sc.nextInt(); quantidade2 = sc.nextInt(); valorUnitario2 = sc.nextDouble();
		
		valorPagar = (double) quantidade1 * valorUnitario1 + quantidade2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		sc.close();

	}

}
