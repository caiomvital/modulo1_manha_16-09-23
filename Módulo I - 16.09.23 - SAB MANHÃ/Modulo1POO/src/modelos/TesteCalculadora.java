package modelos;

import java.util.Scanner;

public class TesteCalculadora {
public static void main(String[] args) {
Calculadora calc = new Calculadora();
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
calc.somar(a, b);
System.out.println("Subtração: " + calc.subtrair(a, b));
calc.multiplicar(3, 5);
System.out.println("Divisão: " + calc.dividir(7, 3));
}
}
