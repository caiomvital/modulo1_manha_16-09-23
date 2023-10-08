package aula03.exercicios;

import java.util.Random;

public class Exercicio06 {
public static void main(String[] args) {
	
	Random aleatorio = new Random();
	int qtdAcimade5 = 0;
	int qtdDivisiveisPor3 = 0;
	int valor = 0;
	for(int i = 0; i < 20; i++) {
valor = aleatorio.nextInt(11);
System.out.println((i+1) + "º valor: " + valor);
if(valor > 5) { 
qtdAcimade5++;
}
if(valor != 0) {
if(valor % 3 == 0) {
qtdDivisiveisPor3++;
}
	}
	}
	
System.out.println("Quantidade de valores "
		+ "acima de 5: " + qtdAcimade5);

System.out.println("Quantidade de valores "
		+ "divisíveis por 3: " + qtdDivisiveisPor3);

}
}
