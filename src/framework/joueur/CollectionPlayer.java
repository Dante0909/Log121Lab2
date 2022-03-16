package framework.joueur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * CollectionJoueur
 */
public class CollectionPlayer implements Collection<Player> {

    private List<Player> joueurs;

    public CollectionPlayer(List<Player> joueurs) {
        this.joueurs = joueurs;
    }

    public CollectionPlayer() {
        this.joueurs = new ArrayList<Player>();
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
    public PlayerIterator iterator() {
        return new PlayerIterator(this);
    }

    @Override
    public Player[] toArray() {
        Object[] array = this.joueurs.toArray();
        Player[] players = new Player[array.length];
        Arrays.setAll(players, index -> (Player) array[index]); // Retourer le bon type
        return players;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.joueurs.toArray(a);
    }

    @Override
    public boolean add(Player e) {
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
    public boolean addAll(Collection<? extends Player> c) {
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

    public Player get(int i) {
        return this.joueurs.get(i);
    }

}