package Paciente;
import Interface.TipoPaciente;

public class Paciente implements TipoPaciente {

	private String nome;
	private int idade;
	private String sexo;
	private String sintoma;
	private String tipo;
	private String adicional;

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
	
	public String getAdicional() {
		return adicional;
	}
	
	public void setAdicional(String adicional){
		this.adicional = adicional;
	}
	
	@Override
	public String tipoPaciente() {
		if(adicional == "Obeso" || adicional == "Doenca Cronica" || adicional == "Fumante") {
			this.tipo = "Grupo Atencao";
		}
		else if(sintoma == "Febre" || sintoma == "Tosse" || sintoma == "Falta de ar" ) {
			this.tipo = "Sintoma Covid";
		}
		else {
			if(idade < 18) {
				this.tipo = "Jovem";
			}
			else if(idade > 65) {
				this.tipo = "Idoso";
			}
			else {
				this.tipo = "Adulto";
			}
		}
		return tipo;
	}
	
	public String toString() {
		return  "Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"Sexo: " + this.sexo + "\n"+
				"Sintoma: " + this.sintoma + "\n"+
				"Informações Adicionais: " + this.adicional + "\n"+
				"Tipo de Paciente: " + this.tipo + "\n";
	}
	
	//public abstract String tipoPaciente(Paciente paciente);
	
	//public abstract String mostrarInfo(Paciente paciente);
		
}