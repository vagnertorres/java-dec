package br.com.exercicio.dec;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		int numeroUm = scanner.nextInt();

		System.out.println("Digite o segundo número");
		int numeroDois = scanner.nextInt();

		System.out.println("Digite o terceiro número");
		int numeroTres = scanner.nextInt();

		scanner.close();
		
		if (numeroUm < numeroDois && numeroUm < numeroTres & numeroDois < numeroTres) {
			
			System.out.println(numeroUm);
			System.out.println(numeroDois);
			System.out.println(numeroTres);
			
		} else if (numeroDois < numeroUm && numeroDois < numeroTres && numeroUm < numeroTres) {
			
			System.out.println(numeroDois);
			System.out.println(numeroUm);
			System.out.println(numeroTres);
			
		} else if (numeroTres < numeroUm && numeroTres < numeroDois && numeroUm < numeroDois) {
			
			System.out.println(numeroTres);
			System.out.println(numeroUm);
			System.out.println(numeroDois);
			
		} else {
			
			System.out.println(numeroTres);
			System.out.println(numeroDois);
			System.out.println(numeroUm);
		}
	}
}