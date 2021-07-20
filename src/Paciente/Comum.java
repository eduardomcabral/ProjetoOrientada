package Paciente;

public class Comum extends Paciente {

	public Comum (String nome) {
		super(nome);
	}	 
	
	@Override
	public void sintoma() {
		System.out.println(nome + " possui sintoma x");
	}
	
	@Override
	public void historico() {
		System.out.println(nome + " possui historico y");
	}
	
}