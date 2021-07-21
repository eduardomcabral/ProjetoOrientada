package Paciente;

public class GrupoAtencao extends Paciente{
	
	protected String adicional;
	
	public GrupoAtencao (String nome, int idade, String sexo, String sintoma, String adicional) {
		super(nome, idade, sexo, sintoma);
		this.adicional = adicional;
	}
	
	public String getAdicional() {
		return adicional;
	}
	
	@Override
	public String tipoPaciente(Paciente paciente) {
		if(adicional == "Obeso" || adicional == "Doenca Cronica" || adicional == "Fumante") {
			tipo = "Grupo Atencao";
		}
		else {
			if(idade < 18) {
				tipo = "Jovem";
			}
			else if(idade > 65) {
				tipo = "Idoso";
			}
			else {
				tipo = "Adulto";
			}
		}
		return tipo;
	}
	
	@Override
	public String mostrarInfo(Paciente paciente) {
		return  "Nome:" + this.nome + "\n" +
				"Idade:" + this.idade + "\n" +
				"Sexo:" + this.sexo + "\n"+
				"Sintoma:" + this.sintoma + "\n"+
				"Adicional:" + this.adicional +"\n"+
				"Tipo de paciente:" +this.tipo +"\n";
	}
	
	
}