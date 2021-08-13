package Medico;


public abstract class Medico {

	protected String nome;
	protected String especialidade;
	protected String tipoPaciente;

	public Medico(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
}