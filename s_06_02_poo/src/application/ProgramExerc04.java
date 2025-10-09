package application;

import java.util.Scanner;

import entities.Palindrome;

public class ProgramExerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palindrome p = new Palindrome();
		
		System.out.print("Digite a palavra: ");
		p.word = sc.next();
		
		System.out.println();
		System.out.println(p);
		
		

		sc.close();

	}

}
