package aula02.exercicios;

import java.util.Scanner;

public class Exercicio04SwitchCase {

	public static void main(String[] args) {
//Crie um programa que recebe uma nota musical 
//(A, B, C, D, E ou F) e fornece informações 
//sobre ela, como a frequência.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma nota musical");
		String notas = """
		A = LÁ | B = SI
		C = DO | D = RÉ
		E = MI | F = FÁ
				""";
		System.out.println(notas);
		String nota = scan.nextLine();		
	
		switch(nota.toLowerCase()) {
		case "a":
			System.out.println("Lá");
			System.out.println("444.00"); break;
		case "b":
			System.out.println("Si");
			System.out.println("493.88"); break;
		case "c":
			System.out.println("Dó");
			System.out.println("261.63"); break;
		case "d":
			System.out.println("Ré");
			System.out.println("293.66"); break;
		case "e":
			System.out.println("Mi");
			System.out.println("329.63"); break;
		case "f":
			System.out.println("Fá");
			System.out.println("349.23"); break;
		default: System.out.println("Nota inválida.");
		
		
		}

	}

}
