package br.edu.ufabc.poo.darksouls.inimigos;

public class CavaleiroNegro extends Inimigo {

	public CavaleiroNegro (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	public String ataqueRapido() {
		return nome + " atacando rapido!";
	}
	
	@Override
	public String atacando() {
		return nome + " atacando normal";
	}
}
