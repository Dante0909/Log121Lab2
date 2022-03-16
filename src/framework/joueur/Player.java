package framework.joueur;

/**
 * Joueur
 */
public class Player implements Comparable<Player> {

    private String nom;
    private int totalScore;
    private int currentRoundScore;
    private int wins;

    public Player(String nom) {
        this.nom = nom;
        this.totalScore = 0;
        this.currentRoundScore = 0;
        this.wins = 0;
    }

    @Override
    public int compareTo(Player player2) {
        Integer wins = Integer.valueOf(this.getWins());
        Integer wins2 = Integer.valueOf(player2.getWins());
        int result = wins.compareTo(wins2);
        if (result == 0) {
            Integer score = Integer.valueOf(this.getTotalScore());
            Integer score2 = Integer.valueOf(player2.getTotalScore());
            result = score.compareTo(score2);
        }
        return result;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void setTotalScore(int score) {
        this.totalScore = score;
    }

    public int getCurrentRoundScore() {
        return this.currentRoundScore;
    }

    public void setCurrentRoundScore(int score) {
        this.currentRoundScore = score;
    }

    public void incrementWins() {
        this.wins++;
    }

    public int getWins() {
        return this.wins;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}