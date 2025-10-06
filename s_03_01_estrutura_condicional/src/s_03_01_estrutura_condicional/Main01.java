package s_03_01_estrutura_condicional;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora = 5;

		System.out.println("Quantos horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");

		} else {
			System.out.println("Boa noite");

		}

		sc.close();
	}

}
