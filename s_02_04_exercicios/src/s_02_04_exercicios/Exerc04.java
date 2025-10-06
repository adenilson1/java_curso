package s_02_04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroFunc, horaTrabalhadas;
		double valorHora, salario;

		System.out.print("Digite o numero do funcionario: ");
		numeroFunc = sc.nextInt();

		System.out.print("Digite o hora trabalhada: ");
		horaTrabalhadas = sc.nextInt();

		System.out.print("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();

		salario = (double) horaTrabalhadas * valorHora;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",
				numeroFunc, salario);

		sc.close();

	}

}
