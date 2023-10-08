package aula02;

import java.util.Scanner;

public class Aula02SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com um número");
		int numero = scan.nextInt();
		
//		if(numero % 2 == 0) {
//			System.out.println("Número é par");
//		} else {
//			System.out.println("Número é ímpar");
//		}
		
		System.out.println(numero % 2 == 0 ? "Número é par" : "Número é ímpar");
		
//		System.out.println("Entre com uma das opções");
//		System.out.println("1) Saldo");
//		System.out.println("2) Depósito");
//		System.out.println("3) Saque");
//		System.out.println("4) Finalizar");
//		int opcao = scan.nextInt();
//		
//		switch(opcao) {
//		
//		case 1:
//			System.out.println("Seu saldo é R$ 3000");
//			break;
//		case 2:
//			System.out.println("Depósito efetuado.");
//			break;
//		case 3:
//			System.out.println("Você sacou 1000 reais.");
//			break;
//		case 4:
//			System.out.println("Obrigado por acessar o Banco do Brasil");
//			break;
//		default:
//			System.out.println("Opção inválida!");
//		
//		
//		
//		}
		
		
		
		
//		if(diaSemana == 1) {
//			System.out.println("Domingo");
//		} else if(diaSemana == 2) {
//			System.out.println("Segunda");
//		} else if(diaSemana == 3) {
//			System.out.println("Terça");
//		} else if(diaSemana == 4) {
//			System.out.println("Quarta");
//		} else if(diaSemana == 5) {
//			System.out.println("Quinta");
//		} else if (diaSemana == 6) {
//			System.out.println("Sexta");
//		} else if(diaSemana == 7) {
//			System.out.println("Sábado");
//		} else {
//			System.out.println("Dia inválido");
//		}
		

	}

}
