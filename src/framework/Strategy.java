package framework;

import framework.joueur.Player;

/**
 * Interface Stategie
 *
 * Cette interface va implementer toute les methodes requises pour cree une strategie
 */
public interface Strategy {

    /**
     * Methode pour calculer le vainqueur
     * @param jeu une instance du jeu
     * @return Joueur gagnant
     */
    Player calculerVainqueur(Jeu jeu);

    /**
     * Methode pour calculer le score du tour
     * @param jeu une instance du jeu
     * @return le score du tour
     */
    int calculerScoreTour(Jeu jeu);

}