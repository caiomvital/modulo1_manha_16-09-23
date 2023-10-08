package modelos;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		Funcionario tadeu = new Funcionario();
tadeu.salario = 1320;
tadeu.aumentarSalario(scan.nextDouble());
System.out.println(tadeu.salario);

		
	}

}
