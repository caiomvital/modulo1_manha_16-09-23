package aula03.exercicios;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	/*
a) Qual é a média de idade do grupo 
b) Quantas pessoas tem mais de 18 anos 
c) Quantas pessoas tem menos de 5 anos 
d) Qual foi a maior idade lida  
 */
	
	Scanner scan = new Scanner(System.in);
	double media = 0;
	int soma = 0;
	int idade = 0;
	int qtdAcima18 = 0;
	int qtdAbaixo5 = 0;
	int maiorIdade = Integer.MIN_VALUE;
	
	for(int i = 0; i < 10; i++) {
		System.out.printf("Digite a %dº idade: \n", (i+1));
		idade = scan.nextInt();
		soma += idade;
		
			if(idade > 18) {
			qtdAcima18++;
		}
		
		if(idade<5) {
			qtdAbaixo5++;
		}
		
		if(maiorIdade < idade) {
			maiorIdade = idade;
		}
	}
	
	media = (double) soma / 10;
	System.out.println("Pessoas abaixo de 5: " + qtdAbaixo5);
	System.out.println("Pessoas acima de 18: " + qtdAcima18);
	System.out.println("Média: " + media);

	}
}
