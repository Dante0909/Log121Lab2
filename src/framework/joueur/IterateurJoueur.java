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
Nom du fichier: joueurIterateur.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework.joueur;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * JoueurIterateur
 */
public class IterateurJoueur implements Iterator<Joueur> {

    private Joueur[] joueurs;
    private int indice;

    public IterateurJoueur(CollectionJoueur joueurs) {
        this.joueurs = joueurs.toArray();
        this.indice = -1; // car on doit appeller next() au début pour avoir le premier element
    }

    @Override
    public boolean hasNext() {
        return this.indice + 1 < this.joueurs.length;
    }

    @Override
    public Joueur next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.indice++;
        return this.joueurs[this.indice];
    }

}