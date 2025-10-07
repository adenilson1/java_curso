package s_04_02_estruturas_repetitivas_WHILE;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;

		System.out.print("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();

	}

}
