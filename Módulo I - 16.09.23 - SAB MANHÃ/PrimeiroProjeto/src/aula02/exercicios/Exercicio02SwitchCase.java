package aula02.exercicios;

import java.util.Scanner;

public class Exercicio02SwitchCase {

	public static void main(String[] args) {

//Faça um programa que recebe um número de 1 a 12 
//e retorna o mês do ano correspondente.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor referente ao mês");
		int valorMes = scan.nextInt();
		
		switch(valorMes) {
		case 1: System.out.println("Janeiro"); break;
		case 2: System.out.println("Fevereiro"); break;
		case 3: System.out.println("Março"); break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Maio");break;
		case 6: System.out.println("Junho");break;
		case 7: System.out.println("Julho");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Setembro");break;
		case 10: System.out.println("Outubro");break;
		case 11: System.out.println("Novembro");break;
		case 12: System.out.println("Dezembro");break;
		default: System.out.println("Valor inválido.");
		
		}

	}

}
