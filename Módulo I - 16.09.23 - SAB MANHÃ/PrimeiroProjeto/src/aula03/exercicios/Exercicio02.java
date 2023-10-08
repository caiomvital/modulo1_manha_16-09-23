package aula03.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Faça um programa usando a estrutura 
		 * do-while que leia a idade de várias 
		 * pessoas. A cada iteração, você deverá 
		 * perguntar para o usuário se ele quer 
		 * ou não continuar a digitar dados. 
		 * No final, quando o usuário decidir 
		 * parar, mostre na tela: 
		 * 
		 * a) Quantas idades foram digitadas 
		 * b) Qual é a média entre as idades digitadas 
		 * c) Quantas pessoas tem 21 anos ou mais.
		 * */
		
		int idade = 0;
		int opcao = 0;
		int qtdIdades = 0;
		double mediaIdades = 0;
		int somaIdades = 0;
		int maiorQue21 = 0;
		boolean sair = false;
		
		do {
			
		System.out.println("Digite uma idade: ");
		idade = scan.nextInt();
		qtdIdades++;
		somaIdades += idade;
		if(idade >= 21) {
			maiorQue21++;
		}
		System.out.println("Deseja continuar? 1 para Sim, 2 para Não");
		opcao = scan.nextInt();
		if(opcao == 2) {
			sair = true;
		}
			
		} while (sair == false);

		System.out.println("Quantidade de idades "
				+ "digitadas: " + qtdIdades);
		mediaIdades = (double) somaIdades / qtdIdades;
		System.out.println("A média das idades "
				+ "digitadas é " + mediaIdades);
		System.out.println("A quantidade de pessoas com idade igual "
				+ "ou acima de 21 anos é " + maiorQue21);
		
	}

}
