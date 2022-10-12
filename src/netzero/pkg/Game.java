//////
package netzero.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private final Board board;
	private final Dice dice;
	private Round round = new Round();
	private boolean gameOver;

	public Game(Dice dice, Board board, ArrayList<Player> playerList) {

		this.dice = dice;
		this.board = board;
		this.playerList = playerList;

	}


	public void gameStart(Player currentPlayer, Board board, int position) {
		
			// until we hit the max number of rounds, keep executing rounds
			do {
								
				// during each round, each player takes a turn
				for (int j = 0; j < playerList.size(); j++) {
					currentPlayer = playerList.get(j);	
					takeTurn(currentPlayer, board, currentPlayer.getPlayerPosition(), round.getRoundCounter());
					if(currentPlayer.getCurrentFootprint() <= 0) {
						gameOver = true;
					}
				}
				
				round.roundCounter++;
				
			} while (round.getRoundCounter() <= round.ROUND_MAX || !gameOver);
			
			gameOver();
	
	}
	
	public void takeTurn(Player currentPlayer, Board board, int position, int round) {

		Scanner input = new Scanner(System.in);

		System.out.println("\n*** Round : " + round + " ***\n\n" + currentPlayer.getName() + " has Footprints: "
				+ currentPlayer.getCurrentFootprint() + "\n\n" + "Current Location: "
				+ board.getSquareAt(position).getName());

		int roll = dice.diceRoll();
		
		System.out.print("Moving: ");
		for (int d = 1; d <= roll; d++) {
			System.out.print(d + " > ");
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// set position to Players currentSquare position after moving

		position = currentPlayer.movePlayer(currentPlayer, roll, board);

		String currentSquareName = board.getSquareAt(position).getName();

		System.out.println(currentSquareName);

		if (currentSquareName == "Chance Square") {
			ChanceSquare chance = new ChanceSquare();
			chance.landOnAction(currentPlayer, chance);
		} else if (currentSquareName == "Scandal") {
			Scandal miss = new Scandal();
			miss.landOnAction(currentPlayer, miss);
		} else if (currentSquareName == "Energy Awards") {
			EnergyAwardsSquare award = new EnergyAwardsSquare();
			award.landOnAction(currentPlayer, award);
		} else if (currentSquareName == "Nuclear Meltdown") {
			NuclearSquare nuclear = new NuclearSquare();
			nuclear.landOnAction(currentPlayer, nuclear);
		} else if (currentSquareName == "COFFEE BREAK" || currentSquareName == "TOILET BREAK") {
			BlankSquare blank = new BlankSquare(currentSquareName);
			blank.landOnAction(currentPlayer, blank);
		} else if (currentSquareName == "Go Square") {
			GoSquare go = new GoSquare();
			go.landOnAction(currentPlayer, go);
		} else {
			DevelopmentSquare dev = (DevelopmentSquare) board.getSquareAt(position);
			dev.landOnDevelopment(currentPlayer, dev, dev.getPosition());
		}
		
		System.out.println("\nUpdated Footprints: "
				+ currentPlayer.getCurrentFootprint() + ". Updated Location: "
				+ board.getSquareAt(position).getName());
		
		if (currentPlayer.getCurrentFootprint() <=0) {
			gameOver();
		}else {		System.out.println("\n~~ Press Enter to continue ~~");
					input.nextLine();
		}
	}
	
	private void gameOver() {
	
		System.out.println("GAME OVER!");
		
		String winner = "nobody";
		
		for(int i = 0; i < playerList.size(); i++) {
			Player currentPlayer = playerList.get(i);
			if(currentPlayer.getCurrentFootprint() <= 0) {
				winner = currentPlayer.getName();
			}
		}
		
		System.out.println("The winner is " + winner + "!");
		
	}
	
	
}


