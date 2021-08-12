package test;

import static org.junit.Assert.*;
import Paciente.Paciente;
import Principal.ControlePacientes;
import org.junit.Test;

public class test {

	@Test
	public void ScoreAdulto() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(25);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Nao");
		assertEquals(0, eu.getScore());
	}
	
	@Test
	public void ScoreJovem() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(15);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Nao");
		assertEquals(2, eu.getScore());
	}
	
	@Test
	public void ScoreIdoso() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(95);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Nao");
		assertEquals(3, eu.getScore());
	}
	
	@Test
	public void ScoreAdultoComorbidade() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(25);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Obeso");
		eu.tipoPaciente();
		assertEquals(4, eu.getScore());
	}
	
	@Test
	public void ScoreIdosoComorbidade() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(90);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Obeso");
		eu.tipoPaciente();
		assertEquals(7, eu.getScore());
	}
	
	@Test
	public void ScoreJovemComorbidade() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(15);
		eu.setSexo("M");
		eu.setSintoma("Nenhum");
		eu.setAdicional("Doenca Cronica");
		eu.tipoPaciente();
		assertEquals(6, eu.getScore());
	}
	
	@Test
	public void ScorePacoteCompleto() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(90);
		eu.setSexo("M");
		eu.setSintoma("Tosse");
		eu.setAdicional("Fumante");
		eu.tipoPaciente();
		assertEquals(10, eu.getScore());
	}
	

}
