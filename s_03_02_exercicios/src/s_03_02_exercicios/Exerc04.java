package s_03_02_exercicios;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal;
		System.out.println("Digite hora incial e final de um jogo");
		horaInicial  = sc.nextInt(); horaFinal = sc.nextInt(); 
		
		if(horaFinal == horaInicial) {
			System.out.printf("O JOGO DUROU %d HORA(S)", 24 - horaInicial + horaFinal);
		}else if(horaInicial > horaFinal) {
			System.out.printf("O JOGO DUROU %d HORA(S)", 24 - horaInicial + horaFinal );
		}else {
			System.out.printf("O JOGO DUROU %d HORAS(S)", horaFinal - horaInicial );
		}
		sc.close();

	}

}
