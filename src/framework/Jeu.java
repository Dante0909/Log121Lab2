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

    public Jeu(CollectionDice d, CollectionPlayer p, Strategy s) {
    	this.players = p;
    	this.dices = d;
    	strategy = s;
    }

   
	public CollectionPlayer getPlayers(){
    	return players;
	}

    public void lancerJeu() {
    	
    	for(int i = 0; i < strategy.getNbTurns(); ++i) {
    		
    		var hand = players.iterator();
    		
    		while(hand.hasNext()) {
    			var p = hand.next();
    			boolean passHand = false;
    			while(!passHand) {
    				passHand = strategy.calculerScoreTour(p, dices, i + 1);
    			}
    		}
    	}
    	var p = strategy.calculerVainqueur(players);
    	System.out.println("Winner is " + p.getNom());
    }
    
}