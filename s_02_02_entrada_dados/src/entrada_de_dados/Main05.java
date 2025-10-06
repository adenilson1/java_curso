package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.printf("Dados digitados:%n%s,%n%d,%n%.2f%n",
				x, y, z);

		sc.close();

	}

}
