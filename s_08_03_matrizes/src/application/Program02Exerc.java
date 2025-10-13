package application;

import java.util.Locale;
import java.util.Scanner;

public class Program02Exerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		// matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// imprimir matriz
//		System.out.println();
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}

		int pos = sc.nextInt();
		for (int i = 0; i < mat.length - 1; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == pos) {
					System.out.println("Position " + i + "," + j + ":");
					if (i == 0 && j == 0) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i == 0 && j > 0 && j < mat[i].length - 1) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i == 0 && j == mat[i].length - 1) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if ((i > 0 && i < mat.length - 1) && j == 0) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if ((i > 0 && i < mat.length - 1) && (j > 0 && j < mat[i].length - 1)) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if ((i > 0 && i < mat.length - 1) && j == mat[i].length - 1) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					}else if (i > 0 && (j > 0 && j < mat[i].length - 1)) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						
					}

					
				}
			}
		}

		sc.close();
	}

}
