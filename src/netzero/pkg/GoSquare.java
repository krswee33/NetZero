package netzero.pkg;

public class GoSquare extends GameSquare {
	
	private String name;
	
	public GoSquare()	{
		
		this.name = "Go Square";
		
		
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
	
	@Override
	public void landOnAction(Player currentPlayer, GameSquare currentSquare)  {
		
		System.out.println("You landed on GO! CONGRATS");
//		int footprint = currentPlayer.getCurrentFootprint();
//		int bonus = 200;
//		currentPlayer.setCurrentFootprint(footprint-bonus);
	
	}

}
