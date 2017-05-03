package br.com.exercicio.dec;

import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com uma letra");
		String letra = scanner.next();
		
		scanner.close();
		
		switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			System.out.println("vogal");
			break;
		default:
			System.out.println("consoante");
			break;
		}
	}
}
