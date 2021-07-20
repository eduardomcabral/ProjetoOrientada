package br.edu.ufabc.poo.darksouls.jogador;

import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroNegro;
import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroPrata;
import br.edu.ufabc.poo.darksouls.inimigos.ZumbiLerdo;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;
import br.edu.ufabc.poo.darksouls.interfaces.Curavel;


public class Principal {
	
	public static void main (String[] args) {
		Inimigo zumbiLerdo  = new ZumbiLerdo("Lerdao", 50, "Espada Curta");
		Inimigo cavaleiroNegro = new CavaleiroNegro("Cavaleiro Negro", 100, "Espada Longa");
		CavaleiroPrata cavaleiroPrata = new CavaleiroPrata("Cavaleiro Prata", 80, "Espada Leve");
		Jogador guerreiro = new Guerreiro("Conan", 500, "Machado");
		Jogador mago = new Mago("Merlin", 300, "Cajado");
		Jogador arqueiro = new Arqueiro("Legolas", 350, "Arco");
		
		Curavel inimigoCuravel = cavaleiroPrata;
		Inimigo inimigo = cavaleiroPrata;
		
		if(cavaleiroNegro instanceof CavaleiroNegro) {
			CavaleiroNegro cav = (CavaleiroNegro)cavaleiroNegro;
			cav.ataqueRapido();
		}
		
		if(cavaleiroPrata instanceof CavaleiroPrata) {
			CavaleiroPrata cav = (CavaleiroPrata)cavaleiroPrata;
			cav.ataqueForte();
		}
		
		zumbiLerdo.atacando();
		cavaleiroNegro.atacando();
		cavaleiroPrata.atacando();
		
		guerreiro.atacar(zumbiLerdo);
		zumbiLerdo.tomarDano(zumbiLerdo);
		
		guerreiro.atacar(cavaleiroPrata);
		cavaleiroPrata.tomarDano(cavaleiroPrata);
		guerreiro.atacar(cavaleiroPrata);
		cavaleiroPrata.recuperarVida();
		guerreiro.atacar(cavaleiroPrata);
		cavaleiroPrata.tomarDano(cavaleiroPrata);
		guerreiro.atacar(cavaleiroPrata);
		cavaleiroPrata.tomarDano(cavaleiroPrata);

		
		
		cavaleiroPrata.mostrarInfo(cavaleiroPrata);
		guerreiro.mostrarInfo(guerreiro);

	}

}