package framework;

import framework.de.CollectionDice;
import framework.joueur.CollectionPlayer;
import framework.joueur.Player;

/**
 * Interface Stategie
 *
 * Cette interface va implementer toute les methodes requises pour cree une
 * strategie
 */
public interface Strategy {

    /**
     * Methode pour calculer le vainqueur
     * 
     * @param jeu une instance du jeu
     * @return Joueur gagnant
     */
    CollectionPlayer calculerVainqueur(CollectionPlayer players);

    /**
     * Methode pour calculer le score du tour
     * 
     * @param turn TODO
     * @param jeu  une instance du jeu
     * @return le score du tour
     */
    boolean calculerScoreTour(Player player, CollectionDice dices, int turn);

    int getNbTurns();
}