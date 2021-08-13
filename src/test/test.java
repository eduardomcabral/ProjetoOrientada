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
		assertEquals(1, eu.getScore());
	}
	
	@Test
	public void ScoreJovem() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(5);
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
		assertEquals(5, eu.getScore());
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
	
	@Test
	public void EncaminharAdulto() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(25);
		eu.setSexo("M");
		eu.setSintoma("Sintoma");
		eu.setAdicional("Nao");
		eu.tipoPaciente();
		assertEquals("Clinico Geral", eu.encaminhar());
	}
	
	@Test
	public void EncaminharJovem() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(15);
		eu.setSexo("M");
		eu.setSintoma("Perdi meu nariz");
		eu.setAdicional("Obeso");
		eu.tipoPaciente();
		assertEquals("Pediatra", eu.encaminhar());
	}
	
	@Test
	public void EncaminharIdoso() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(105);
		eu.setSexo("M");
		eu.setSintoma("Virei um corsa");
		eu.setAdicional("Fumante");
		eu.tipoPaciente();
		assertEquals("Geriatra", eu.encaminhar());
	}
	
	@Test
	public void EncaminharCovid() {
		Paciente eu = new Paciente("Eu");
		eu.setIdade(15);
		eu.setSexo("M");
		eu.setSintoma("Tosse");
		eu.setAdicional("Doenca cardiaca");
		eu.tipoPaciente();
		assertEquals("Infectologista", eu.encaminhar());
	}
}
