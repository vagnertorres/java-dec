package br.com.exercicio.dec;

import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma letra que representa o turno que você estuda: M-matutino, V-vespertino, ou N-noturno");
		String turno = scanner.next();

		if (turno.equalsIgnoreCase("m")) {

			System.out.println("Período Matutino");

		} else if (turno.equalsIgnoreCase("v")) {

			System.out.println("Perídio Vespertino");

		} else if (turno.equalsIgnoreCase("n")) {

			System.out.println("Período Noturno");

		} else {
			System.out.println("Período inválido");
		}
	}
}