/**
 * 
 */
package netzero.pkg;

/**
 * @author ryanbutler
 *
 */
//HAVE CHANGED CASE 15 ModifierSquare to NuclearSquare on the Board class in the package
public class NuclearSquare extends GameSquare {

	private String name;
	private int footprint = 150;
	/**
	 * @param name
	 * @param footprint
	 */
	
	public NuclearSquare () {
		
		this.name = "Nuclear Meltdown";
		
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
	
	
	@Override
	public void landOnAction(Player currentPlayer, GameSquare currentSquare)  {
		
		System.out.println("CATASTROPHE!! Nuclear Meltdown. +150 Footprint");
		currentPlayer.setCurrentFootprint(currentPlayer.getCurrentFootprint()+ footprint);
		
		
	}
}
