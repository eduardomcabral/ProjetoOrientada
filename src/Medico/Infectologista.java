package Medico;

import Paciente.Paciente;
import Interface.SolicitarUrgencia;
import Excecoes.ScoreInsuficienteException;


public class Infectologista extends Medico implements SolicitarUrgencia{
	
	public Infectologista (String nome, String especialidade) {
		super(nome, especialidade);
	}
	
	@Override
	public void solicitarUrgencia(Paciente paciente) {
		if(paciente.getScore() >= 7) {
			System.out.println("Este paciente deve ser atendido com urg�ncia!");
		}
		else {
			throw new ScoreInsuficienteException("O paciente n�o atende todos os crit�rios para urg�ncia");
		}
	}
	
	public void testeCovid(Paciente paciente) {
		System.out.println("Este paciente possui sintomas de covid, fazer teste!");
	}
	
}