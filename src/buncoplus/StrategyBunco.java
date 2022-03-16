package buncoplus;

import framework.Strategy;
import framework.de.CollectionDice;
import framework.de.Dice;
import framework.de.DiceIterator;
import framework.joueur.CollectionPlayer;
import framework.joueur.Player;
import framework.joueur.PlayerIterator;

/**
 * Classe : StrategyBunco
 *
 * Cette classe implemente l'interface Strategy et sert a calculer le score du
 * tour
 * ainsi que le vainqueur selon le jeu Bunco
 *
 */
public class StrategyBunco implements Strategy {

	@Override
	public CollectionPlayer calculerVainqueur(CollectionPlayer players) {
		PlayerIterator playersIterator = players.iterator();
		CollectionPlayer sortedPlayers = new CollectionPlayer();

		while (playersIterator.hasNext()) {

			Player newPlayer = playersIterator.next();
			CollectionPlayer newSortedPlayers = new CollectionPlayer();
			boolean inserted = false;
			PlayerIterator sortedPlayersIterator = sortedPlayers.iterator();

			while (sortedPlayersIterator.hasNext()) {

				Player player = sortedPlayersIterator.next();
				if (newPlayer.compareTo(player) > 0) {
					newSortedPlayers.add(newPlayer);
					inserted = true;
				}
				newSortedPlayers.add(player);

			}
			if (!inserted) {
				newSortedPlayers.add(newPlayer);
			}
			sortedPlayers = newSortedPlayers;

		}
		return sortedPlayers;
	}

	@Override
	public boolean calculerScoreTour(Player player, CollectionDice d, int turn) {
		DiceIterator iterator = d.iterator();
		int score = 0;
		boolean onlyDuplicateDices = true;
		int lastResult = -1;
		while (iterator.hasNext()) {
			Dice dice = iterator.next();
			dice.rouler();
			int result = dice.getFaceActuelle();
			System.out.println("Dice roll : " + result);
			if (turn == result) {
				score++;
			}
			if (lastResult != -1 && lastResult != result) {
				onlyDuplicateDices = false;
			}
			lastResult = result;
		}
		if (onlyDuplicateDices) {
			if (lastResult == turn) {
				score = 21;
				System.out.println("Bunco !");
			} else {
				score = 5;
			}
		}

		player.setCurrentRoundScore(player.getCurrentRoundScore() + score);

		return score == 0 || score == 21;
	}

	@Override
	public int getNbTurns() {

		return 6;
	}

}