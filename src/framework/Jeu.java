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

    public Jeu(CollectionDice d, CollectionPlayer p) {
    	this.players = p;
    	this.dices = d;
    }

    public void setStrategy(Strategy strategy){
    	this.strategy = strategy;
	}

	public CollectionPlayer getPlayers(){
    	return players;
	}

    public void lancerJeu() {
    	
    }
    
}