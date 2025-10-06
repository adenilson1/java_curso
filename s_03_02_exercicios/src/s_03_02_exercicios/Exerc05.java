package s_03_02_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int item, quantidade;
		double valorPagar = 0;

		System.out.println("ENTRADA");
		item = sc.nextInt();
		quantidade = sc.nextInt();

		if (item == 1) {
			valorPagar = (double) quantidade * 4.00;
		} else if (item == 2) {
			valorPagar = (double) quantidade * 4.50;
		} else if (item == 3) {
			valorPagar = (double) quantidade * 5.00;
		} else if (item == 4) {
			valorPagar = (double) quantidade * 2.00;
		} else if (item == 5) {
			valorPagar = (double) quantidade * 1.50;
		} else {
			System.out.println("CÓDIGO INCORRETO");
		}

		System.out.printf("Total: R$ %.2f%n", valorPagar);

		sc.close();

	}

}
