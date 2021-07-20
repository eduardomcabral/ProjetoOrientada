package br.edu.ufabc.poo.darksouls.inimigos;

public abstract class Inimigo {

	protected String nome;
	protected double vida;
	protected String tipoArma;

	public Inimigo(String nome, double vida, String tipoArma) {
		this.nome = nome;
		this.vida = vida;
		this.tipoArma = tipoArma;
	}

	public abstract String atacando();
	
	public void tomarDano(Inimigo inimigo) {
		vida -= 50;
		if (vida <= 0) {
			vida = 0;
			System.out.println(inimigo.getNome() + " morreu");
		}
		System.out.println("Jogador atacou o inimigo: " + inimigo.getNome() + " - vida restante: " + inimigo.getVida());
	}
	public String getNome() {
		return nome;
	}
	public double getVida() {
		return vida;
	}
	public String getTipoArma() {
		return tipoArma;
	}
	
	public void mostrarInfo(Inimigo inimigo) {
		System.out.println("---------------");
		System.out.println("Nome: " + inimigo.getNome());
		System.out.println("Vida: " + inimigo.getVida());
		System.out.println("Tipo de arma: " + inimigo.getTipoArma());
		System.out.println("---------------");
	}
}