package buncoplus;

import java.util.ArrayList;
import java.util.List;

import framework.Fabrique;
import framework.Jeu;
import framework.Strategie;
import framework.de.*;
import framework.joueur.*;

/**
 * FabriqueBunco
 */
public class FabriqueBunco extends Fabrique {

	private int nbJoueurs = 2;

	private int nbDes = 3;

	private int nbFaces = 6;

	/*
	 * public FabriqueBunco(int nbJoueurs) {
	 * this.nbJoueurs = nbJoueurs;
	 * }
	 */
	public FabriqueBunco() {

	}

	public FabriqueBunco(int nbJoueurs, int nbDes, int nbFaces) {
		this.nbJoueurs = nbJoueurs;
		this.nbDes = nbDes;
		this.nbFaces = nbFaces;
	}

	@Override
	protected CollectionJoueur creerJoueurs() {
		List<Joueur> joueurs = new ArrayList<Joueur>();

		for (int i = 0; i < nbJoueurs; ++i) {
			joueurs.add(new Joueur("Joueur " + i + 1));
		}
		return new CollectionJoueur(joueurs);
	}

	@Override
	protected CollectionDe creerDes() {
		List<De> des = new ArrayList<De>();

		for (int i = 0; i < nbDes; ++i) {
			des.add(new De(nbFaces));
		}
		return new CollectionDe(des);
	}

	@Override
	protected Strategie creerStrategie() {
		return new StrategieBunco();
	}

	@Override
	public Jeu creerJeu() {
		Strategie strategie = creerStrategie();
		CollectionJoueur joueurs = creerJoueurs();
		CollectionDe des = creerDes();
		return new Jeu(des, joueurs, strategie);

	}

}