package netzero.pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetValueTest {
	

	private DevelopmentSquare dev = new DevelopmentSquare("name",Field.GEO);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}
	@Test
	void getValue()	{
	
		dev.setTechLevel("Advanced");

		assertEquals(450, dev.getValue());
		
	}

}
