package framework.joueur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * CollectionJoueur
 */
public class CollectionJoueur implements Collection<Joueur> {

    private List<Joueur> joueurs;

    public CollectionJoueur(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public CollectionJoueur() {
        this.joueurs = new ArrayList<Joueur>();
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
    public boolean contains(Object joueur) {
        return this.joueurs.contains(joueur);
    }

    @Override
    public IterateurJoueur iterator() {
        return new IterateurJoueur(this);
    }

    @Override
    public Joueur[] toArray() {
        Object[] array = this.joueurs.toArray();
        Joueur[] joueurs = new Joueur[array.length];
        Arrays.setAll(joueurs, i -> (Joueur) array[i]); // Retourer le bon type
        return joueurs;
    }

    @Override
    public <T> T[] toArray(T[] joueurs) {
        return this.joueurs.toArray(joueurs);
    }

    @Override
    public boolean add(Joueur joueur) {
        return this.joueurs.add(joueur);
    }

    @Override
    public boolean remove(Object joueur) {
        return this.joueurs.remove(joueur);
    }

    @Override
    public boolean containsAll(Collection<?> joueurs) {
        return this.joueurs.containsAll(joueurs);
    }

    @Override
    public boolean addAll(Collection<? extends Joueur> joueurs) {
        return this.joueurs.addAll(joueurs);
    }

    @Override
    public boolean removeAll(Collection<?> joueurs) {
        return this.joueurs.removeAll(joueurs);
    }

    @Override
    public boolean retainAll(Collection<?> joueurs) {
        return this.joueurs.retainAll(joueurs);
    }

    @Override
    public void clear() {
        this.joueurs.clear();

    }

    public Joueur get(int i) {
        return this.joueurs.get(i);
    }

}