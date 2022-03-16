package buncoplus;

import java.util.ArrayList;
import java.util.List;

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

	private int nbDices = 3;

	private int nbFaces = 6;

	/*
	 * public FabriqueBunco(int nbPlayers) {
	 * this.nbPlayers = nbPlayers;
	 * }
	 */
	public FabriqueBunco() {

	}

	public FabriqueBunco(int n) {
		nbPlayers = n;
	}

	@Override
	protected CollectionPlayer createPlayers() {
		List<Player> a = new ArrayList<Player>();

		for (int i = 0; i < nbPlayers; ++i) {
			a.add(new Player("Player " + i + 1));
		}
		CollectionPlayer p = new CollectionPlayer(a);
		return p;
	}

	@Override
	protected CollectionDice createDices() {
		List<Dice> a = new ArrayList<Dice>();

		for (int i = 0; i < nbDices; ++i) {
			a.add(new Dice(nbFaces));
		}
		CollectionDice d = new CollectionDice(a);
		return d;
	}

	@Override
	protected Strategy createStrategy() {
		return new StrategyBunco();
	}

	@Override
	public Jeu createGame() {
		Strategy s = createStrategy();
		CollectionPlayer p = createPlayers();
		CollectionDice d = createDices();
		return new Jeu(d, p, s);

	}

}