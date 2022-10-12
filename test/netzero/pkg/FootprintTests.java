package netzero.pkg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FootprintTests {
	
	
	Player player = new Player();
	int current = 600;
	
	

	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
	void testCheckPlayerFootprint() {
		
		// TEST TO SHOW PLAYER FOOTPRINT BEGINS AT 1000
		
		assertEquals(1000, player.getCurrentFootprint());
	}

	@Test
	void testSubtractPlayerFootprint() {
		
		//TEST TO SHOW METHOD SUBTRACTS FROM PLAYER FOOTPRINT
		
		assertEquals(400, player.subtractPlayerFootprint(player, current));
	}
	
	@Test
	void testAddPlayerFootprint() {
		
		//TEST TO SHOW METHOD SUBTRACTS FROM PLAYER FOOTPRINT
		
		assertEquals(1600, player.addPlayerFootprint(player, current));
	}

	

}
