package s_02_04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B,C;
		double pi = 3.14159;
		
		System.out.println("ENTRADA");
		A = sc.nextDouble(); B = sc.nextDouble(); C = sc.nextDouble();
		
		System.out.printf("TRINGULO: %.3f%n", A * C / 2);
		System.out.printf("CIRCULO: %.3f%n", Math.pow(C, 2) * pi);
		System.out.printf("TRAPEZIO: %.3f%n", (A + B)*C/2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(B,2));
		System.out.printf("RETANGULO: %.3f%n", A * B);
		
		sc.close();

	}

}
