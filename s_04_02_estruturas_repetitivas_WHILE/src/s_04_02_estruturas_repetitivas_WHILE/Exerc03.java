package s_04_02_estruturas_repetitivas_WHILE;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, contA = 0, contG = 0, contD = 0;
		System.out.println("PESQUISA: QUAL É O MELHOR COMBUSTIVEL ?");
		System.out.println("1 - ÁLCOOL | 2 - GASOLINA | 3 - DIESEL | 4 - FIM");
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		System.out.println();

		while (opcao != 4) {
			switch (opcao) {
			case 1: {
				contA += 1;
				break;
			}
			case 2: {
				contG += 1;
				break;
			}
			case 3: {
				contD += 1;
				break;
			}
			default:
				System.out.println("Escolha uma opção válida\n");

			}
			System.out.println("1 - ÁLCOOL | 2 - GASOLINA | 3 - DIESEL | 4 - FIM");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			System.out.println();
		}
		System.out.println();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contA);
		System.out.println("Gasolina: " + contG);
		System.out.println("Diesel: " + contD);
		sc.close();

	}

}
