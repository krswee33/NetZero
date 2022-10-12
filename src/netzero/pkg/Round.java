package netzero.pkg;

public class Round {

	public  final int ROUND_MIN = 1;
	public  final int ROUND_MAX = 20;
	public int roundCounter = 1;
	
	public Round()	{
		
		
	}
	/**
	 * @return the roundCounter
	 */
	public int getRoundCounter() {
		return roundCounter;
	}
	
	/**
	 * 
	 * @param roundCounter
	 * @return
	 */
	
	public int updateRoundCounter(int roundCounter) {
		roundCounter++;
		return roundCounter;
	}
	
	public void setRoundCounter(int roundCounter) {
		this.roundCounter = roundCounter;
	}
	
}