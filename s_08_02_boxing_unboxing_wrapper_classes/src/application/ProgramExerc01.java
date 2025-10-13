package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enties.Func;

public class ProgramExerc01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many emploees will be registered? ");
		int n = sc.nextInt();

		List<Func> list = new ArrayList<>();

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			while (hasId(list, id)) {
				System.out.println("Duplicate id!!, Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Func func = new Func(id, name, salary);
			list.add(func);
			System.out.println();
		}

		System.out.print("Enter the employee id that have salary increase: ");
		int id_ = sc.nextInt();

		Func result = list.stream().filter(x -> x.getId() == id_).findFirst().orElse(null);

		if (result != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		} else {
			System.out.print("This id does not exist!");
		}

		System.out.println();
		System.out.println();
		System.out.println("List of employees: ");
		for (Func emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

	// funcao para verificar id
	public static boolean hasId(List<Func> list, int id) {
		Func emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
