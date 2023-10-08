package aula03.exercicios;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
	/*
 * Faça um algoritmo que leia a idade 
 * de vários alunos de uma turma. 
 * O programa vai parar quando 
 * for digitada a idade 999.

   No final, mostre quantos alunos existem 
   na turma e qual é a média de idade 
   do grupo.
	 */
	
	int idade = 0;
	double media = 0;
	int qtdAlunos = 0;
	int somaIdades = 0;
	
	while(idade != 999) {
		
		System.out.println("Digite a idade:");
		idade = scan.nextInt();
		
		if(idade != 999) {
			qtdAlunos++;
			somaIdades += idade;
		}
	}
	media = somaIdades / (double) qtdAlunos;
 	
	System.out.println("Alunos na turma: " + qtdAlunos);
	System.out.println("A média de idades é " + media);
}
}
