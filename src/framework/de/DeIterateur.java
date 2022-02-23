package framework.de;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * DeIterateur
 */
public class DeIterateur implements Iterator<De> {

    private De[] des;
    private int indice;

    public DeIterateur(CollectionDes des) {
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
        return this.current();
    }

    public De current() {
        if (this.indice == -1) {
            throw new NoSuchElementException();
        }
        return this.des[this.indice];
    }

}