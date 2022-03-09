package buncoplus;

import framework.Jeu;
import framework.Strategy;
import framework.joueur.CollectionPlayer;
import framework.joueur.Player;
import framework.joueur.PlayerIterator;

import java.util.Iterator;

/**
 * Classe : StrategyBunco
 *
 * Cette classe implemente l'interface Strategy et sert a calculer le score du tour
 * ainsi que le vainqueur selon le jeu Bunco
 *
 */
public class StrategyBunco implements Strategy {

    @Override
    public Player calculerVainqueur(Jeu jeu) {

         Player player1 = null, player2 = null, winner = null;


         //Iterator
         PlayerIterator playerIterator = new PlayerIterator((jeu.getPlayers()));   // A CONFIRMER

        //On defile dans les iterateurs de joueur pour trouver le gagnant
         while(playerIterator.hasNext()){

             //PLAYER 1 PREND LE PREMIER ELEMENT DANS LA COLLECTION PLAYER - A CONFIRMER
             player1 = (Player) playerIterator.next();

             //PLAYER 2 PREND LE DEUXIEME ELEMENT DANS LA COLLECTION PLAYER - A CONFIRMER
             player2 = (Player) playerIterator.next();

             //******************************** COMPARATORS *******************************
             //On compare les scores des joueurs

             //si player 2 est superieur a player 1 - A CONFIRMER
             if(player1.compareTo(player2) == 1){

                System.out.println(player2.getNom() + " est le vainqueur !");
                winner = player2;
             }

             //si egalite - A CONFIRMER
             else if(player1.compareTo(player2) == 2){
                System.out.println("Aucun vainqueur ! Egalite");
                return null;
             }

             //sinon joueur 1 gagne - A CONFIRMER
             else{
                 System.out.println(player1.getNom() + " est le vainqueur !");
                 winner = player1;
             }

         }

        return winner;
    }

    @Override
    public int calculerScoreTour(Jeu jeu) {

        int tour = 0;
        int score = 0;
        int lancerDe = 1;
        boolean ArretTour = false;

        PlayerIterator players;

        while(tour<6){

            players = new PlayerIterator(jeu.getPlayers()); //<----------- get la liste des joueurs grace a l'iterator mais A CONFIRMER AVEC EQUIPE


            //Print quel tour on est
            System.out.println("Tour : " + tour+1);

            //On defile les joueurs dans la collection
            while(players.hasNext()){

                Player player = (Player) players.next();
                System.out.println("Joueur : " + player.getNom());

                //On lance une boucle : tant que notre condition n'est pas atteinte, le tour continu
                while(!ArretTour){
                    System.out.println("Numero de lancer : " + lancerDe);

                    // INSERER METHODE POUR LANCER LE DE
                    //int scoreTemporaire = ...
/*
                    switch(scoreTemporaire){

                        case 0 :  ArretTour = true;
                                  break;
                        case 21 : System.out.println("Le joueur " + player.getNom() + "a obtenu un BUNCO !");
                                  ArretTour = true;
                                  break;
                        default : lancerDe++;
                    }

                    score += scoreTemporaire;
*/
                }
            }

            //On ajoute le score a la fin de son tour
            //player.setScore(player.getScore + score);

            //Print Score a la fin du tour
            System.out.println("Score pour le tour : " + score);

            //Incremente le tour pour atteindre le 6em tour et cloturer la boucle
            tour++;

            //On remet le score a 0
            score = 0;

            //on stop la boucle
            ArretTour = true;

        }

        return score;
    }


}