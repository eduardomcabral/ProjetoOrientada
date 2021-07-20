package br.edu.ufabc.poo.darksouls.inimigos;
import br.edu.ufabc.poo.darksouls.interfaces.Curavel;

public class CavaleiroPrata extends Inimigo implements Curavel {

	public CavaleiroPrata (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	public String ataqueForte() {
		return nome + " atacando forte!";
	}
	
	@Override
	public String atacando() {
		return nome + " atacando normal";
	}
	
	@Override
	public String recuperarVida() {
		this.vida += 40;
		return nome + " recuperou 40 de vida, HP atual: " + vida;
	}

}
