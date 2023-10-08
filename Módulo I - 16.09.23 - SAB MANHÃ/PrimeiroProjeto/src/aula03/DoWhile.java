package aula03;

import java.util.Scanner;

public class DoWhile {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


String listaNomes = "";
String nomeInserido;

System.out.println("Entre com um nome ou "
		+ "digite sair para encerrar.");

nomeInserido = scan.nextLine();
while(!(nomeInserido.equalsIgnoreCase("sair"))) {
	
	listaNomes += "\n" + nomeInserido;
	nomeInserido = scan.nextLine();
	
}

System.out.println(listaNomes);

/*
Desenvolva um programa que peça ao usuário para digitar vários nomes. Quando o usuário digitar ‘sair’, o programa deve parar de pedir nomes e imprimir todos os nomes digitados.

Dica:
Declare uma variável para a lista de nomes e outra para o nome inserido:
String listaNomes;
String nomeInserido;

Você pode tentar adicionar o nome inserido à String listaNomes usando o operador +=, como no exemplo abaixo:  
listaNomes += "\n" + nomeInserido; 
 */


	}
}
