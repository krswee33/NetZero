package netzero.pkg;

import java.util. ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceRollTest {

	Dice dice = new Dice();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}
	
	@Test
	void diceRoll()	{
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		
		for(int i = 0; i<=12;i++) {
			results.add(dice.diceRoll());
		}
		for(int i=0;i<results.size();i++)	{
			assertTrue(results.get(i)>1);
			assertTrue(results.get(i)<13);
		}
	}
}
