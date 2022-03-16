/******************************************************
Cours:   LOG121
Session: H2022
Groupe:  11
Projet: Laboratoire #2
Étudiant(e)s: 
- Luca Borsato
- Sunny Modha
- Mathias Glorieux
              
              
Professeur : Souad Hadjres
Chargé de laboratoire : Bilal Alchalabi
Nom du fichier: Strategie.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework;

import framework.de.CollectionDe;
import framework.joueur.CollectionJoueur;
import framework.joueur.Joueur;

/**
 * Interface Stategie
 *
 * Cette interface va implementer toute les methodes requises pour cree une
 * strategie
 */
public interface Strategie {

    /**
     * Methode pour calculer le vainqueur
     * 
     * @param jeu une instance du jeu
     * @return Joueur gagnant
     */
    CollectionJoueur calculerVainqueur(CollectionJoueur joueurs);

    /**
     * Methode pour calculer le score du tour
     * 
     * @param tour TODO
     * @param jeu  une instance du jeu
     * @return le score du tour
     */
    boolean calculerScoreTour(Joueur joueur, CollectionDe des, int tour);

    int getNbTours();
}