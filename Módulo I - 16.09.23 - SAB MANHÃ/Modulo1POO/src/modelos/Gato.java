package modelos;

public class Gato {
	
	String nome;
	double peso;
	String corDoPelo;
	
//	public Gato() {
//		
//	}
	public Gato(String nome, double peso, 
			String corDoPelo) {
this.nome = nome;
this.peso = peso;
this.corDoPelo = corDoPelo;
		
	}
	
	public void comer() {
		System.out.println("O gato está comendo...");
	}
	

}
