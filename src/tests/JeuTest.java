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
Nom du fichier: JeuTest.java
Date dern. modif. 2022-03-16
*******************************************************/

package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.*;

import buncoplus.StrategieBunco;
import framework.Jeu;
import framework.Strategie;
import framework.de.CollectionDe;
import framework.de.De;
import framework.joueur.CollectionJoueur;
import framework.joueur.Joueur;

public class JeuTest {

    private Jeu jeu;

    @Before
    public void faireAvant() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        listeJoueurs.add(new Joueur("1"));
        listeJoueurs.add(new Joueur("2"));
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        Strategie strategie = new StrategieBunco();

        jeu = new Jeu(des, joueurs, strategie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuConstructeurNull1Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        listeJoueurs.add(new Joueur("1"));
        listeJoueurs.add(new Joueur("2"));
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        new Jeu(des, joueurs, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuConstructeurNull2Test() {

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        Strategie strategie = new StrategieBunco();

        new Jeu(des, null, strategie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuConstructeurNull3Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        listeJoueurs.add(new Joueur("1"));
        listeJoueurs.add(new Joueur("2"));
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        Strategie strategie = new StrategieBunco();

        new Jeu(null, joueurs, strategie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuConstructeurInferieur1Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        listeJoueurs.add(new Joueur("1"));
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        Strategie strategie = new StrategieBunco();

        new Jeu(des, joueurs, strategie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuConstructeurInferieur2Test() {
        List<Joueur> listeJoueurs = new ArrayList<Joueur>();
        listeJoueurs.add(new Joueur("1"));
        listeJoueurs.add(new Joueur("2"));
        CollectionJoueur joueurs = new CollectionJoueur(listeJoueurs);

        List<De> listeDes = new ArrayList<De>();
        CollectionDe des = new CollectionDe(listeDes);

        Strategie strategie = new StrategieBunco();

        new Jeu(des, joueurs, strategie);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuCalculerVainqueurNull1Test() {
        jeu.calculerVainqueur(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuNull2Test() {

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        jeu.calculerScoreTour(null, des, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuNull1Test() {

        Joueur joueur = new Joueur("1");

        jeu.calculerScoreTour(joueur, null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuInferieur1Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        CollectionDe des = new CollectionDe(listeDes);

        jeu.calculerScoreTour(joueur, des, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void jeuInferieur2Test() {

        Joueur joueur = new Joueur("1");

        List<De> listeDes = new ArrayList<De>();
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        listeDes.add(new De(6));
        CollectionDe des = new CollectionDe(listeDes);

        jeu.calculerScoreTour(joueur, des, -1);
    }

    @Test
    public void jeuBunco1Test() {

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

        jeu.calculerScoreTour(joueur, des, 3);

        assertTrue(joueur.getScoreTourActuel() == 21);
    }

    @Test
    public void jeuBunco2Test() {

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

        assertTrue(jeu.calculerScoreTour(joueur, des, 3));
    }

    @Test
    public void jeuTiplet1Test() {

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

        jeu.calculerScoreTour(joueur, des, 4);

        assertTrue(joueur.getScoreTourActuel() == 5);
    }

    @Test
    public void jeuTiplet2Test() {

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

        assertTrue(!jeu.calculerScoreTour(joueur, des, 4));
    }

    @Test
    public void jeuUnBonDe1Test() {

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

        jeu.calculerScoreTour(joueur, des, 3);

        assertTrue(joueur.getScoreTourActuel() == 1);
    }

    @Test
    public void jeuUnBonDe2Test() {

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

        assertTrue(!jeu.calculerScoreTour(joueur, des, 3));
    }

    @Test
    public void jeuAucunBonDe1Test() {

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

        jeu.calculerScoreTour(joueur, des, 1);

        assertTrue(joueur.getScoreTourActuel() == 0);
    }

    @Test
    public void jeuAucunBonDe2Test() {

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

        assertTrue(jeu.calculerScoreTour(joueur, des, 1));
    }

    @Test
    public void jeuClassement1Test() {
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

        assertTrue(jeu.calculerVainqueur(joueurs).get(0) == joueur2);
    }

    @Test
    public void jeuClassement2Test() {
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

        assertTrue(jeu.calculerVainqueur(joueurs).get(1) == joueur3);
    }

    @Test
    public void jeuClassement3Test() {
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

        assertTrue(jeu.calculerVainqueur(joueurs).get(2) == joueur1);
    }

}