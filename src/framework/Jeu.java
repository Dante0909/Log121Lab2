package framework;

import framework.de.*;
import framework.joueur.CollectionPlayer;
import framework.joueur.*;

/**
 * Jeu
 */
public class Jeu {

	private Strategy strategy;
	private CollectionPlayer players;
	private CollectionDice dices;

    public Jeu(Strategy s, CollectionDice d, CollectionPlayer p) {
    	this.strategy = s;
    	this.players = p;
    	this.dices = d;
    }
    public void lancerJeu() {
    	
    }
    
}