package br.com.exercicio.dec;

import java.util.Scanner;

public class MaiorTres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("entre com o primeiro n�mero");
		int numeroUm = scanner.nextInt();

		System.out.println("entre com o segundo n�mero");
		int numeroDois = scanner.nextInt();

		System.out.println("entre com o terceiro n�mero");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres) {

			System.out.println("primeiro n�mero e o maior: " + numeroUm);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres) {

			System.out.println("segundo n�mero e o maior: " + numeroDois);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois) {

			System.out.println("terceiro n�mero e o maior: " + numeroTres);
		}
	}
}