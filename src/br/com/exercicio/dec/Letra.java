package br.com.exercicio.dec;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o seu sexo: M ou F");
		String letra = scanner.next();
		
		scanner.close();
		
		if (letra.equalsIgnoreCase("m")) {
			
			System.out.println("Masculino");
			
		} else if (letra.equalsIgnoreCase("f")) {
			
			System.out.println("Feminino");
			
		} else {
			System.out.println("Sexo inválido");
		}
	}
}
