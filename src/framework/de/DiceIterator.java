package framework.de;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * DeIterateur
 */
public class DiceIterator implements Iterator<Dice> {

    private Dice[] des;
    private int indice;

    public DiceIterator(CollectionDice des) {
        this.des = des.toArray();
        this.indice = -1; // car on doit appeller next() au début pour avoir le premier element
    }

    @Override
    public boolean hasNext() {
        return this.indice + 1 < this.des.length;
    }

    @Override
    public Dice next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.indice++;
        return this.current();
    }

    public Dice current() {
        if (this.indice == -1) {
            throw new NoSuchElementException();
        }
        return this.des[this.indice];
    }

}