package br.com.exercicio.dec;

import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma letra que representa o turno que voc� estuda: M-matutino, V-vespertino, ou N-noturno");
		String turno = scanner.next();
		
		scanner.close();

		if (turno.equalsIgnoreCase("m")) {

			System.out.println("per�odo Matutino");

		} else if (turno.equalsIgnoreCase("v")) {

			System.out.println("per�odo Vespertino");

		} else if (turno.equalsIgnoreCase("n")) {

			System.out.println("per�odo Noturno");

		} else {
			System.out.println("per�odo inv�lido");
		}
	}
}