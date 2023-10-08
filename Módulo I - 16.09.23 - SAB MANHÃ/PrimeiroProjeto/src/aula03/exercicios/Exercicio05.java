package aula03.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
/*
 * Faça um algoritmo que pergunte ao usuário 
 * um número inteiro e positivo qualquer 
 * e mostre uma contagem até esse valor: 
 * Ex: 
 * Digite um valor: 35 
 * Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!*/


Scanner scan = new Scanner(System.in);

int i = 1;
System.out.println("Digite um valor:");
int valor = scan.nextInt();

while (i <= valor) {
	System.out.print(i++);
	System.out.print(" ");
	
}
System.out.println("Acabou!");

	}

}
