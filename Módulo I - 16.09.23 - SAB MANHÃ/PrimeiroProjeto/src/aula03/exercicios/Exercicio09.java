package aula03.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio09 {
public static void main(String[] args) {
	List<String> nomes = new ArrayList<>();
	
	nomes.add("Aurélio"); //0
	nomes.add("Breno"); //1
	nomes.add("Cláudia"); //2
	nomes.add("Daniela"); //3
	nomes.add("Eduarda"); //4
	nomes.add("Francisco");//5
	nomes.add("Guta"); //6
System.out.println(nomes);
	
//	for (String nome : nomes) {
//		System.out.println(nome);
//	}
	
	nomes.remove(3);
	System.out.println(nomes.get(2));
	nomes.add("Henrique");
	nomes.add("Iolanda");
	nomes.add("Jennifer");
	System.out.println(nomes);
	
	
}
}
