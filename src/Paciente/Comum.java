package Paciente;

public class Comum extends Paciente{
	
	public Comum (String nome, int idade, String sexo, String sintoma) {
		super(nome, idade, sexo, sintoma);
	}
	
	@Override
	public String tipoPaciente(Paciente paciente) {
		if(idade < 18) {
			tipo = "Jovem";
		}
		else if(idade > 65) {
			tipo = "Idoso";
		}
		else {
			tipo = "Adulto";
		}
		return tipo;
	}
	
	@Override
	public String mostrarInfo(Paciente paciente) {
		return  "Nome:" + this.nome + "\n" +
				"Idade:" + this.idade + "\n" +
				"Sexo:" + this.sexo + "\n"+
				"Sintoma:" + this.sintoma + "\n"+
				"Tipo de paciente:" +this.tipo +"\n";
	}
	
}