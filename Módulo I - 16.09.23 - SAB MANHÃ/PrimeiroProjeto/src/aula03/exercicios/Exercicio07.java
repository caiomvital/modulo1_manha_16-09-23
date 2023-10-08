package aula03.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int contador = scan.nextInt();
		
		for(int i = 0; i <= contador; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Fim!");

	}

}
