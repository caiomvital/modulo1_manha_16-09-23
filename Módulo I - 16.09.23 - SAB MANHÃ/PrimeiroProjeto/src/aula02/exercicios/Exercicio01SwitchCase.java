package aula02.exercicios;

import java.util.Scanner;

public class Exercicio01SwitchCase {

	public static void main(String[] args) {
//Crie um programa que recebe um número de 1 a 7
//e retorna o dia da semana correspondente.
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Entre com o valor referente ao dia da semana: ");
	int diaSemana = scan.nextInt();
	
	switch(diaSemana) {
	
	case 1:	System.out.println("Domingo"); break;
	case 2: System.out.println("Segunda"); break;
	case 3: System.out.println("Terça"); break;
	case 4: System.out.println("Quarta"); break;
	case 5: System.out.println("Quinta"); break;
	case 6: System.out.println("Sexta"); break;
	case 7: System.out.println("Sábado"); break;
	default: System.out.println("Valor inválido");
	
	}
	
	}
		
		
		
		
		

		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Entre com o valor correspondente ao dia da semana: ");
//		int diaSemana = scan.nextInt();
//		
//		switch(diaSemana) {
//		case 1: System.out.println("Domingo"); break;
//		case 2: System.out.println("Segunda"); break;
//		case 3: System.out.println("Terça"); break;
//		case 4: System.out.println("Quarta"); break;
//		case 5: System.out.println("Quinta"); break;
//		case 6: System.out.println("Sexta"); break;
//		case 7: System.out.println("Sábado"); break;
//		default: System.out.println("Entre com um dia válido.");
//		
//		}



	}


