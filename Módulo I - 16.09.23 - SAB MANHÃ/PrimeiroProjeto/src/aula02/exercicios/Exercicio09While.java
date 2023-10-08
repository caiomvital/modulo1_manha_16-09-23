package aula02.exercicios;

import java.util.Scanner;

public class Exercicio09While {

	public static void main(String[] args) {
//Peça ao usuário para inserir um número 
//e imprima a tabuada desse número de 1 a 10 
//usando um loop while.
Scanner scan = new Scanner(System.in);
System.out.println("Entre com um número");
Integer numero = Integer.parseInt(scan.nextLine());
int contador = 1;
System.out.println("Tabuada de " + numero + ":");
while(contador <= 10) {
	System.out.println(numero + " x " + contador + " = " + (numero * contador));
	contador++;
}

		
	}

}
