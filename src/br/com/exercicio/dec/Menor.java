package br.com.exercicio.dec;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		int numeroUm = scanner.nextInt();

		System.out.println("Entre com o segundo numero");
		int numeroDois = scanner.nextInt();

		System.out.println("Entre com o terceiro numero");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) {

			System.out.println("primeiro numero e o maior: " + numeroUm);
			System.out.println("terceiro numero e o menor: " + numeroTres);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {

			System.out.println("segundo numero e o maior: " + numeroDois);
			System.out.println("segundo numero e o menor: " + numeroUm);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {

			System.out.println("terceiro numero e o maior: " + numeroTres);
			System.out.println("segundo numero e menor: " + numeroDois);
		}
	}
}