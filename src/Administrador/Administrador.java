package Administrador;

import java.util.ArrayList;

import Medico.Medico;
import Medico.Pediatra;
import Paciente.GrupoRisco;
import Paciente.Comum;
import Paciente.Paciente;
import Paciente.SuspeitaCovid;

public class Administrador {

private ArrayList<Paciente> meusContatos;
	
	public Administrador() {
		meusContatos = new ArrayList<Paciente>();
	}
	
	public Paciente adicionarContato(String nome, String idade, String sexo, String sintoma) {
		Paciente contato = new Comum (nome);
		contato = this.setContato(contato, idade, sexo, sintoma);
		this.meusContatos.add(contato);
		return contato;
	}
	
	private Paciente setContato(Paciente contato, String idade, String sexo, String sintoma) {
		contato.setIdade(idade);
		contato.setSexo(sexo);
		contato.setSintoma(sintoma);
		return contato;
	}
	
	public Paciente atualizarContato(Paciente contato, String nome, String idade, String sexo, String sintoma) {
		contato.setNome(nome);
		contato = this.setContato(contato, idade, sexo, sintoma);
		return contato;
	}
	
	public Paciente buscarContato(String umNome) {
		Paciente contato = buscarPorNome(umNome);
		return contato;
	}
	
	private Paciente buscarPorNome(String umNome) {
		
		for(Paciente contato: meusContatos) {
			String nomePesquisado = contato.getNome();
			
			if (nomePesquisado.equalsIgnoreCase(umNome)) {
				return contato;
			}
		}
		return null;
	}
	
	public boolean removerContato(String umNome) {
		Paciente contato = buscarPorNome(umNome);
		
		if (contato == null) {
			return false;
		}
		else {
			meusContatos.remove(contato);
			return true;
		}
	}
	public ArrayList<Paciente> getMeusContatos(){
		return this.meusContatos;
	}
	
	
}