package framework;

import framework.de.*;
import framework.joueur.*;

/**
 * Fabrique
 */
public abstract class Fabrique {
	protected abstract CollectionPlayer createPlayers();
	protected abstract CollectionDice createDices();
	protected abstract Strategy createStrategy();
	public abstract Jeu createGame();
}