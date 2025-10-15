package application;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

import entities.DadosPessoas;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<DadosPessoas> dados = new ArrayList<>();

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			Double altura = sc.nextDouble();

			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			String sexo = sc.next().toUpperCase();

			DadosPessoas dp = new DadosPessoas(altura, sexo);
			dados.add(dp);
			sc.nextLine();

		}

		System.out.println();

		Optional<DadosPessoas> menorNumero= dados
									  .stream()
									  .min(Comparator.comparing(DadosPessoas::getAltura));

		Optional<DadosPessoas> maiorNumero = dados
									  .stream()
									  .max(Comparator.comparing(DadosPessoas::getAltura));

		System.out.println("Menor altura: " + menorNumero.get().getAltura());
		System.out.println("Maior altura: " + maiorNumero.get().getAltura());
		
		
		int contF = 0;
		int contM = 0;

		
		for (DadosPessoas dado : dados) {
			
			if(dado.getSexo().charAt(0) == 'F') {
				contF++;
			}else {
				contM++;
			}
		}
		
		System.out.printf("Media das alturas das mulheres = %.2f%n",
				          dados.get(0).getSoma()/contF);
		System.out.print("Numero de homens = " + contM);
	
		
		sc.close();

	}

}
