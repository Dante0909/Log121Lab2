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
    	strategy = s;
    	players = p;
    	dices = d;
    }
    public void lancerJeu() {
    	
    }
    
}