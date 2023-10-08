package aula02.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio07While {

	public static void main(String[] args) {
//Implemente um jogo em que o computador escolhe 
//um número aleatório entre 1 e 100, e o jogador 
//tenta adivinhar. O jogo continua até que 
//o jogador acerte o número.
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int aleatorio = random.nextInt(5) + 1;
		System.out.println("Entre com um número de 1 a 5");
		int numeroEscolhido = scan.nextInt();
		while(numeroEscolhido != aleatorio) {
			System.out.println("Errou, tente de novo");
			numeroEscolhido = scan.nextInt();
		}
		System.out.println("Acertou! O número correto é " + aleatorio);
	}

}
