package br.com.exercicio.dec;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digita o valor hora");
		double valorHora = scanner.nextDouble();

		System.out.println("Digite a quantidade de horas trabalhadas");
		double horaTrabalhada = scanner.nextDouble();

		scanner.close();

		double salarioBruto = valorHora * horaTrabalhada;

		if (salarioBruto <= 900) {

			double inss = ((salarioBruto * 10) / 100);
			double fgts = ((salarioBruto * 11) / 100);
			double desconto = inss + fgts;
			double salarioLiquido = (salarioBruto - desconto);

			System.out.println("isento de imposto de renda");
			System.out.println("salário bruto: " + salarioBruto);
			System.out.println("inss: " + inss);
			System.out.println("fgts: " + fgts);
			System.out.println("desconto: " + " -" + desconto);
			System.out.println("salario líquido: "  + "R$: " + salarioLiquido);

		} else if (salarioBruto <= 1500) {

			double ir = ((salarioBruto * 5) / 100);
			double inss = ((salarioBruto * 10) / 100);
			double fgts = ((salarioBruto * 11) / 100);
			double desconto = inss + fgts;
			double salarioLiquido = (salarioBruto - desconto);

			System.out.println("de imposto de renda:" + ir);
			System.out.println("salário bruto: " + salarioBruto);
			System.out.println("inss: " + inss);
			System.out.println("fgts: " + fgts);
			System.out.println("desconto: " + " -" + desconto);
			System.out.println("salario líquido: "  + "R$: " + salarioLiquido);

		} else if (salarioBruto <= 2500) {

			double ir = ((salarioBruto * 10) / 100);
			double inss = ((salarioBruto * 10) / 100);
			double fgts = ((salarioBruto * 11) / 100);
			double desconto = inss + fgts;
			double salarioLiquido = (salarioBruto - desconto);

			System.out.println("de imposto de renda:" + ir);
			System.out.println("salário bruto: " + salarioBruto);
			System.out.println("inss: " + inss);
			System.out.println("fgts: " + fgts);
			System.out.println("desconto: " + " -" + desconto);
			System.out.println("salario líquido: "  + "R$: " + salarioLiquido);

		} else {

			double ir = ((salarioBruto * 20) / 100);
			double inss = ((salarioBruto * 10) / 100);
			double fgts = ((salarioBruto * 11) / 100);
			double desconto = inss + fgts;
			double salarioLiquido = (salarioBruto - desconto);

			System.out.println("de imposto de renda:" + ir);
			System.out.println("salário bruto: " + salarioBruto);
			System.out.println("inss: " + inss);
			System.out.println("fgts: " + fgts);
			System.out.println("desconto: " + " -" + desconto);
			System.out.println("salario líquido: "  + "R$: " + salarioLiquido);
		}	
	}
}