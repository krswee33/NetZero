/**
 * 
 */
package netzero.pkg;

/**
 * @author ryanbutler
 *
 */

//HAVE CHANGED CASE 5 ModifierSquare to EnergyAwardsSquare on the Board class in the package
public class EnergyAwardsSquare extends GameSquare {

	private String name;
	private int footprint = -100;
	/**
	 * @param name
	 * @param footprint
	 */
	
	public EnergyAwardsSquare() {
		
		this.name = "Energy Awards";
		
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
	 * @return the footprint
	 */
	public int getFootprint() {
		return footprint;
	}
	
	/**
	 * Footprint hard coded at -100 as this figure does not change when player lands on it
	 */
	
	@Override
	public void landOnAction(Player currentPlayer, GameSquare currentSquare)  {
		
		System.out.println("Congratulations you've received an award for your dedication to green energy! -100 Footprint");
		currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint()+footprint);
		
		
	}
	
}
