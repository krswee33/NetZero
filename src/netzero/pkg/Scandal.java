package netzero.pkg;

public class Scandal extends GameSquare {
	
	public String name;
	public int position;

	
	public Scandal()	{
		
		this.name = "Scandal";
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void landOnAction(Player currentPlayer, GameSquare currentSquare)  {
		
		System.out.println("Caught in Toxic Waste Scandal. Miss 1 Turn");
		
		}
	}
