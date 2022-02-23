package buncoplus;

import java.util.ArrayList;

import framework.Fabrique;
import framework.Jeu;
import framework.Strategie;
import framework.de.*;
import framework.joueur.*;

/**
 * FabriqueBunco
 */
public class FabriqueBunco extends Fabrique {

	private int nbPlayers = 2;

	public FabriqueBunco(int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}

	public FabriqueBunco() {

	}

	@Override
	protected CollectionJoueur createPlayers() {
		var a = new ArrayList<Joueur>();

		for (int i = 0; i < nbPlayers; ++i) {
			a.add(new Joueur());
		}
		var p = new CollectionJoueur();
		return p;
	}

	@Override
	protected CollectionDes createDices() {
		var a = new ArrayList<De>();
		var d = new CollectionDes();
		return d;
	}

	@Override
	protected Strategie createStrategy() {
		// TODO Auto-generated method stub
		return new StrategieBunco();
	}

	@Override
	public Jeu createGame() {
		var s = createStrategy();
		var p = createPlayers();
		var d = createDices();
		return new Jeu(s, d, p);

	}

}