package Medico;

import Paciente.Comum;
import Paciente.Paciente;
import Paciente.GrupoAtencao;

public abstract class Medico {

	protected String nome;
	protected String especialidade;
	protected String tipoPaciente;
	protected String encaminhar;

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
	
	public void encaminhar(Paciente paciente) {
		tipoPaciente = paciente.getTipo();
		if(tipoPaciente == "Jovem") {
			encaminhar = "Pediatra";
		}
		else if(tipoPaciente == "Idoso") {
			encaminhar = "Geriatra";
		}
		else if(tipoPaciente == "Adulto") {
			encaminhar = "Clinico Geral";
		}
		else {
			encaminhar = "Infectologista";
		}		
	}
	
	//public abstract String mostrarInfo(Paciente paciente);
		
}