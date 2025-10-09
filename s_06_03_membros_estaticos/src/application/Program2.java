package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorStatic;

public class Program2 {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorStatic.circunference(radius);
		
		double v = CalculatorStatic.volume(radius);
		
		System.out.printf("Cirunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorStatic.PI);
		
		
		sc.close();

	}
	
	

}











