package netzero.pkg;
import java.util.ArrayList;

import java.util.ArrayList;


public class Player {
	
	//instatiate variables for Player class
	private ArrayList<DevelopmentSquare> ownedProperties = new ArrayList<DevelopmentSquare>();
	private int playerPosition;
	private int currentFootprint;
    private String name;
    
   
    public Player(){
        
        playerPosition = 0;
        currentFootprint = 1000;
        
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentFootprint() {
		return currentFootprint;
	}

	public void setCurrentFootprint(int currentFootprint) {
		this.currentFootprint = currentFootprint;
	}

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}

	public int movePlayer(Player currentPlayer, int roll, Board board) {

		playerPosition += roll; 
		
		if (playerPosition >= 20) {
			System.out.println(name + "You passed GO! Reduced Footprint by 200!");
			currentFootprint -= 200;
			playerPosition %= 20;
		}
		 
		System.out.println("Landed on " + board.getCurrentSquare(this).getName());
		return playerPosition;

	}

	public int subtractPlayerFootprint(Player currentPlayer, int modify)	{
		
		int newFootprint = currentPlayer.getCurrentFootprint() - modify;
		return newFootprint;
		
	}
	
	public int addPlayerFootprint(Player currentPlayer, int modify)	{
		
		int newFootprint = currentPlayer.getCurrentFootprint() + modify;
		return newFootprint;
		
		
	}
	
	//created new method to add the owned property to an arraylist
	public void addProperty(DevelopmentSquare ownedProperty) {
		ownedProperties.add(ownedProperty);
	}
	
	
    
}
