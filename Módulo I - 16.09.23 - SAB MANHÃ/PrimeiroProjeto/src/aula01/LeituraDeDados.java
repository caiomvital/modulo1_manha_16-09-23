package aula01;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String diaDaSemana = "Segunda";
		
		if(diaDaSemana.equals("Segunda")) {
			System.out.println("Segunda Dia útil");
		} else if(diaDaSemana.equals("Terça")) {
			System.out.println("Terça Dia útil");
		} else if(diaDaSemana.equals("Quarta")) {
			System.out.println("Quarta Dia útil");
		} else if(diaDaSemana.equals("Quinta")) {
			System.out.println("Quinta Dia útil");
		} else if(diaDaSemana.equals("Sexta")) {
			System.out.println("Sexta Dia útil");
		} else {
			System.out.println("Fim de semana");
		}
		
	}

}
