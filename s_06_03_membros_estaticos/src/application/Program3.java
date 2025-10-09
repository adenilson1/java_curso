package application;

import java.util.Locale;
import java.util.Scanner;

import util.Palindrome;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter word: ");
		boolean palindrome = Palindrome.isPalindorme(sc.nextLine());
		
		if(palindrome == true) {
			System.out.println("IS PALINDROME");
		}else {
			System.out.println("IS NOT PALINDROME");
		}
		
		sc.close();

	}

}
