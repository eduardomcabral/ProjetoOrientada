package Paciente;

public class Paciente {

	private String nome;
	private int idade;
	private String sexo;
	private String sintoma;
	private String adicional;
	private int score;
	private boolean comorbidade;
	private boolean covid;
	private String encaminhar;

	public Paciente(String nome) {
		this.nome = nome;
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
	
	public boolean getComorbidade() {
		return comorbidade;
	}
	
	public boolean getCovid() {
		return covid;
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
	
	public int getScore() {
		return score;
	}
	
	public int tipoPaciente() {
		if(adicional == "Obeso" || adicional == "Doenca Cronica" || adicional == "Fumante") {
			score += 4;
			comorbidade = true;
		}
		if(sintoma == "Febre" || sintoma == "Tosse" || sintoma == "Falta de ar" ) {
			score += 3;
			covid = true;
		}
		if(idade <= 18) {
			score += 2;
		}
		if(idade >= 60) {
			score += 3;
		}
		if(idade > 18 && idade < 60) {
			score += 1;
		}
		return score;
	}
	
	public String getEncaminhar() {
		return encaminhar;
	}
	
	public String encaminhar() {
		if(covid == true) {
			encaminhar = "Infectologista"; //Infectologista
		}
		else{
			if(idade < 18) { 
				encaminhar = "Pediatra"; //Pediatra
			}
		    else if(idade > 60) {
			    encaminhar = "Geriatra"; //Geriatra
		    }
		    else {
		    	encaminhar = "Clinico Geral"; //Clinico Geral
		    }
		}
		return encaminhar;
	}
	
	public String toString() {
		return  "Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"Sexo: " + this.sexo + "\n"+
				"Sintoma: " + this.sintoma + "\n"+
				"Informações Adicionais: " + this.adicional + "\n"+
				"Score: " + this.score + "\n"+
				"Encaminhar paciente para: " + this.encaminhar + "\n";
	}
		
}