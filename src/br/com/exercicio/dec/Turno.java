package br.com.exercicio.dec;

import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma letra que representa o turno que voceª estuda: M-matutino, V-vespertino, ou N-noturno");
		String turno = scanner.next();
		
		scanner.close();

		if (turno.equalsIgnoreCase("m")) {

			System.out.println("periodo Matutino");

		} else if (turno.equalsIgnoreCase("v")) {

			System.out.println("periodo Vespertino");

		} else if (turno.equalsIgnoreCase("n")) {

			System.out.println("periodo Noturno");

		} else {
			System.out.println("periodo invalido");
		}
	}
}