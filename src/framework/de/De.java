package framework.de;

import java.util.Random;

/**
 * De
 */
public class De implements Comparable<De> {

    private int nbFaces;
    private int faceActuelle;

    public De(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public De() {
    }

    public int getFaceActuelle() {
        return this.faceActuelle;
    }

    public void setFaceActuelle(int face) {
        this.faceActuelle = face;
    }

    public int getNbFaces() {
        return this.nbFaces;
    }

    public void rouler() {
        Random random = new Random();
        this.setFaceActuelle(random.nextInt(this.nbFaces) + 1); // +1 car nextInt génère un entier entre 0 et nbFaces-1
    }

    @Override
    public int compareTo(De autre) {
        Integer cetteFace = Integer.valueOf(this.getFaceActuelle());
        Integer autreFace = Integer.valueOf(autre.getFaceActuelle());
        return cetteFace.compareTo(autreFace);
    }
}