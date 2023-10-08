package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {
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
	
	System.out.println(nomes);
	
	for(int i = 0; i < nomes.size(); i++) {
		System.out.println("Primeira Letra do " + (i+1) + "º nome: " + nomes.get(i).charAt(0));
	}
	Collections.reverse(nomes);
	for(int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i).charAt(0));
	}

	
}
}
