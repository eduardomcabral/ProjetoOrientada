package Paciente;

public class GrupoRisco extends Paciente {

	public GrupoRisco (String nome) {
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