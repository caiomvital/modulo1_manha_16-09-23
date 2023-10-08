package aula02.exercicios;

import java.util.Scanner;

public class Exercicio05SwitchCase {

	public static void main(String[] args) {
//Desenvolva um conversor que recebe uma unidade 
//de medida (metro, centímetro, quilômetro) 
//e converte para outra unidade com base 
//na entrada.

Scanner scan = new Scanner(System.in);

		// m = x
		// cm = x/100;
		// km = x*1000;

		System.out.println("Entre com a unidade de medida");
		String unidade = scan.nextLine();
		System.out.println("Entre com o distância em metros a ser convertida");
		double distanciaEmMetros = Double.parseDouble(scan.nextLine());
		double distanciaEmKm = distanciaEmMetros / 1000;
		double distanciaEmCm = distanciaEmMetros * 100;
		
		switch(unidade.toLowerCase()) {
		case "m":
			System.out.println("M para Km = m / 1000");
			System.out.println("M para Cm = m * 100");
			break;
		case "km":
			System.out.println("Km para M = m * 1000");
			System.out.println("Km para Cm = Cm * 100.000");
			System.out.println(distanciaEmKm + "km");
			System.out.println(distanciaEmCm + "cm");
			
			break;
		case "cm":
			System.out.println("Cm para M = Cm / 100");
			System.out.println("Cm para Km = Cm / 100.000");
			System.out.println(distanciaEmCm + "cm");
			System.out.println(distanciaEmKm + "km");
			break;
		default:
			System.out.println("Valor inválido");
		}
		
	
		
	}

}
