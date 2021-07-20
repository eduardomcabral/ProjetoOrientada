package br.edu.ufabc.poo.darksouls;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroNegro;
import br.edu.ufabc.poo.darksouls.inimigos.CavaleiroPrata;
import br.edu.ufabc.poo.darksouls.inimigos.ZumbiLerdo;

public class InimigoTest{
    @Test
    public void testeZumbiLerdoAtacando() {
    	ZumbiLerdo zumbi = new ZumbiLerdo("Zumbi Lerdo", 50, "Espada Curta");
    	assertEquals("Zumbi Lerdo atacando", zumbi.atacando());
	}

    @Test
    public void testeCavaleiroNegroAtacando() {
    	CavaleiroNegro cavaleiroNegro = new CavaleiroNegro("Cavaleiro Negro", 150, "Espada Longa");
    	assertEquals("Cavaleiro Negro atacando normal", cavaleiroNegro.atacando());
    	assertEquals("Cavaleiro Negro atacando rapido!", cavaleiroNegro.ataqueRapido());
    }

    @Test
    public void testeCavaleiroPrataAtacando() {
    	CavaleiroPrata cavaleiroPrata = new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
    	assertEquals("Cavaleiro Prata atacando normal", cavaleiroPrata.atacando());
    	assertEquals("Cavaleiro Prata atacando forte!", cavaleiroPrata.ataqueForte());
    }
    
    @Test
    public void testeCavaleiroPrataRecuperando() {
    	CavaleiroPrata cavaleiroPrata = new CavaleiroPrata("Cavaleiro Prata", 175, "Silver Sword");
    	cavaleiroPrata.tomarDano(cavaleiroPrata);
    	cavaleiroPrata.tomarDano(cavaleiroPrata);
    	assertEquals("Cavaleiro Prata recuperou 40 de vida, HP atual: 115.0", cavaleiroPrata.recuperarVida());
    }
    
}