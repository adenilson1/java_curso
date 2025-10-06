package s_03_03_sintaxe_opcional_switch_case;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;

		System.out.println("Digite um nomero inteiro entre 1 a 7");
		dia = sc.nextInt();

		switch (dia) {
		case 1: {

			System.out.println("DOMINGO");
			break;
		}
		case 2: {
			System.out.println("SEGUNDA");
			break;
		}
		case 3: {
			System.out.println("TERÇA");
			break;
		}
		case 4: {
			System.out.println("QUARTA");
			break;
		}
		case 5: {
			System.out.println("QUINTA");
			break;
		}
		case 6: {
			System.out.println("SEXTA");
			break;
		}
		case 7: {
			System.out.println("SABÁDO");
			break;
		}
		default:
			System.out.println("Valor incorreto");
			break;
		}
		sc.close();

	}

}
