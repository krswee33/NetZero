/**
 * 
 */
package netzero.pkg;

/**
 * @author ryanbutler
 *
 */
public class ChanceSquare extends GameSquare {

	private String name;
	private String description;
	private int footprintAdjustment;
	Board board;

	/**
	 * @param name
	 * @param description
	 * @param footprintAdjustment
	 */

	public ChanceSquare() {
		
		this.name = "Chance Square";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void landOnAction(Player currentPlayer, GameSquare currentSquare) {
		
		int diceRollResult = (int) (Math.random() * (8 - 1)) + 1;

		switch (diceRollResult) {
		case 1:
			currentPlayer.setPlayerPosition(0);
			System.out.println("Advance to go:" + "\nReturn to the first square on the board");

			
			break;
		case 2:
			System.out.println("A second look: " + "\nMove back one space");

			currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition() - 1);
			
//			System.out.println("Your updated location is : " + board.getSquareAt(position).getName()); 
			break;
		case 3:
			System.out.println("Investment bonus: "
					+ "\nAn investor wants to support you developing technology to help save the planet, receive -200 on your footprint balance");

			currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() - 200);

			System.out.println("Your updated footprint is: " + currentPlayer.getCurrentFootprint());
			break;
		case 4:
			currentPlayer.setPlayerPosition(7);
			System.out.println("Getting wet:  "
					+ "\nYou receive a trip to revisit the pumped hydro technology development - move to Pumped Hydro");

			
			break;
		case 5:
			currentPlayer.setPlayerPosition(15);
			System.out.println("DANGER! DANGER!:  " + "\nTrouble at the plant - move to Nuclear Meltdown");

			
			break;
		case 6:
			System.out.println("Hybrid hump-day:	"
					+ "\nYour hybrid car has run out of electric on the way to your next location and you've had to put Diesel in to finish the trip\nYour footprints has increased by +50");

			currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() + 50);

			System.out.println("Your updated footprint is: " + currentPlayer.getCurrentFootprint());
			break;
		case 7:

			System.out.println("Boris bonus:	"
					+ "\nThe government are giving out free money to all their cronies that are invested in renewables, take it while you can...\nYour footprints has decreased by 100");

			currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() - 100);

			System.out.println("Your updated footprint is: " + currentPlayer.getCurrentFootprint());
			break;
		case 8:
			System.out.println("Boat builder: "
					+ "\nYou decide to put some money towards building a mega yacht, just in case renewables aren't enough to prevent the ice caps melting\nYour footprints has increased by 250");

			currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint() + 250);

			System.out.println("Your updated footprint is: " + currentPlayer.getCurrentFootprint());
			break;
		default:
			break;
		}

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the footprintAdjustment
	 */
	public int getFootprintAdjustment() {
		return footprintAdjustment;
	}

	/**
	 * @param footprintAdjustment the footprintAdjustment to set
	 */
	public void setFootprintAdjustment(int footprintAdjustment) {
		this.footprintAdjustment = footprintAdjustment;
	}




}
