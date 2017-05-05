package br.com.exercicio.dec;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int numeroDois = scanner.nextInt();
		
		scanner.close();
		
		if (numeroUm > numeroDois) {
			
			System.out.println("primeiro número e o maior: " + numeroUm);
			
		} else {
			
			System.out.println("segundo número e o maior: " + numeroDois);
		}
	}
}
