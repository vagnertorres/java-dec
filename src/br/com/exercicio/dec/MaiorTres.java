package br.com.exercicio.dec;

import java.util.Scanner;

public class MaiorTres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("entre com o primeiro número");
		int numeroUm = scanner.nextInt();

		System.out.println("entre com o segundo número");
		int numeroDois = scanner.nextInt();

		System.out.println("entre com o terceiro número");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres) {

			System.out.println("primeiro número e o maior: " + numeroUm);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres) {

			System.out.println("segundo número e o maior: " + numeroDois);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois) {

			System.out.println("terceiro número e o maior: " + numeroTres);
		}
	}
}