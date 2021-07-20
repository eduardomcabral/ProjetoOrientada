package br.edu.ufabc.poo.darksouls.jogador;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;

public abstract class Jogador {
	
	protected String nome;
	protected double vida;
	protected String tipoArma;

	public Jogador(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}
	
	public abstract String atacar(Inimigo inimigo);
	
	public String getNome() {
		return nome;
	}
	public double getVida() {
		return vida;
	}
	public String getTipoArma() {
		return tipoArma;
	}
	
	public void mostrarInfo(Jogador jogador) {
		System.out.println("---------------");
		System.out.println("Nome: " + jogador.getNome());
		System.out.println("Vida: " + jogador.getVida());
		System.out.println("Tipo de arma: " + jogador.getTipoArma());
		System.out.println("---------------");
	}
	
	public void tomarDano(Jogador jogador) {
		vida -= 30;
		if (vida <= 0) {
			vida = 0;
			System.out.println(jogador.getNome() + " morreu");
		}
		System.out.println("Jogador atacou o inimigo: " + jogador.getNome() + " - vida restante: " + jogador.getVida());
	}
}
