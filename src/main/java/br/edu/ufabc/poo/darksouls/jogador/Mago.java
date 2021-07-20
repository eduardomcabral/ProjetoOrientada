package br.edu.ufabc.poo.darksouls.jogador;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;
import br.edu.ufabc.poo.darksouls.interfaces.Curavel;

public class Mago extends Jogador implements Curavel{

	public Mago (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	@Override
	public String atacar(Inimigo inimigo) {
		return nome + " atacando o " + inimigo.getNome();	
	}
	
	@Override
	public String recuperarVida() {
		this.vida += 20;
		return nome + " recuperou 20 de vida, HP atual: " + vida;
	}
	
}