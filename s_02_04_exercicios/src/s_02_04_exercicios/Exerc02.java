package s_02_04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio, area;
		System.out.println("Digite o valor do raio");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2.0) * pi;
		System.out.printf("Area do circulo %.4f%n", area);
		
		
		
		sc.close();

	}

}
