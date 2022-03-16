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
Nom du fichier: Joueur.java
Date dern. modif. 2022-03-16
*******************************************************/

package framework.joueur;

/**
 * Joueur
 */
public class Joueur implements Comparable<Joueur> {

    private String nom;
    private int scoreTotal;
    private int scoreTourActuel;
    private int victoires;

    public Joueur(String nom) {
        if (nom == null) {
            throw new IllegalArgumentException();
        }
        this.nom = nom;
        this.scoreTotal = 0;
        this.scoreTourActuel = 0;
        this.victoires = 0;
    }

    @Override
    public int compareTo(Joueur joueur2) {
        if (joueur2 == null) {
            throw new IllegalArgumentException();
        }
        Integer victoires = Integer.valueOf(this.getVictoires());
        Integer victoires2 = Integer.valueOf(joueur2.getVictoires());
        int result = victoires.compareTo(victoires2);
        if (result == 0) {
            Integer score = Integer.valueOf(this.getScoreTotal());
            Integer score2 = Integer.valueOf(joueur2.getScoreTotal());
            result = score.compareTo(score2);
        }
        return result;
    }

    public int getScoreTotal() {
        return this.scoreTotal;
    }

    public void setScoreTotal(int score) {
        if (score < 0) {
            throw new IllegalArgumentException();
        }
        this.scoreTotal = score;
    }

    public int getScoreTourActuel() {
        return this.scoreTourActuel;
    }

    public void setScoreTourActuel(int score) {
        if (score < 0) {
            throw new IllegalArgumentException();
        }
        this.scoreTourActuel = score;
    }

    public void incrementerVictoires() {
        this.victoires++;
    }

    public void setVictoires(int victoires) {
        if (victoires < 0) {
            throw new IllegalArgumentException();
        }
        this.victoires = victoires;
    }

    public int getVictoires() {
        return this.victoires;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        if (nom == null) {
            throw new IllegalArgumentException();
        }
        this.nom = nom;
    }

}