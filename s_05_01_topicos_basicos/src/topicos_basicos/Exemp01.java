package topicos_basicos;

import java.util.Scanner;

public class Exemp01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int c = sc.nextInt();
		int b = sc.nextInt();

		int hegher = max(a, b, c);

		showResult(hegher);

		sc.close();

	}

	public static int max(int a,int b,int c) {
		int aux;
		if( a > b && a > c) {
			aux = a;
		}else if( b > a && b > c) {
			aux = b;
		}else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int hegher) {
		System.out.println("Hegher = " + hegher);
	}

}
