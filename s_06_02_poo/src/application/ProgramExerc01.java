package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramExerc01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectagle = new entities.Rectangle();

		System.out.println("Enter rectangle width and height:");
		rectagle.width = sc.nextDouble();
		rectagle.height = sc.nextDouble();

		System.out.println();
		System.out.println(rectagle);
		sc.close();

	}

}
