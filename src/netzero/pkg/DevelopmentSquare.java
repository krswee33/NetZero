package netzero.pkg;

import java.util.Scanner;

public class DevelopmentSquare extends GameSquare {

	private Field field;
	private int baseValue = 0;
	private Player currentOwner;
	private String techLevel;

	/**
	 * 
	 */

	public DevelopmentSquare(String name, Field field) {

		this.name = name;
		this.field = field;
		this.currentOwner = null;
		this.techLevel = "Basic";
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public Player getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(Player currentOwner) {
		this.currentOwner = currentOwner;
	}

	public String getTechLevel() {
		return techLevel;
	}

	public void setTechLevel(String techLevel) {
		this.techLevel = techLevel;
	}

	public int getValue() {

		switch (field) {
		case SOLAR:
			baseValue = 50;
			if (techLevel.equals("Intermediate")) {
				baseValue *= 2;
			} else if (techLevel.equals("Advanced")) {
				techLevel = "Advanced";
				baseValue *= 3;
			}
			return baseValue;
		case HYDRO:
			baseValue = 100;
			if (techLevel.equals("Intermediate")) {
				baseValue *= 2;
			} else if (techLevel.equals("Advanced")) {
				baseValue *= 3;
			}
			return baseValue;
		case GEO:
			baseValue = 150;
			if (techLevel.equals("Intermediate")) {
				baseValue *= 2;
			} else if (techLevel.equals("Advanced")) {
				baseValue *= 3;
			}
			return baseValue;
		case WIND:
			baseValue = 200;
			if (techLevel.equals("Intermediate")) {
				baseValue *= 2;
			} else if (techLevel.equals("Advanced")) {
				baseValue *= 3;
			}
			return baseValue;
		default:
			return baseValue;

		}
	}

	public void upgradeTechLevel() {

		if (techLevel == "Basic") {
			techLevel = "Intermediate";
		} else {
			techLevel = "Advanced";
		}
	}

	public void landOnAction() {

	}

	@Override
	public void landOnDevelopment(Player currentPlayer, DevelopmentSquare currentSquare, int position) {
		Scanner myScanner = new Scanner(System.in);

		if (currentSquare.currentOwner == null) {

			System.out.println("\n$$$$$$ \n  You've landed on " + currentSquare.getName()
					+ ", do you want to develop it for " + currentSquare.getValue() + "? \n$$$$$  Type y/n");

			String response = myScanner.nextLine().toLowerCase();

			if (response.contains("y")) {
				// added current player.addproperty which is sending the current square to an
				// arraylist created in player class
				currentPlayer.addProperty(currentSquare);
				currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() + (currentSquare.getValue()));
				System.out.println("You have invested for a pollution cost of: " + currentSquare.getValue());
				System.out.println("Your new footprint is: " + currentPlayer.getCurrentFootprint());
				// added this line to initalise current owner for bought property
				currentOwner = currentPlayer;
				System.out.println();
				// else if added to attempt to transfer funds between players if property is
				// already owned
			} else {
				System.out.println(" 太抠了吧！! You have declined to invest in bettering this planet!\n:( ");
				System.out.println();
			}
		} 	else if (currentSquare.currentOwner == currentPlayer){
			System.out.println("You already OWN this square! Nothing happens.");

		
		}else if ((currentSquare.currentOwner != currentPlayer) && (currentSquare.currentOwner != null)) {
			System.out.println("This square is already owned by " + currentOwner.getName() + "\nYou must pay "
					+ currentSquare.baseValue);

			currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() + (currentSquare.baseValue));
			System.out.println(currentPlayer.getName() + "'s footprint increased by " + currentSquare.baseValue);

			currentOwner.setCurrentFootprint(currentOwner.getCurrentFootprint() - (currentSquare.baseValue));
			System.out.println(currentOwner.getName() + "'s footprint decreased by " + currentSquare.baseValue);

//	        	currentPlayer.addPlayerFootprint(currentPlayer, currentSquare.baseValue); 
//	        	currentOwner.subtractPlayerFootprint(currentOwner, currentSquare.baseValue);

			System.out.println("Your updated footprints balance is : " + currentPlayer.getCurrentFootprint());
		} else if (currentSquare.getCurrentOwner() == null) {

		}

	}
}
