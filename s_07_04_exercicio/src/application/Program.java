package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account conta = new Account();
		System.out.print("Enter account number: ");
		conta.setConta(sc.nextInt());
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		conta.setTitular(sc.nextLine());
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char deposit_i = sc.next().charAt(0);
		if(deposit_i == 'y') {
			System.out.print("Enter deposit value: ");
			conta.deposito(sc.nextDouble());
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.print(conta);

		sc.close();

	}

}
