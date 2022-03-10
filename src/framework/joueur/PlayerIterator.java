package framework.joueur;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * JoueurIterateur
 */
public class PlayerIterator implements Iterator<Player> {

    private Player[] joueurs;
    private int indice;

    public PlayerIterator(CollectionPlayer joueurs) {
        this.joueurs = joueurs.toArray();
        this.indice = -1; // car on doit appeller next() au début pour avoir le premier element
    }

    @Override
    public boolean hasNext() {
        return this.indice + 1 < this.joueurs.length;
    }

    @Override
    public Player next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.indice++;
        return this.current();
    }

    public Player current() {
        if (this.indice == -1) {
            throw new NoSuchElementException();
        }
        return this.joueurs[this.indice];
    }

    /**
     * LA METHODE CREATE ITERATOR EST OU ?? - sunny
     */

}