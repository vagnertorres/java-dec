package br.com.exercicio.dec;

import java.util.Scanner;

public class Positivo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int numeroUm = scanner.nextInt();
		
		scanner.close();
		
		if (numeroUm >= 0) {
			
			System.out.println("N�mero positivo");
			
		} else {
			
			System.out.println("N�mero Negativo");
		}
	}
}
