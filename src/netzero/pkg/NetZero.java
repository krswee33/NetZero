package netzero.pkg;

import java.util.*;
import java.lang.Object;



public class NetZero {
	static Scanner myScanner = new Scanner(System.in);
	static int numPlayers;

	public static void main(String[] args) {

//		try {
//    			AnimateIntro animateIntro = new AnimateIntro();
//    		} catch (InterruptedException e) {
//    			e.printStackTrace();
//    		}

		System.out.print("Enter Number of players (2-4): ");
		int numPlayers = GetNumPlayers();
		System.out.println("You chose " + numPlayers + " players");
		
		ArrayList<String> stringPlayerList = new ArrayList<String>();

		myScanner.nextLine();
		for (int i = 0; i < numPlayers; i++) {

			System.out.print("Enter name for Player " + (i+1) + ": ");
			
			String name = myScanner.nextLine();

			if (!(stringPlayerList.isEmpty()) && stringPlayerList.contains(name)) {
				System.out.println("Duplicate name! Think again! Name:");
				i--;
				continue;
			} else {
				stringPlayerList.add(name);
			}
		}

		// Set up Object ArrayList and add validated players names to ArrayList
		
		ArrayList<Player> playersList = new ArrayList<Player>();

		for (int i = 0; i < stringPlayerList.size(); i++) {

			Player player = new Player();
			
			String getname = stringPlayerList.get(i);
			player.setName(getname);
			
			playersList.add(player);
		}

		Dice dice = new Dice();
		Board board = new Board(dice, playersList);
		Game game = new Game(dice, board, playersList);
		int position = 0;

		game.gameStart(playersList.get(0), board, position);

	}
	
	
	
	
	
	
	
	/////// METHODS ////////////////////////////////

	public static int GetNumPlayers() {
		while (true) {
			try {
				int i = myScanner.nextInt();

				while (i < 2 || i > 4) {
					System.out.print("\nChoose 2-4. How many players? (2-4): ");

					i = myScanner.nextInt();
				}

				while (i >= 2 && i <= 4) {
					return i;
				}
			} catch (InputMismatchException e) {
				myScanner.next();
				System.out.print("That’s not an integer. Can't you count? Enter a number: ");
			}
		}
	}
    
}
	
	
	
	

