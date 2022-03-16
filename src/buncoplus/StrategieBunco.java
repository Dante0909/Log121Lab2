package buncoplus;

import framework.Strategie;
import framework.de.CollectionDe;
import framework.de.De;
import framework.de.IterateurDe;
import framework.joueur.CollectionJoueur;
import framework.joueur.Joueur;
import framework.joueur.IterateurJoueur;

/**
 * Classe : StrategieBunco
 *
 * Cette classe implemente l'interface Strategie et sert a calculer le score du
 * tour
 * ainsi que le vainqueur selon le jeu Bunco
 *
 */
public class StrategieBunco implements Strategie {

	static final private int scoreBunco = 21;
	static final private int scoreTriplet = 5;
	static final private int nbTours = 6;

	@Override
	public CollectionJoueur calculerVainqueur(CollectionJoueur joueurs) {
		if (joueurs == null) {
			throw new IllegalArgumentException();
		}
		if (joueurs.size() < 2) {
			throw new IllegalArgumentException();
		}

		IterateurJoueur iterateurJoueurs = joueurs.iterator();
		CollectionJoueur joueursTries = new CollectionJoueur();

		while (iterateurJoueurs.hasNext()) {

			Joueur noveauJoueur = iterateurJoueurs.next();
			CollectionJoueur noveauJoueursTries = new CollectionJoueur();
			boolean inserted = false;
			IterateurJoueur iterateurJoueursTries = joueursTries.iterator();

			while (iterateurJoueursTries.hasNext()) {

				Joueur joueur = iterateurJoueursTries.next();
				if (noveauJoueur.compareTo(joueur) > 0) {
					noveauJoueursTries.add(noveauJoueur);
					inserted = true;
				}
				noveauJoueursTries.add(joueur);

			}
			if (!inserted) {
				noveauJoueursTries.add(noveauJoueur);
			}
			joueursTries = noveauJoueursTries;

		}
		return joueursTries;
	}

	@Override
	public boolean calculerScoreTour(Joueur joueur, CollectionDe des, int tour) {
		if (joueur == null || des == null) {
			throw new IllegalArgumentException();
		}
		if (des.size() < 1 || tour < 1) {
			throw new IllegalArgumentException();
		}

		IterateurDe iterateur = des.iterator();
		int score = 0;
		boolean facesIdentiques = true;
		int derniereFace = -1;
		while (iterateur.hasNext()) {
			De de = iterateur.next();
			int face = de.getFaceActuelle();
			System.out.println("Lancé de dé : " + face);
			if (tour == face) {
				score++;
			}
			if (derniereFace != -1 && derniereFace != face) {
				facesIdentiques = false;
			}
			derniereFace = face;
		}
		if (facesIdentiques) {
			if (derniereFace == tour) {
				score = scoreBunco;
				System.out.println("Bunco !");
			} else {
				score = scoreTriplet;
			}
		}

		joueur.setScoreTourActuel(joueur.getScoreTourActuel() + score);

		return score == 0 || score == scoreBunco;
	}

	@Override
	public int getNbTours() {

		return nbTours;
	}

}