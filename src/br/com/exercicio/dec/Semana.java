package br.com.exercicio.dec;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Entre com o dia correspondente da semana");
		int numeroDia = scanner.nextInt();
		
		scanner.close();
		
		if (numeroDia == 1) {
			
			System.out.println("Domingo");
			
		} else if (numeroDia == 2) {
			
			System.out.println("Segunda");
			
		} else if (numeroDia == 3) {
			
			System.out.println("Terça");
			
		} else if (numeroDia == 4) {
			
			System.out.println("Quarta");
			
		} else if (numeroDia == 5) {
			
			System.out.println("Quinta");
			
		} else if (numeroDia == 6) {
			
			System.out.println("Sexta");
			
		} else if (numeroDia == 7) {
			
			System.out.println("Sábado");
			
		} else {
			
			System.out.println("Inválido");
			
		}
	}
}
