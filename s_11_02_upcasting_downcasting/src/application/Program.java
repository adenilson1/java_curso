package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SalvingAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc = new Account(1001, "ALex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SalvingAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// erro: BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		
		if(acc3 instanceof SalvingAccount) {
			SalvingAccount acc5 = (SalvingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}

	}

}
