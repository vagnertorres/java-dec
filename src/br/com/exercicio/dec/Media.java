package br.com.exercicio.dec;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double notaUm = scanner.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double notaDois = scanner.nextDouble();
		
		double media = ((notaUm + notaDois) / 2);
		
		scanner.close();
		
		if (media >= 9 && media <= 10) {
			
			System.out.println("Conceito A");
			System.out.println("nota 1: " + notaUm);
			System.out.println("nota 2: " + notaDois);
			System.out.println("média: " + media);
			
		} else if (media >= 7.5 && media < 9) {
			
			System.out.println("Conceito B");
			System.out.println("nota 1: " + notaUm);
			System.out.println("nota 2: " + notaDois);
			System.out.println("média: " + media);
			
		} else if (media >= 6 && media < 7.5) {
			
			System.out.println("Conceito C");
			System.out.println("nota 1: " + notaUm);
			System.out.println("nota 2: " + notaDois);
			System.out.println("média: " + media);
			
		} else if (media >= 4 && media < 6) {
			
			System.out.println("Conceito D");
			System.out.println("nota 1: " + notaUm);
			System.out.println("nota 2: " + notaDois);
			System.out.println("média: " + media);
			
		} else if (media >= 0 && media < 4) {
			System.out.println("Conceito E");
			System.out.println("nota 1: " + notaUm);
			System.out.println("nota 2: " + notaDois);
			System.out.println("média: " + media);		
		}
	}
}
