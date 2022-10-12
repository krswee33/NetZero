package netzero.pkg;

import java.util.ArrayList;


public class Board {
	
	int length = 20;
	private final GameSquare[] board = new GameSquare[length];
    public Dice dice;
    public ArrayList<Player> players;
    private int position;

    public Board(Dice dice, ArrayList<Player> players){
   
    	this.dice = dice;
    	this.players = players;
       
        
      	//creating all squares on the board
        
	   for(int i=0;i<=19;i++)	{
	        	board[i] = createGameSquare(i);
	        }
	    }
	    public GameSquare getSquareAt(int position){
	        return board[position];
	    }
	
	    public GameSquare getCurrentSquare(Player player){
	        return getSquareAt(player.getPlayerPosition());
	    }
	    
	    //fill in all squares on the board
	
	    private GameSquare createGameSquare(int position){
	        switch(position){
	            case 0:
	                return new GoSquare();
	            case 1:
	                return new DevelopmentSquare("Concentrated Solar", Field.SOLAR);
	            case 2:
	                return new ChanceSquare();
	            case 3:
	                return new BlankSquare("COFFEE BREAK");
	            case 4:
	                return new DevelopmentSquare("Photovoltaic Solar", Field.SOLAR);
	            case 5:
	                return new EnergyAwardsSquare();
	            case 6:
	                return new DevelopmentSquare("Impoundment Hydro", Field.HYDRO);
	            case 7:
	                return new DevelopmentSquare("Pumped Hydro", Field.HYDRO);
	            case 8:
	                return new ChanceSquare();
	            case 9:
	                return new DevelopmentSquare("Diversion Hydro", Field.HYDRO);
	            case 10:
	                return new Scandal();
	            case 11:
	                return new DevelopmentSquare("Geothermal Dry Steam", Field.GEO);
	            case 12:
	                return new ChanceSquare();
	            case 13:
	                return new DevelopmentSquare("Geothermal Flash Steam", Field.GEO);
	            case 14:
	                return new DevelopmentSquare("Geothermal Binary Cycle", Field.GEO);
	            case 15:
	                return new NuclearSquare();
	            case 16:
	                return new DevelopmentSquare("Wind Utility", Field.WIND);
	            case 17:
	                return new BlankSquare("TOILET BREAK");
	            case 18:
	                return new ChanceSquare();
	            case 19:
	                return new DevelopmentSquare("Wind Offshore", Field.WIND);
	            default:
	                return null;
    }
	        
  }
	    
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getPosition() {
			return position;
		}
		public void setPosition(int position) {
			this.position = position;
		}
}



