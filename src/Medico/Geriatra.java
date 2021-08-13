package Medico;

import Paciente.Paciente;
import Excecoes.ScoreInsuficienteException;
import Interface.SolicitarUrgencia;

public class Geriatra extends Medico implements SolicitarUrgencia{
	
	public Geriatra (String nome, String especialidade) {
		super(nome, especialidade);
	}
	
	@Override
	public void solicitarUrgencia(Paciente paciente) {
		if(paciente.getScore() >= 7) {
			System.out.println("Este paciente deve ser atendido com urgência!");
		}
		else {
			throw new ScoreInsuficienteException("O paciente não atende todos os critérios para urgência");
		}
	}
	
}