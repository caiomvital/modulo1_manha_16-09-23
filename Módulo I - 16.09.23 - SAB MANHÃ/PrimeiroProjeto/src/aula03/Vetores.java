package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Vetores {
public static void main(String[] args) {	
Scanner scan = new Scanner(System.in);
int[] numeros = new int[]{1,5,7,3,5, 2, 10, 11};
List<Integer> listaNumeros = new ArrayList<>();
List<String> lista = new ArrayList<>();

lista.add("João");
lista.add("Tadeu");
lista.add("Jessica");
lista.add("Jennifer");
lista.add("Joana");
System.out.println(lista);
Collections.sort(lista);
System.out.println(lista);

	}
}
