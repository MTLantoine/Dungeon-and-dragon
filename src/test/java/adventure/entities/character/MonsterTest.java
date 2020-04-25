package adventure.entities.character;

import static org.junit.Assert.*;

import org.junit.*;

import adventure.entities.exception.*;
import adventure.entities.room.*;

public class MonsterTest extends CharacterTest{
	
	public Character createCharacter() {
		return new Monster(100, 200, 300, "Tyrion");
	}
	
	@Test
	public void getNameTest() {
		assertEquals("Tyrion", super.character.getName());
	}
	
	@Test
	public void setNameTest() {
		this.character.setName("Lanister");
		assertEquals("Lanister", super.character.getName());
	}
	
	@Test
	public void dieTest() throws MonsterAlreadyExistingException {
		Monster monster = new Monster(60, 60, 60, null, super.game);
		super.game.addMonster(monster, this.room);
		Room currentRoom = super.game.currentRoom();
		assertEquals(1, currentRoom.getMonsters().size());
		assertTrue(currentRoom.getItems().isEmpty());
		monster.die();
		assertTrue(currentRoom.getMonsters().isEmpty());
		assertEquals(1, currentRoom.getItems().size());
	}

}
