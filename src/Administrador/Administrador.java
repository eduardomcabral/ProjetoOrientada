package Administrador;

import java.util.ArrayList;

import Medico.Medico;
import Medico.Pediatra;
import Paciente.GrupoRisco;
import Paciente.Comum;
import Paciente.Paciente;
import Paciente.SuspeitaCovid;

public class Administrador {

private ArrayList<Paciente> meusPacientes;
	
	public Administrador() {
		meusPacientes = new ArrayList<Paciente>();
	}
	
	public Paciente adicionarPaciente(String nome, String idade, String sexo, String sintoma, String doencaCronica, String alergia, String cirurgia) {
		if(sintoma == "Febre" && sintoma == "Tosse") {
			Paciente contato = new SuspeitaCovid (nome);
			contato = this.setPaciente(contato, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
			//this.tipoPaciente = "Suspeita Covid";
			this.meusPacientes.add(contato);
			return contato;
		}
		else if(doencaCronica != "Nao" || alergia != "Nao" || cirurgia != "Nao") {
			Paciente contato = new GrupoRisco (nome);
			contato = this.setPaciente(contato, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
			this.meusPacientes.add(contato);
			return contato;
		}
		else {
			Paciente contato = new Comum (nome);
			contato = this.setPaciente(contato, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
			this.meusPacientes.add(contato);
			return contato;
		}
	}
	
	private Paciente setPaciente(Paciente contato, String idade, String sexo, String sintoma, String doencaCronica, String alergia, String cirurgia) {
		contato.setIdade(idade);
		contato.setSexo(sexo);
		contato.setSintoma(sintoma);
		contato.setDoencaCronica(doencaCronica);
		contato.setAlergia(alergia);
		contato.setCirurgia(cirurgia);
		return contato;
	}
	
	public Paciente atualizarPaciente(Paciente contato, String nome, String idade, String sexo, String sintoma, String doencaCronica, String alergia, String cirurgia) {
		contato.setNome(nome);
		contato = this.setPaciente(contato, idade, sexo, sintoma, doencaCronica, alergia, cirurgia);
		return contato;
	}
	
	public Paciente buscarPaciente(String umNome) {
		Paciente contato = buscarPorNome(umNome);
		return contato;
	}
	
	private Paciente buscarPorNome(String umNome) {
		
		for(Paciente contato: meusPacientes) {
			String nomePesquisado = contato.getNome();
			
			if (nomePesquisado.equalsIgnoreCase(umNome)) {
				return contato;
			}
		}
		return null;
	}
	
	public boolean removerPaciente(String umNome) {
		Paciente contato = buscarPorNome(umNome);
		
		if (contato == null) {
			return false;
		}
		else {
			meusPacientes.remove(contato);
			return true;
		}
	}
	public ArrayList<Paciente> getMeusPacientes(){
		return this.meusPacientes;
	}
	
	
}