package framework.joueur;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * CollectionJoueur
 */
public class CollectionJoueur implements Collection<Joueur> {

    private List<Joueur> joueurs;

    public CollectionJoueur(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public int size() {
        return this.joueurs.size();
    }

    @Override
    public boolean isEmpty() {
        return this.joueurs.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.joueurs.contains(o);
    }

    @Override
    public Iterator<Joueur> iterator() {
        return new JoueurIterateur(this);
    }

    @Override
    public Joueur[] toArray() {
        return (Joueur[]) this.joueurs.toArray(); // Retourer le bon type
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.joueurs.toArray(a);
    }

    @Override
    public boolean add(Joueur e) {
        return this.joueurs.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return this.joueurs.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.joueurs.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Joueur> c) {
        return this.joueurs.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.joueurs.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.joueurs.retainAll(c);
    }

    @Override
    public void clear() {
        this.joueurs.clear();

    }

}