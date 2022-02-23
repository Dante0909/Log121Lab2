package framework.de;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * CollectionDes
 */
public class CollectionDes implements Collection<De> {

    private List<De> des;

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
    public Iterator<De> iterator() {
        return new DeIterateur(this);
    }

    @Override
    public De[] toArray() {
        return (De[]) this.des.toArray(); // Retourer le bon type
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.des.toArray(a);
    }

    @Override
    public boolean add(De e) {
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
    public boolean addAll(Collection<? extends De> c) {
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