package framework.de;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * CollectionDes
 */
public class CollectionDice implements Collection<Dice> {

    private List<Dice> des;

    public CollectionDice(List<Dice> des) {
        this.des = des;
    }

    @Override
    public int size() {
        return this.des.size();
    }

    @Override
    public boolean isEmpty() {
        return this.des.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.des.contains(o);
    }

    @Override
    public DiceIterator iterator() {
        return new DiceIterator(this);
    }

    @Override
    public Dice[] toArray() {
        Object[] array = this.des.toArray();
        Dice[] dices = new Dice[array.length];
        Arrays.setAll(dices, index -> (Dice) array[index]); // Retourer le bon type
        return dices;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.des.toArray(a);
    }

    @Override
    public boolean add(Dice e) {
        return this.des.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.des.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.des.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Dice> c) {
        return this.des.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.des.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.des.retainAll(c);
    }

    @Override
    public void clear() {
        this.des.clear();

    }

}