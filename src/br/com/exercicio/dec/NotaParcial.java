package br.com.exercicio.dec;

import java.util.Scanner;

public class NotaParcial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double notaUm = scanner.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double notaDois = scanner.nextDouble();
		
		scanner.close();
		
		double mediaFinal = ((notaUm + notaDois) / 2);
		
		if (mediaFinal >= 7 && mediaFinal < 10) {
			
			System.out.println("Aprovado");

		} else if (mediaFinal == 10) {
			
			System.out.println("Aprovado com Distinção");
			
		} else {
			System.out.println("reprovado");
		}	
	}
}
