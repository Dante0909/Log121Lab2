package main;

import buncoplus.FabriqueBunco;
import framework.Fabrique;
import framework.Jeu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabrique fabrique = new FabriqueBunco();
		Jeu jeu = fabrique.creerJeu();
		jeu.lancerJeu();

	}

}
