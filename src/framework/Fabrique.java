package framework;

import framework.de.*;
import framework.joueur.*;

/**
 * Fabrique
 */
public abstract class Fabrique {
	protected abstract CollectionJoueur creerJoueurs();

	protected abstract CollectionDe creerDes();

	protected abstract Strategie creerStrategie();

	public abstract Jeu creerJeu();
}