package br.com.exercicio.dec;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o pre�o do primeiro produto");
		double produtoUm = scanner.nextDouble();

		System.out.println("digite o pre�o do segundo produto");
		double produtoDois = scanner.nextDouble();

		System.out.println("digite o pre�o do terceiro produto");
		double produtoTres = scanner.nextDouble();

		scanner.close();

		if (produtoUm < produtoDois && produtoUm < produtoTres) {

			System.out.println("primeiro produto � o mais barato, com o pre�o de: " + produtoUm);

		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {

			System.out.println("segundo produto � o mais barato, com o pre�o de: " + produtoDois);

		} else if (produtoTres < produtoUm && produtoTres < produtoDois) {

			System.out.println("terceiro produto � o mais barato, com o pre�o de: " + produtoTres);
		}
	}
}