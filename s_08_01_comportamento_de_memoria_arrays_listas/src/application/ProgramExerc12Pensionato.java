package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExerc12Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?  ");
		int n = sc.nextInt();

		String[] names = new String[n];
		String[] emails = new String[n];
		int[] rooms = new int[10];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1) + ": ");
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("Email: ");
			emails[i] = sc.nextLine();
			System.out.print("Room: ");
			rooms[i] = sc.nextInt();

		}
		
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1- i ; j++) {
				if(rooms[j] > rooms[j+1]) {
					int aux = rooms[j];
					rooms[j] = rooms[j+1];
					rooms[j+1] = aux;
					
					String aux1 = names[j];
					names[j] = names[j+1];
					names[j+1] = aux1;
					
					String aux2 = emails[j];
					emails[j] = emails[j+1];
					emails[j+1] = aux2;
					
				}
			}
			
		}
		
		System.out.println("Busy rooms:");
		for(int  i = 0; i < n; i++) {
			if(rooms[i] != 0) {
				System.out.println(
						  rooms[i] 
						+ ": " 
					    + names[i]
				        + ", "
				        + emails[i]);
			}
		}
		
	

		sc.close();
	}
}
