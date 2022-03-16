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
Nom du fichier: IterateurDe.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework.de;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * DeIterateur
 */
public class IterateurDe implements Iterator<De> {

    private De[] des;
    private int indice;

    public IterateurDe(CollectionDe des) {
        this.des = des.toArray();
        this.indice = -1; // car on doit appeller next() au début pour avoir le premier element
    }

    @Override
    public boolean hasNext() {
        return this.indice + 1 < this.des.length;
    }

    @Override
    public De next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.indice++;
        return this.des[this.indice];
    }

}