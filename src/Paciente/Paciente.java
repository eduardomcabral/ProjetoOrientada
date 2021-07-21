package Paciente;

public abstract class Paciente {

	protected String nome;
	protected int idade;
	protected String sexo;
	protected String sintoma;
	protected String tipo;

	public Paciente(String nome, int idade, String sexo, String sintoma) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.sintoma = sintoma;
	}
		
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
		
	public String getSintoma() {
		return sintoma;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public abstract String tipoPaciente(Paciente paciente);
	
	public abstract String mostrarInfo(Paciente paciente);
		
}