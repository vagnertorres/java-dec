package br.com.exercicio.dec;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero");
		int numeroUm = scanner.nextInt();

		System.out.println("Entre com o segundo n�mero");
		int numeroDois = scanner.nextInt();

		System.out.println("Entre com o terceiro n�mero");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) {

			System.out.println("primeiro n�mero � o maior: " + numeroUm);
			System.out.println("terceiro n�mero � o menor: " + numeroTres);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {

			System.out.println("segundo n�mero � o maior: " + numeroDois);
			System.out.println("segundo n�mero � o menor: " + numeroUm);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {

			System.out.println("terceiro n�mero � o maior: " + numeroTres);
			System.out.println("segundo n�mero � menor: " + numeroDois);
		}
	}
}