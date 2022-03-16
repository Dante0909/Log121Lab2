package framework;

import framework.de.*;
import framework.joueur.*;

/**
 * Jeu
 */
public class Jeu {

	private Strategie strategie;
	private CollectionJoueur joueurs;
	private CollectionDe des;

	public Jeu(CollectionDe des, CollectionJoueur joueurs, Strategie strategie) {
		if (joueurs == null || des == null || strategie == null) {
			throw new IllegalArgumentException();
		}
		if (joueurs.size() < 2 || des.size() < 1) {
			throw new IllegalArgumentException();
		}
		this.joueurs = joueurs;
		this.des = des;
		this.strategie = strategie;
	}

	public void lancerJeu() {

		for (int i = 0; i < strategie.getNbTours(); ++i) {

			System.out.println("\n\nTour n°" + (i + 1) + "\n");

			IterateurJoueur main = joueurs.iterator();

			while (main.hasNext()) {
				Joueur joueur = main.next();
				System.out.println("\nJoueur : " + joueur.getNom());
				boolean passerMain = false;
				while (!passerMain) {
					IterateurDe iterateur = this.des.iterator();
					while (iterateur.hasNext()) {
						iterateur.next().rouler();
					}
					passerMain = this.calculerScoreTour(joueur, des, i + 1);
				}
			}

			int scoreMax = 0;
			Joueur gagnantDuTour = null;
			IterateurJoueur iterateur = joueurs.iterator();
			while (iterateur.hasNext()) {
				Joueur joueur = iterateur.next();
				int score = joueur.getScoreTourActuel();
				if (score > scoreMax) {
					gagnantDuTour = joueur;
					scoreMax = score;
				} else if (score == scoreMax) {
					// Égalité
					gagnantDuTour = null;
				}
				joueur.setScoreTotal(joueur.getScoreTotal() + score);
				joueur.setScoreTourActuel(0);
			}

			if (gagnantDuTour != null) {
				System.out.println("\n" + gagnantDuTour.getNom() + " a gagné le tour.");
				gagnantDuTour.incrementerVictoires();
			} else {
				System.out.println("\nPas de gagnant pour ce tour.");
			}
		}

		CollectionJoueur joueursTries = this.calculerVainqueur(joueurs);

		System.out.println("\n\n\n\njoueurs\n");
		for (Joueur joueur : joueursTries) {
			System.out.println(joueur);
		}

		if (joueursTries.get(0).compareTo(joueursTries.get(1)) == 0) {
			System.out.println("Égalité");
		} else {
			System.out.println("Le gagnant est " + joueursTries.get(0).getNom());
		}
	}

	public CollectionJoueur calculerVainqueur(CollectionJoueur joueurs) {
		return strategie.calculerVainqueur(joueurs);
	}

	public boolean calculerScoreTour(Joueur joueur, CollectionDe des, int tour) {
		return strategie.calculerScoreTour(joueur, des, tour);
	}

}