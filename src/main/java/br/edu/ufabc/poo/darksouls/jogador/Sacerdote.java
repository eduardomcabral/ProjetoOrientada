package br.edu.ufabc.poo.darksouls.jogador;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;
import br.edu.ufabc.poo.darksouls.interfaces.Curavel;

public class Sacerdote extends Jogador implements Curavel {

	public Sacerdote (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	@Override
	public String atacar(Inimigo inimigo) {
		return nome + " atacando o " + inimigo.getNome();	
	}
	
	@Override
	public String recuperarVida() {
		this.vida += 30;
		return nome + " recuperou 30 de vida, HP atual: " + vida;
	}
}