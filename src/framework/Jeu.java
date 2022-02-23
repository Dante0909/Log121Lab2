package framework;

import framework.de.*;
import framework.joueur.CollectionJoueur;
import framework.joueur.*;

/**
 * Jeu
 */
public class Jeu {

	private Strategie strategy;
	private CollectionJoueur players;
	private CollectionDes dices;
    public Jeu(Strategie s, CollectionDes d, CollectionJoueur p) {
    	strategy = s;
    	players = p;
    	dices = d;
    }
    public void lancerJeu() {
    	
    }
    
}