package framework.joueur;

/**
 * Joueur
 */
public class Joueur implements Comparable<Joueur> {

    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    @Override
    public int compareTo(Joueur autre) {
        Integer ceScore = Integer.valueOf(this.getScore());
        Integer autreScore = Integer.valueOf(autre.getScore());
        return ceScore.compareTo(autreScore);
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}