package netzero.pkg;


public class Dice {
	int num1;
	int num2;
	
	public int diceRoll()	{
		
		int num1 = (int)(Math.random() * (6-1)) +1;
		int num2 = (int)(Math.random() * (6-1)) +1;
		
		int num3 = num1 + num2;
		
		System.out.println("[ You rolled ("+num1+" and "+num2+") = "+num3 +" ]\n");
		
		return num3;
	
	}
	
}

