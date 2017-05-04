package br.com.exercicio.dec;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");
		int numeroUm = scanner.nextInt();

		System.out.println("Entre com o segundo número");
		int numeroDois = scanner.nextInt();

		System.out.println("Entre com o terceiro número");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) {

			System.out.println("primeiro número é o maior: " + numeroUm);
			System.out.println("terceiro número é o menor: " + numeroTres);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {

			System.out.println("segundo número é o maior: " + numeroDois);
			System.out.println("segundo número é o menor: " + numeroUm);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {

			System.out.println("terceiro número é o maior: " + numeroTres);
			System.out.println("segundo número é menor: " + numeroDois);
		}
	}
}