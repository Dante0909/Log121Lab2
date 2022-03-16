package tests;

import org.junit.*;

import framework.joueur.Joueur;

public class JoueurTest {

    private Joueur joueur1;
    private Joueur joueur2;

    @Before
    public void faireAvant() {
        joueur1 = new Joueur("1");
        joueur2 = new Joueur("2");
    }

    @Test
    public void joueurConstructeurNomTest() {
        assertTrue(joueur1.getNom().equals("1"));
    }

    @Test
    public void joueurConstructeurScoreTotalTest() {
        assertTrue(joueur1.getScoreTotal() == 0);
    }

    @Test
    public void joueurConstructeurScoreTourActuelTest() {
        assertTrue(joueur1.getScoreTourActuel() == 0);
    }

    @Test
    public void joueurConstructeurVictoiresTest() {
        assertTrue(joueur1.getVictoires() == 0);
    }

    @Test
    public void joueurVictoiresTest() {
        joueur1.incrementerVictoires();
        assertTrue(joueur1.getVictoires() == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurSetNomNullTest() {
        joueur1.setNom(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurSetScoreTotalNegatifTest() {
        joueur1.setScoreTotal(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurSetScoreTourActuelNegatifTest() {
        joueur1.setScoreTourActuel(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurSetVictoiresNegatifTest() {
        joueur1.setVictoires(-1);
    }

    @Test
    public void memeJoueurTest() {
        assertTrue(joueur1.compareTo(joueur1) == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurNullTest() {
        joueur1.compareTo(null);
    }

    @Test
    public void joueurInferieur1Test() {
        joueur1.setVictoires(4);
        joueur1.setScoreTotal(10);
        joueur2.setVictoires(5);
        joueur2.setScoreTotal(9);
        assertTrue(joueur1.compareTo(joueur2) == -1);
    }

    @Test
    public void joueurInferieur2Test() {
        joueur1.setVictoires(5);
        joueur1.setScoreTotal(9);
        joueur2.setVictoires(5);
        joueur2.setScoreTotal(10);
        assertTrue(joueur1.compareTo(joueur2) == -1);
    }

    @Test
    public void joueurSuperieur1Test() {
        joueur1.setVictoires(4);
        joueur1.setScoreTotal(10);
        joueur2.setVictoires(4);
        joueur2.setScoreTotal(9);
        assertTrue(joueur1.compareTo(joueur2) == 1);
    }

    @Test
    public void joueurSuperieur2Test() {
        joueur1.setVictoires(4);
        joueur1.setScoreTotal(9);
        joueur2.setVictoires(3);
        joueur2.setScoreTotal(10);
        assertTrue(joueur1.compareTo(joueur2) == 1);
    }

    @Test
    public void joueurSetEtGetNomTest() {
        joueur1.setNom("a");
        assertTrue(joueur1.getNom().equals("a"));
    }

    @Test
    public void joueurSetEtGetScoreTotalTest() {
        joueur1.setScoreTotal(15);
        assertTrue(joueur1.getScoreTotal() == 15);
    }

    @Test
    public void joueurSetEtGetScoreTourActuelTest() {
        joueur1.setScoreTourActuel(5);
        assertTrue(joueur1.getScoreTourActuel() == 5);
    }

    @Test
    public void joueurSetEtGetVictoiresTest() {
        joueur1.setVictoires(10);
        assertTrue(joueur1.getVictoires() == 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void joueurConstructeurNullTest() {
        new Joueur(null);
    }
}