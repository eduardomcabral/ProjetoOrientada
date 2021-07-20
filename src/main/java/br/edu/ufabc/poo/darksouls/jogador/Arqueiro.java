package br.edu.ufabc.poo.darksouls.jogador;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;

public class Arqueiro extends Jogador {

	public Arqueiro (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	@Override
	public String atacar(Inimigo inimigo) {
		return nome + " atacando o " + inimigo.getNome();		
	}
}