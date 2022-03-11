package main;

import buncoplus.FabriqueBunco;
import framework.Jeu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var bunco = new FabriqueBunco();
		Jeu jeu = bunco.createGame();
		jeu.lancerJeu();



	}

}
