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
Nom du fichier: Main.java
Date dern. modif. 2022-03-16
*******************************************************/

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
