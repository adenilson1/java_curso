package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program03LIst {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adicionar elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// adicionar elemento numa posicao
		list.add(2, "Marco");
		System.out.println("----------Tamanho da lista--------------");

		// tamanho da lista
		System.out.println(list.size());
		
		System.out.println("------------Adicionar--------------");

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------Filtrar--------------");
		
		//FIltrar uma lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').
				collect(Collectors.toList());
		
		for (String y : result) {
			System.out.println(y);
		}
		System.out.println("---------Encontrar-----------------");
		// encontrar a primeira ocorrencia com base em predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'A').
				findFirst().orElse(null);
		
		System.out.println(name);
		
		
		System.out.println("-----------Buscar---------------");
		// buscar um elemento por posicao
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Joao"));

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------Remover---------------");
		// remover elemento da lista
		list.remove(1);

		// remover usando um predicado
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

	}

}
