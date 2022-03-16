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
Nom du fichier: De.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework.de;

import java.util.Random;

/**
 * De
 */
public class De implements Comparable<De> {

    private int nbFaces;
    private int faceActuelle;

    public De(int nbFaces) {
        if (nbFaces < 1) {
            throw new IllegalArgumentException();
        }
        this.nbFaces = nbFaces;
    }

    public De() {
    }

    public int getFaceActuelle() {
        return this.faceActuelle;
    }

    public void setFaceActuelle(int face) {
        if (face < 1 || face > nbFaces) {
            throw new IllegalArgumentException();
        }
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
    public int compareTo(De de2) {
        if (de2 == null) {
            throw new IllegalArgumentException();
        }
        Integer face = Integer.valueOf(this.getFaceActuelle());
        Integer face2 = Integer.valueOf(de2.getFaceActuelle());
        return face.compareTo(face2);
    }
}