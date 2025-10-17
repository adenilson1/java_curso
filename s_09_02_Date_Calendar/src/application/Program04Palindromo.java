package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04Palindromo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a palavra: ");
		String palavra = sc.nextLine();

		if (hasPalindromo(palavra)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NÃO PALINDROME");
		}

		sc.close();

	}

	public static boolean hasPalindromo(String palavra) {
		boolean resul = true;
		for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {
			if (palavra.charAt(i) != palavra.charAt(j)) {
				resul = false;
			}
		}
		return resul;
	}

}
