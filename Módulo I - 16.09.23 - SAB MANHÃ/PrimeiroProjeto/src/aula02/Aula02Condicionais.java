package aula02;

import java.util.Scanner;

public class Aula02Condicionais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		//se é maior que 10
		
		//SE É DIVISIVEL POR 5 - Mostre na tela
		//SE FOR DIVISIVEL POR 5, VERIFIQUE SE 
		//É MAIOR QUE 10 - Mostre na tela 
		
		if(valor % 5 == 0) {
			System.out.println("Divisível por 5");
			if(valor > 10) {
				System.out.println("Maior que 10");
			}
		} else {
			System.out.println("Não é divisível por 5");
		}
		
		
		/*
		
		se(divisivelPor5 for igual a 0) {
		imprima "divisivel por 5"
		se(valor for maior do que 10) {
		imprima "maior do que 10"
		}
		senao {
		imprima "não é divisivel por 5"
		}
		*/
		
//		System.out.println("Vai chover? "
//				+ "\n1 para sim\n"
//				+ "2) para não");
//		int opcao = scan.nextInt();
//		Boolean vaiChover = false;
//		Boolean estaNublado = false;
		
//		if(opcao == 1) {
//			vaiChover = true;
//			System.out.println("Você disse que vai chover.");
//			System.out.println("Vamos ficar em casa.");
//		} else if (opcao == 2) {
//			System.out.println("Está nublado? \n1 para sim"
//					+ "\n2 para não");
//			opcao = scan.nextInt();
//			if(opcao == 1) {
//				System.out.println("Você disse que não vai chover.");
//				System.out.println("Você disse que está nublado.");
//				System.out.println("Vamos ao shopping");
//				
//			} else if(opcao == 2) {
//				System.out.println("Então vamos à praia.");
//			}
//			
//		} else {
//			System.out.println("Opção inválida.");
//		}
		
		
		
		
//		Boolean vaiChover = false;
//		Boolean estaNublado = false;
//		
//		if(vaiChover == true) {
//			System.out.println("Vai chover");
//		} else if(vaiChover == false && estaNublado == false) {
//			System.out.println("Vai fazer sol.");
//		} else {
//			System.out.println("Está nublado, mas não vai chover.");
//		}
		
		
		
		
		
		
		
	}

}
