package aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LacoFor {
public static void main(String[] args) {
	/*
	 * Crie um programa que peça ao usuário 
	 * para digitar 10 números e imprima 
	 * a soma dos 5 maiores números digitados.
	 * 
	 */
	Scanner scan = new Scanner(System.in);
	int maiorNumero = Integer.MIN_VALUE;
	int contadora = 0;
	int soma = 0;
	List<Integer> listaNumeros = new ArrayList<>();
	
	for(int i = 0; i < 10; i++) {
		System.out.println("Entre com o " + (i +1) + "º número");
		int numero = scan.nextInt();
		if(maiorNumero < numero) {
			maiorNumero = numero;
			listaNumeros.add(maiorNumero);
			while(contadora < 5) {
				soma += maiorNumero;
				contadora++;
				break;
			}
		}
	}
	System.out.println(soma);
	
}
}
