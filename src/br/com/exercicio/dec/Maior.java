package br.com.exercicio.dec;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		int numeroDois = scanner.nextInt();
		
		scanner.close();
		
		if (numeroUm > numeroDois) {
			
			System.out.println("primeiro n�mero � o maior: " + numeroUm);
			
		} else {
			
			System.out.println("segundo n�mero � o maior: " + numeroDois);
		}
	}
}
