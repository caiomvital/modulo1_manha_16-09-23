package aula02.exercicios;

import java.util.Scanner;

public class Exercicio08While {

	public static void main(String[] args) {
//Receba um número inteiro e calcule a soma dos 
//seus dígitos usando um loop while.
		
		Scanner scan = new Scanner(System.in);
		int inteiro = scan.nextInt();
		int soma = 0;
		int digito = 0;
		
		while(inteiro != 0) {
			digito = inteiro % 10; 
			soma += digito;
			inteiro /= 10;
			
		}
		System.out.println("A soma dos dígitos é " + soma);
		
		

		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Entre com um número:");
//		int numero = scan.nextInt();
//		int somaDosDigitos = 0;
//		
//		while(numero != 0) {
//			int digito = numero % 10;
//			somaDosDigitos += digito;
//			numero /= 10;
//		}
//		System.out.println("A soma dos dígitos é " + somaDosDigitos); 
	}

}
