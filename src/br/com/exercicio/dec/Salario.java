package br.com.exercicio.dec;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("entre com o s�lario");
		double salario = scanner.nextDouble();

		scanner.close();

		if (salario <= 280) {

			double aumento = 20;
			double valorAumento = ((salario * aumento) / 100);
			double salarioTotal = salario + valorAumento;

			System.out.println("sal�rio anterior: " + salario);
			System.out.println("porcentagem de aumento: " + aumento);
			System.out.println("aumento no sal�rio: " + valorAumento);
			System.out.println("sal�rio atualizado: " + salarioTotal);

		} else if (salario <= 700) {

			double aumento = 15;
			double valorAumento = ((salario * aumento) / 100);
			double salarioTotal = salario + valorAumento;

			System.out.println("sal�rio anterior: " + salario);
			System.out.println("porcentagem de aumento: " + aumento);
			System.out.println("aumento no sal�rio: " + valorAumento);
			System.out.println("sal�rio atualizado: " + salarioTotal);

		} else if (salario <= 1500) {

			double aumento = 10;
			double valorAumento = ((salario * aumento) / 100);
			double salarioTotal = salario + valorAumento;

			System.out.println("sal�rio anterior: " + salario);
			System.out.println("porcentagem de aumento: " + aumento);
			System.out.println("aumento no sal�rio: " + valorAumento);
			System.out.println("sal�rio atualizado: " + salarioTotal);

		} else {

			double aumento = 5;
			double valorAumento = ((salario * aumento) / 100);
			double salarioTotal = salario + valorAumento;

			System.out.println("sal�rio anterior: " + salario);
			System.out.println("porcentagem de aumento: " + aumento);
			System.out.println("aumento no sal�rio: " + valorAumento);
			System.out.println("sal�rio atualizado: " + salarioTotal);
		}
	}
}