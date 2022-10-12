package netzero.pkg;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovePlayerTest {
	
	private ArrayList<Player> players;
	private Board board;
	private Dice dice;
	
	@BeforeAll
	 static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		this.players = new ArrayList<Player>();
		this.dice = new Dice();
		this.board = new Board(dice, players);
		
		players.add(new Player());
		
	}
	
	@Test
	void movePlayer()	{
	
		int roll = 6;

		Player player = players.get(0);

		
		player.movePlayer(player, roll, board);
		
		//player created with position 0, adds 6, expected player to be at position 6
		
		assertEquals(6, player.getPlayerPosition());
		
	}
}
