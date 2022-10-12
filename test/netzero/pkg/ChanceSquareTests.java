package netzero.pkg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChanceSquareTests {
	ChanceSquare chance = new ChanceSquare();
	GameSquare square = new DevelopmentSquare("Impoundment Hydro", Field.HYDRO);
	Player player = new Player();


	@BeforeEach
	void setUp() throws Exception {
		
		int position = 6;
	}

	@Test
	void testLandOnAction() {
		
		//NOT ABLE TO RUN TEST AS THERE IS NO VALUE RETURNED
		//assertEquals(6, chance.landOnAction(player, square) );
	}

}
