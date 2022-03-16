package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import buncoplus.StrategieBunco;
import framework.de.CollectionDe;
import framework.de.De;
import framework.joueur.CollectionJoueur;
import framework.joueur.Joueur;

public class StrategieBuncoTest {

    private StrategieBunco strategieBunco;

    @Before
    public void faireAvant() {
        strategieBunco = new StrategieBunco();
    }

    @Test(expected = IllegalArgumentException.class)
    public void strategieBuncoNull1Test() {
        strategieBunco.calculerVainqueur(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void strategieBuncoNull2Test() {

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(null, des, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void strategieBuncoNull1Test() {

        Joueur joueur = new Joueur("1");

        strategieBunco.calculerScoreTour(joueur, null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void strategieBuncoInferieur1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void strategieBuncoInferieur2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, -1);
    }

    @Test
    public void strategieBuncoBunco1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(3);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(3);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, 3);

        assertTrue(joueur.getScoreTourActuel() == 21);
    }

    @Test
    public void strategieBuncoBunco2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(3);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(3);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        assertTrue(strategieBunco.calculerScoreTour(joueur, des, 3));
    }

    @Test
    public void strategieBuncoTiplet1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(3);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(3);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, 4);

        assertTrue(joueur.getScoreTourActuel() == 5);
    }

    @Test
    public void strategieBuncoTiplet2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(3);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(3);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        assertTrue(!strategieBunco.calculerScoreTour(joueur, des, 4));
    }

    @Test
    public void strategieBuncoUnBonDe1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(4);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(5);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, 3);

        assertTrue(joueur.getScoreTourActuel() == 1);
    }

    @Test
    public void strategieBuncoUnBonDe2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(4);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(5);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        assertTrue(!strategieBunco.calculerScoreTour(joueur, des, 3));
    }

    @Test
    public void strategieBuncoAucunBonDe1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(4);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(5);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        strategieBunco.calculerScoreTour(joueur, des, 1);

        assertTrue(joueur.getScoreTourActuel() == 0);
    }

    @Test
    public void strategieBuncoAucunBonDe2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        De de1 = new De(6);
        de1.setFaceActuelle(3);
        listeDes.add(de1);
        De de2 = new De(6);
        de2.setFaceActuelle(4);
        listeDes.add(de2);
        De de3 = new De(6);
        de3.setFaceActuelle(5);
        listeDes.add(de3);
        CollectionDe des = new CollectionDe(listeDes);

        assertTrue(strategieBunco.calculerScoreTour(joueur, des, 1));
    }

    @Test
    public void strategieBuncoClassement1Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        Joueur joueur1 = new Joueur("1");
        joueur1.setScoreTotal(1);
        joueur1.setVictoires(1);
        listeJoueurs.add(joueur1);
        Joueur joueur2 = new Joueur("2");
        joueur2.setScoreTotal(4);
        joueur2.setVictoires(4);
        listeJoueurs.add(joueur2);
        Joueur joueur3 = new Joueur("3");
        joueur3.setScoreTotal(21);
        joueur3.setVictoires(1);
        listeJoueurs.add(joueur3);
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        assertTrue(strategieBunco.calculerVainqueur(joueurs).get(0) == joueur2);
    }

    @Test
    public void strategieBuncoClassement2Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        Joueur joueur1 = new Joueur("1");
        joueur1.setScoreTotal(1);
        joueur1.setVictoires(1);
        listeJoueurs.add(joueur1);
        Joueur joueur2 = new Joueur("2");
        joueur2.setScoreTotal(4);
        joueur2.setVictoires(4);
        listeJoueurs.add(joueur2);
        Joueur joueur3 = new Joueur("3");
        joueur3.setScoreTotal(21);
        joueur3.setVictoires(1);
        listeJoueurs.add(joueur3);
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        assertTrue(strategieBunco.calculerVainqueur(joueurs).get(1) == joueur3);
    }

    @Test
    public void strategieBuncoClassement3Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        Joueur joueur1 = new Joueur("1");
        joueur1.setScoreTotal(1);
        joueur1.setVictoires(1);
        listeJoueurs.add(joueur1);
        Joueur joueur2 = new Joueur("2");
        joueur2.setScoreTotal(4);
        joueur2.setVictoires(4);
        listeJoueurs.add(joueur2);
        Joueur joueur3 = new Joueur("3");
        joueur3.setScoreTotal(21);
        joueur3.setVictoires(1);
        listeJoueurs.add(joueur3);
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        assertTrue(strategieBunco.calculerVainqueur(joueurs).get(2) == joueur1);
    }

}