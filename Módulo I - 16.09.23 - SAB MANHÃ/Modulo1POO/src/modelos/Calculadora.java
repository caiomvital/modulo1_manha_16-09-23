package modelos;

public class Calculadora {

	public void somar(int a, int b) {
		System.out.println("Soma: " + (a+b));
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public void multiplicar(int a, int b) {
		System.out.println("Multiplicação: " + (a * b));
	}
	
	public double dividir(double a, double b) {
		if(b == 0) {
			System.out.println("Impossível dividir por zero.");
			return 0;
		} else {
			return a / b;
		}
		}
}
