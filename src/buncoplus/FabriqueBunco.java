package buncoplus;

import java.util.ArrayList;

import framework.Fabrique;
import framework.Jeu;
import framework.Strategy;
import framework.de.*;
import framework.joueur.*;

/**
 * FabriqueBunco
 */
public class FabriqueBunco extends Fabrique {

	private int nbPlayers = 2;

	/*public FabriqueBunco(int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}
*/
	public FabriqueBunco() {

	}
	public FabriqueBunco(int n) {
		nbPlayers = n;
	}

	@Override
	protected CollectionPlayer createPlayers() {
		var a = new ArrayList<Player>();

		for (int i = 0; i < nbPlayers; ++i) {
			a.add(new Player("Player "+ i+1));
		}
		var p = new CollectionPlayer(a);
		return p;
	}

	@Override
	protected CollectionDice createDices() {
		var a = new ArrayList<Dice>();
		var d = new CollectionDice(a);
		return d;
	}

	@Override
	protected Strategy createStrategy() {
		return new StrategyBunco();
	}

	@Override
	public Jeu createGame() {
		var s = createStrategy();
		var p = createPlayers();
		var d = createDices();
		return new Jeu(d, p, s);

	}

}