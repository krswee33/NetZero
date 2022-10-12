package netzero.pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoundCounterTest {
Round round = new Round();
	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@Test
	void testUpdateRoundCounter() {
		
		//TEST TO CHECK INCREMETER AND THAT ROUND BEGINS AT 1
		int counter=5;
		assertEquals(6,round.updateRoundCounter (counter)) ;
	}

//	@Test
//	void testUpdateRoundCounter() {
//		fail("Not yet implemented");
//	}

}
