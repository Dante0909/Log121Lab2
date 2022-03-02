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

         Player player1 = null;
         Player player2 = null;
         Player winner = null;


        return winner;
    }

    @Override
    public int calculerScoreTour(Jeu jeu) {

        int tour = 0;
        int score = 0;
        int lancerDe = 1;
        boolean continuerTour = false;

        Iterator<Player> players;

        while(tour<6){
/*
            //players = new PlayerIterator //<----------- get la liste des joueurs grace a l'iterator mais le iterator doit etre complete

            //Print quel tour on est
            System.out.println("Tour : " + tour+1);


            //On defile les joueurs dans la collection
            while(players.hasNext()){

                Player player = (Player) players.next();
                System.out.println("Joueur : " + player.getNom());

                //On lance une boucle : tant que notre condition n'est pas atteinte, le tour continu
                while(!continuerTour){
                    System.out.println("Numero de lancer : " + lancerDe);

                    // INSERER METHODE POUR LANCER LE DE
                    //int scoreTemporaire = ...

                    switch(scoreTemporaire){

                        case 0 :  continuerTour = true;
                                  break;
                        case 21 : System.out.println("Le joueur " + player.getNom() + "a obtenu un BUNCO !");
                                  continuerTour = true;
                                  break;
                        default : lancerDe++;
                    }

                    score += scoreTemporaire;

                }
            }



            //On ajoute le score a la fin de son tour
            //player.setScore(player.getScore + score);

            //Print Score a la fin du tour
            System.out.println("Score pour le tour : " + score);
            //Print Score total du joueur
            //System.out.println("Score totale du joueur " + joueur.getNom + " : " +  joueur.getScore);



            //Incremente le tour pour atteindre le 6em tour et cloturer la boucle
            tour++;

            //On remet le score a 0
            score = 0;

            //on repart la boucle
            continuerTour = true;

 */
        }



        return 0;
    }


}