package aula01;

public class OperadoresAritmeticos {
public static void main(String[] args) {
	//+ - * / %
	
	int primeiroValor = 5;
	int segundoValor = 2;
	
	int soma = primeiroValor + segundoValor;
	int subtracao = primeiroValor - segundoValor;
	int multiplicacao = primeiroValor * segundoValor;
	//considere que uma divisão pode gerar um número real
	//ou seja, um número fracionado, portanto, precisamos
	//declarar a variável divisao como double para conseguir
	//um resultado mais preciso.
	double divisao;
	
	//aqui precisaremos fazer a conversão de tipos
	//no momento da operação, transformando, para a operação
	//uma variável int em double com o (double).
	divisao = (double) primeiroValor / segundoValor;
	
	System.out.println("Soma: " + soma);
	System.out.println("Subtração: " + subtracao);
	System.out.println("Multiplicação: " + multiplicacao);
	System.out.println("Divisão: " + divisao);

	int resto = primeiroValor % segundoValor;
	System.out.println("Resto: " + resto);


}
	
	
	
}
