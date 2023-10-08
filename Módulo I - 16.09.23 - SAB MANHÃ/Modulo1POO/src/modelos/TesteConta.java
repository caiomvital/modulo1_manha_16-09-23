package modelos;

import java.util.Scanner;

public class TesteConta {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Conta contaDeTadeu = new Conta();
	
	contaDeTadeu.depositar(1000);
	System.out.println(contaDeTadeu.getSaldo());
	
}
}
