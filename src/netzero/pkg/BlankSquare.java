package netzero.pkg;

public class BlankSquare extends GameSquare {
	
	private String name;
	
	public BlankSquare(String notice)	{
		
		this.name = notice;
		
	}
	
	public String getName() {
		return name;
	}

	public void landOnAction(Player currentPlayer, GameSquare currentSquare) {
		
		String alert = currentSquare.getName();
		
		if(alert == "COFFEE BREAK")	{
			System.out.println("Time for a nice tea break. You relax this turn");
		}
		else if(alert == "TOILET BREAK")	{
			System.out.println("Nature calls, you're a bit distracted this turn!");
		}
		}
	
	
	}
