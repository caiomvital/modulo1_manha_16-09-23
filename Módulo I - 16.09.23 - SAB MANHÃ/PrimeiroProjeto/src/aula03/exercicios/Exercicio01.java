package aula03.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
	
	/*
	 * Crie um programa que mostre na tela 
	 * a seguinte contagem, usando a estrutura 
	 * do-while: 
	 * 0 3 6 9 12 15 18 21 24 27 30 Acabou!
	 * */	
		
	int i = 0;
	
	do {
		System.out.print(i + " ");
		i += 3;
		
	} while (i <= 30);
	System.out.println("Acabou!");
	

	}

}
