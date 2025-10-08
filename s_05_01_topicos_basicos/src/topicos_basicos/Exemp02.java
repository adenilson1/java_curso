package topicos_basicos;

import java.util.Scanner;

public class Exemp02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra");
		String palavra = sc.next();
		
		boolean palindromo = verifica(palavra);
		
		showResp(palindromo);
		
		sc.close();

	}
	
	public static boolean verifica(String palavra) {
		boolean isPalidromo = true;
		
		for ( int i = 0, j = palavra.length()-1; i < j; i++, j--) {
			if(palavra.charAt(i) != palavra.charAt(j)) {
				isPalidromo = false;
			}
		}
		return isPalidromo;
	}
	
	public static void showResp(boolean p) {
		if (p == true) {
			System.out.println("PALIDROMO");
		}else {
			System.out.println("NÃO É PALINDROMO");
		}
	}

}
