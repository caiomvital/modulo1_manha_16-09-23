package aula03.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio10 {
public static void main(String[] args) {
	List<String> nomes = new ArrayList<>();
	
	nomes.add("Aurélio");
	nomes.add("Breno");
	nomes.add("Caio");
	nomes.add("Daniela");
	nomes.add("Eduarda");
	nomes.add("Francisco");
	nomes.add("Guta");
	nomes.add("Henrique");
	nomes.add("Iolanda");
	nomes.add("Jennifer");
	nomes.add("Kléber");
	nomes.add("Leila");
	nomes.add("Maria");
	nomes.add("Noemi");
	nomes.add("Oscar");
	nomes.add("Paula");
	nomes.add("Quésia");
	nomes.add("Renata");
	nomes.add("Saulo");
	nomes.add("Talita");
	nomes.add("Uíliam");
	nomes.add("Vinicius");
	nomes.add("Washington");
	nomes.add("Xênia");
	nomes.add("Yago");
	nomes.add("Zéfiro");
	
	for(int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i).charAt(0));
	}
List<String> outraLista = new ArrayList<>();
outraLista.addAll(nomes);

	Collections.reverse(outraLista);
	for(int i = 0; i < outraLista.size(); i++) {
		System.out.println(outraLista.get(i).charAt(0));
	}
//	for (String primeiraLetra : nomes) {
//	System.out.println(primeiraLetra.charAt(0));
//	}

}
}
