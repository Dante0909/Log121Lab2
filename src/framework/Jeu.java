package framework;

import framework.de.*;
import framework.joueur.CollectionPlayer;
import framework.joueur.*;

/**
 * Jeu
 */
public class Jeu {

	private Strategy strategy;
	private CollectionPlayer players;
	private CollectionDice dices;

	public Jeu(CollectionDice d, CollectionPlayer p, Strategy s) {
		this.players = p;
		this.dices = d;
		this.strategy = s;
	}

	public CollectionPlayer getPlayers() {
		return players;
	}

	public void lancerJeu() {

		for (int i = 0; i < strategy.getNbTurns(); ++i) {

			System.out.println("\n\nRound n°" + (i + 1) + "\n");

			PlayerIterator hand = players.iterator();

			while (hand.hasNext()) {
				Player p = hand.next();
				System.out.println("\nPlayer : " + p.getNom());
				boolean passHand = false;
				while (!passHand) {
					passHand = strategy.calculerScoreTour(p, dices, i + 1);
				}
			}

			int maxScore = 0;
			Player roundWinner = null;
			PlayerIterator iterator = players.iterator();
			while (iterator.hasNext()) {
				Player player = iterator.next();
				int score = player.getCurrentRoundScore();
				if (score > maxScore) {
					roundWinner = player;
					maxScore = score;
				} else if (score == maxScore) {
					// Égalité
					roundWinner = null;
				}
				player.setTotalScore(player.getTotalScore() + score);
				player.setCurrentRoundScore(0);
			}

			if (roundWinner != null) {
				System.out.println("\n" + roundWinner.getNom() + " won the round.");
				roundWinner.incrementWins();
			} else {
				System.out.println("\nNo winner for this round.");
			}
		}

		CollectionPlayer sortedPlayers = strategy.calculerVainqueur(players);

		System.out.println("\n\n\n\nplayers\n");
		for (Player player : sortedPlayers) {
			System.out.println(player);
		}

		if (sortedPlayers.get(0).compareTo(sortedPlayers.get(1)) == 0) {
			System.out.println("Draw");
		} else {
			System.out.println("Winner is " + sortedPlayers.get(0).getNom());
		}
	}

}