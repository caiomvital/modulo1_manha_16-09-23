package aula03;

import java.util.Scanner;

public class TesteEquals {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Entre com um gênero");
System.out.println("m - Masculino");
System.out.println("f - Feminino");
System.out.println("o - Outros");
String genero = scan.nextLine();

if(genero.equalsIgnoreCase("m")) {
	System.out.println("Masculino");
} else if (genero.equalsIgnoreCase("f")) {
	System.out.println("Feminino");
} else if (genero.equalsIgnoreCase("o")) {
	System.out.println("Outros");
}


	}

}
