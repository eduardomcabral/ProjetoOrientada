package br.edu.ufabc.poo.darksouls;

import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroNegro;
import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroPrata;
import br.edu.ufabc.poo.darksouls.inimigos.ZumbiLerdo;
import br.edu.ufabc.poo.darksouls.inimigos.Inimigo;
import br.edu.ufabc.poo.darksouls.jogador.Jogador;
import br.edu.ufabc.poo.darksouls.jogador.Mago;
import br.edu.ufabc.poo.darksouls.jogador.Guerreiro;
import br.edu.ufabc.poo.darksouls.jogador.Arqueiro;
import br.edu.ufabc.poo.darksouls.jogador.Sacerdote;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogadorTest {

	@Test
    public void testeMagoAtacando() {
		ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
    	Mago mago = new Mago("Merlin", 300, "Cajado");
    	assertEquals("Merlin atacando o Zumbi Lerdo", mago.atacar(zumbi));
	}

    @Test
    public void testeGuerreiroAtacando() {
    	CavaleiroNegro negro = new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
    	Guerreiro guerreiro = new Guerreiro("Conan", 500, "Machado");
    	assertEquals("Conan atacando o Cavaleiro Negro", guerreiro.atacar(negro));
    }

    @Test
    public void testeArqueiroAtacando() {
    	CavaleiroPrata prata = new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
    	Arqueiro arqueiro = new Arqueiro("Legolas", 350, "Arco");
    	assertEquals("Legolas atacando o Cavaleiro Prata", arqueiro.atacar(prata));
    }
    
    @Test
    public void testeSacerdoteAtacando() {
    	CavaleiroPrata prata = new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
    	Sacerdote sacerdote = new Sacerdote("Joao Paulo", 250, "Livro");
    	assertEquals("Joao Paulo atacando o Cavaleiro Prata", sacerdote.atacar(prata));
    }
    
    @Test
    public void testeSacerdoteRecuperando() {
    	Sacerdote sacerdote = new Sacerdote("Joao Paulo", 250, "Livro");
    	sacerdote.tomarDano(sacerdote);
    	sacerdote.tomarDano(sacerdote);
    	sacerdote.tomarDano(sacerdote);
    	assertEquals("Joao Paulo recuperou 30 de vida, HP atual: 190.0", sacerdote.recuperarVida());
    }
    
    @Test
    public void testeMagoRecuperando() {
    	Mago mago = new Mago("Merlin", 300, "Cajado");
    	mago.tomarDano(mago);
    	mago.tomarDano(mago);
    	mago.tomarDano(mago);
    	mago.tomarDano(mago);
    	assertEquals("Merlin recuperou 20 de vida, HP atual: 200.0", mago.recuperarVida());
    }

}
