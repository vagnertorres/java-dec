package br.com.exercicio.dec;

import java.util.Scanner;

public class MaiorTres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("entre com o primeiro numero");
		int numeroUm = scanner.nextInt();

		System.out.println("entre com o segundo numero");
		int numeroDois = scanner.nextInt();

		System.out.println("entre com o terceiro numero");
		int numeroTres = scanner.nextInt();

		scanner.close();

		if (numeroUm > numeroDois && numeroUm > numeroTres) {

			System.out.println("primeiro numero e o maior: " + numeroUm);

		} else if (numeroDois > numeroUm && numeroDois > numeroTres) {

			System.out.println("segundo numero e o maior: " + numeroDois);

		} else if (numeroTres > numeroUm && numeroTres > numeroDois) {

			System.out.println("terceiro numero e o maior: " + numeroTres);
		}
	}
}