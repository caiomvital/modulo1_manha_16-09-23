package modelos;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("Tadeu", 1.95);
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.sobrenome);
		pessoa.sobrenome = scan.nextLine();
		System.out.println(pessoa.sobrenome);
	}
}
