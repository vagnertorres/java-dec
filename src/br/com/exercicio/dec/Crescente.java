package br.com.exercicio.dec;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero");
		int numeroUm = scanner.nextInt();

		System.out.println("Digite o segundo n�mero");
		int numeroDois = scanner.nextInt();

		System.out.println("Digite o terceiro n�mero");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm < numeroDois && numeroUm < numeroTres && numeroDois < numeroTres) {

			System.out.println("ORDEM CRESCENTE");
			System.out.println(numeroUm);
			System.out.println(numeroDois);
			System.out.println(numeroTres);

		} else if (numeroDois < numeroUm && numeroDois < numeroTres && numeroUm < numeroTres) {

			System.out.println("ORDEM CRESCENTE");
			System.out.println(numeroDois);
			System.out.println(numeroUm);
			System.out.println(numeroTres);

		} else {

			System.out.println("ORDEM CRESCENTE");
			System.out.println(numeroTres);
			System.out.println(numeroUm);
			System.out.println(numeroDois);
		}
	}
}