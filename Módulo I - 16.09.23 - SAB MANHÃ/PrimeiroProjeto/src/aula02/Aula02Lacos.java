package aula02;

import java.util.Scanner;

public class Aula02Lacos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int numero = scan.nextInt();
		
		while(numero != 7) {
		System.out.println("Número errado, tente novamente");
		numero = scan.nextInt();
		}
		
		System.out.println("Número correto, parabéns!");

		
		
	}

}
