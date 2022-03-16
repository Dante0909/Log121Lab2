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
Nom du fichier: CollectionDe.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework.de;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * CollectionDes
 */
public class CollectionDe implements Collection<De> {

    private List<De> des;

    public CollectionDe(List<De> des) {
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
    public IterateurDe iterator() {
        return new IterateurDe(this);
    }

    @Override
    public De[] toArray() {
        Object[] array = this.des.toArray();
        De[] des = new De[array.length];
        Arrays.setAll(des, i -> (De) array[i]); // Retourer le bon type
        return des;
    }

    @Override
    public <T> T[] toArray(T[] des) {
        return this.des.toArray(des);
    }

    @Override
    public boolean add(De de) {
        return this.des.add(de);
    }

    @Override
    public boolean remove(Object de) {
        return this.des.remove(de);
    }

    @Override
    public boolean containsAll(Collection<?> des) {
        return this.des.containsAll(des);
    }

    @Override
    public boolean addAll(Collection<? extends De> des) {
        return this.des.addAll(des);
    }

    @Override
    public boolean removeAll(Collection<?> des) {
        return this.des.removeAll(des);
    }

    @Override
    public boolean retainAll(Collection<?> des) {
        return this.des.retainAll(des);
    }

    @Override
    public void clear() {
        this.des.clear();

    }

}