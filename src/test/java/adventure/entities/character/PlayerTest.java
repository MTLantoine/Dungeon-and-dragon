package adventure.entities.character;

import static org.junit.Assert.*;

import org.junit.*;

public class PlayerTest extends CharacterTest{
	
	public Character createCharacter() {
		return new Player(100, 200, 300);
	}
	
	@Test
	public void dieTest() {
		assertFalse(super.attacker.getGame().isFinished());
		super.attacker.die();
		assertTrue(super.attacker.getGame().isFinished());
	}
	
	@Test
	public void getListActionsTest() {
		assertEquals(5, super.attacker.getListActions().size());
	}

}
