package Paciente;

public abstract class Paciente {

	private String nome;
	private int idade;
	private String sexo;
	private String sintoma;
	private String tipo;

	public Paciente(String nome) {
		this.nome = nome;
		//this.idade = idade;
		//this.sexo = sexo;
		//this.sintoma = sintoma;
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
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public void setSintoma(String sintoma){
		this.sintoma = sintoma;
	}
	
	public abstract String tipoPaciente(Paciente paciente);
	
	public abstract String mostrarInfo(Paciente paciente);
		
}