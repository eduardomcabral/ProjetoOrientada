package br.edu.ufabc.poo.darksouls.inimigos;

public class ZumbiLerdo extends Inimigo {

	public ZumbiLerdo (String nome, double vida, String tipoArma) {
		super(nome, vida, tipoArma);
	}
	
	@Override
	public String atacando() {
		return nome + " atacando";
	}
}