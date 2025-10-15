package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Rent> rents = new ArrayList<>();

		System.out.print("How many rooms will be rented? ");
		int num = sc.nextInt();

		System.out.println();

		for (int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1 + ":"));

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			Integer room = sc.nextInt();
			
			while(hasRoom(rents, room)) {
				System.out.print("Room occupeid, choose another: ");
				room = sc.nextInt();
			}

			Rent rent = new Rent(name, email, room);
			rents.add(rent);

			System.out.println();
		}
		
		
		rents.sort((x,y) -> x.getRoom().compareTo(y.getRoom()));
		
		System.out.println("Busy rooms:");
		for (Rent rent : rents) {
			System.out.println(rent);
		}

		sc.close();

	}
	
	public static boolean hasRoom(List<Rent> rents, Integer room) {
		Rent rooms = rents
				    .stream()
				    .filter(x->x.getRoom() == room)
				    .findFirst()
				    .orElse(null);
		
		return rooms != null;
	}

}
