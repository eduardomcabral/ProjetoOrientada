package Principal;
import Paciente.Paciente;

import java.util.ArrayList;



public class ControlePacientes{
	
	private ArrayList<Paciente> Usuarios;
	
	public ControlePacientes() {
		Usuarios = new ArrayList<Paciente>();
	}
	
	public Paciente adicionarPaciente(String nome, int idade, String sexo, String sintoma) {
		Paciente paciente = new Paciente (nome);
		paciente = this.setPaciente(paciente, idade, sexo, sintoma);
		this.Usuarios.add(paciente);
		return paciente;
	}	
	
	private Paciente setPaciente(Paciente paciente, int idade, String sexo, String sintoma) {
		paciente.setIdade(idade);
		paciente.setSexo(sexo);
		paciente.setSintoma(sintoma);
		return paciente;
	}
	
	public Paciente buscarPaciente(String umNome) {
		Paciente paciente = buscarPorNome(umNome);
		return paciente;
	}
	
	private Paciente buscarPorNome(String umNome) {
		
		for(Paciente paciente: Usuarios) {
			String nomePesquisado = paciente.getNome();
			
			if (nomePesquisado.equalsIgnoreCase(umNome)) {
				return paciente;
			}
		}
		return null;
	}
	
	public boolean removerPaciente(String umNome) {
		Paciente paciente = buscarPorNome(umNome);
		
		if (paciente == null) {
			return false;
		}
		else {
			Usuarios.remove(paciente);
			return true;
		}
	}
	public ArrayList<Paciente> getMeusPacientes(){
		return this.Usuarios;
	}
}

