package s_03_02_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, aux1 = 0, aux2 = 0, aux3 = 0;
		
		System.out.println("Digite o salario");
		salario = sc.nextDouble();
		
		if(salario >= 0.00 && salario <=2000.00) {
			System.out.println("Insento");
		}else if(salario > 2000.00 && salario <= 3000.00) {
			aux1 = (salario - 2000.00)*8/100;
			System.out.printf("R$ %.2f%n", aux1);
		}else if(salario > 3000.00 && salario <= 4500.00) {
			aux1 = (salario - 3000.00)*18/100;
			aux2 = ((salario - 2000.00)-(salario - 3000.00))*8/100;
			System.out.printf("R$ %.2f%n", aux1+aux2 );
		}else {
			aux1 = (salario - 4500.00)*28/100;
			aux2 = ((salario - 3000.00) - (salario - 4500.00))*18/100;
			aux3 = ((salario - 2000.00) - (salario - 3000.00))*8/100;
			System.out.printf("R$ %.2f%n", aux1+aux2+aux3 );
		}
		sc.close();

	}

}
