package application;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.random.RandomGenerator.LeapableGenerator;

public class Program03Exerc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		// gerando a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		System.out.println("Matriz " + M + "x" + N + "\n");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.print("Digite o valor: ");
		int pos = sc.nextInt();

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == pos) {
					System.out.println("Position " + i + "," + j);

					if (i == 0 && j == 0) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i == 0 && j == mat[i].length - 1) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i == 0 && (j > 0 && j < mat[i].length - 1)) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i > 0 && j == 0) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i > 0 && (j > 0 && j < mat[i].length - 1)) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if (i > 0 && j == mat[i].length - 1) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else if ((i == mat.length - 1) && j == 0) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);

					} else if ((i == mat.length - 1) && (j > 0 && j < mat[i].length - 1)) {
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);

					} else if ((i == mat.length-1) && (j == mat[i].length-1)) {
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("Up: " + mat[i - 1][j]);

					}
				}

			}
		}
		sc.close();

	}

}
