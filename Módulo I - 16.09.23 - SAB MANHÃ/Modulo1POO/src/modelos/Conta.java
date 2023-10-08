package modelos;

public class Conta {
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.saldo += valor);
	}
	
	public void sacar(double valor) {
		this.setSaldo(this.saldo -= valor);
	}
	

	
}
