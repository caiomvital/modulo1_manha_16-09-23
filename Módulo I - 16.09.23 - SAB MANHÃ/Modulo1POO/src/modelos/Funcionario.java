package modelos;

public class Funcionario {

	double salario;
	
	public void aumentarSalario(double porcentagem) {
		this.salario += (this.salario * porcentagem);
	}
}
