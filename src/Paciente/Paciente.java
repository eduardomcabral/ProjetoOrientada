package Paciente;
import Interface.TipoPaciente;

public class Paciente {

	private String nome;
	private int idade;
	private String sexo;
	private String sintoma;
	private String tipo;
	private String adicional;
	private int score;

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
	
	//public String getTipo() {
		//return tipo;
	//}
	
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
	
	public int getScore() {
		return score;
	}
	
	public int tipoPaciente() {
		if(adicional == "Obeso" || adicional == "Doenca Cronica" || adicional == "Fumante") {
			score += 4;
		}
		if(sintoma == "Febre" || sintoma == "Tosse" || sintoma == "Falta de ar" ) {
			score += 3;
		}
		if(idade <= 18) {
			score += 2;
		}
		if(idade >= 60) {
			score += 3;
		}
		return score;
	}
	
	public String toString() {
		return  "Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"Sexo: " + this.sexo + "\n"+
				"Sintoma: " + this.sintoma + "\n"+
				"Informações Adicionais: " + this.adicional + "\n"+
				"Score: " + this.score + "\n";
	}
	
	//public abstract String tipoPaciente(Paciente paciente);
	
	//public abstract String mostrarInfo(Paciente paciente);
		
}