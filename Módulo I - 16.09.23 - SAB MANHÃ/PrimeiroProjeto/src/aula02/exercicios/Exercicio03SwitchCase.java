package aula02.exercicios;

import java.util.Scanner;

public class Exercicio03SwitchCase {

	public static void main(String[] args) {

//Implemente um sistema de semáforo usando switch case. 
//Receba um estado (vermelho, amarelo ou verde) 
//e determine a ação apropriada.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o estado do semáforo: ");
		String corSemaforo = scan.nextLine();
		if(corSemaforo.equalsIgnoreCase("vermelho")) {
			corSemaforo = "Vermelho";
		} else if (corSemaforo.equalsIgnoreCase("amarelo")) {
		  corSemaforo = "Amarelo";
		} else if (corSemaforo.equalsIgnoreCase("verde")) {
			corSemaforo = "Verde";
		} 
		
		switch(corSemaforo) {
		case "Vermelho": 
			System.out.println("Pare");
			break;
		case "Amarelo":
			System.out.println("Atenção");
			break;
		case "Verde":
			System.out.println("Siga");
			break;
		default:
			System.out.println("Cor inválida");
		}
		

	}

}
