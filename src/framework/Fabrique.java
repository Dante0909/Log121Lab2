package framework;

import framework.de.*;
import framework.joueur.*;

/**
 * Fabrique
 */
public abstract class Fabrique {
	protected abstract CollectionJoueur createPlayers();
	protected abstract CollectionDes createDices();
	protected abstract Strategie createStrategy();
	public abstract Jeu createGame();
}