package aula03.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		/*
		 * Crie um programa usando a 
		 * estrutura do-while que leia vários 
		 * números.

			A cada laço, pergunte se o usuário 
			quer continuar ou não. 
			No final, mostre na tela: 
			a) O somatório entre todos os valores 
			b) Qual foi o menor valor digitado 
			c) A média entre todos os valores 
			d) Quantos valores são pares
		 */
		
		int numero = 0;
		int contador = 0;
		int soma = 0;
		int qtdPares = 0;
		int menorNumero = Integer.MAX_VALUE;
		double media = 0;
		int opcao = 0;
		boolean sair = false;
		
		do {
			System.out.println("Digite um número");
			numero = scan.nextInt();
			soma += numero;
			contador++;
			if(numero > menorNumero) {
				menorNumero = numero;
			}
			if(numero % 2 == 0) {
				qtdPares++;
			}
			System.out.println("Deseja continuar? 1 para Sim, 2 para Não");
			opcao = scan.nextInt();
			if(opcao == 2) {
				sair = true;
			}
		} while(sair == false);
		
		media = (double) soma / contador;
		//a)
System.out.println("A soma dos números é " + soma);
		//b)
System.out.println("O menor valor foi " + menorNumero);
		//c)
System.out.println("A média foi " + media);
		//d)
System.out.println("A quantidade de pares é " + qtdPares);

	}

}
