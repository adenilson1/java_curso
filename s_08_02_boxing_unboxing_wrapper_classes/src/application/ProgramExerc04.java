package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enties.Rent;

public class ProgramExerc04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		System.out.println();

		List<Rent> rents = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			System.out.println("Rent #" + (i + 1) + ": ");

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			Integer room = sc.nextInt();

			while (hasRoom(rents, room)) {
				System.out.print("room occupied, choose another: ");
				room = sc.nextInt();
			}

			Rent rent = new Rent(name, email, room);
			rents.add(rent);

			System.out.println();

		}
		
		System.out.println();
		//reorganiza pelo numero do quarto em ordem crescente
		rents.sort((x1, x2) -> x1.getRoom().compareTo(x2.getRoom()));
		
		System.out.println("Busy rooms: ");
		for (Rent rent : rents) {
			System.out.println(rent);
		}

		sc.close();

	}

	public static boolean hasRoom(List<Rent> rents, int room) {
		Rent rooms = rents
				.stream()
				.filter(x -> x.getRoom() == room)
				.findFirst().orElse(null);
		
		return rooms != null;
	}

}
