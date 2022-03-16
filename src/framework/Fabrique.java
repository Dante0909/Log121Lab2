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
Nom du fichier: Fabrique.java
Date dern. modif. 2022-03-16
*******************************************************/

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