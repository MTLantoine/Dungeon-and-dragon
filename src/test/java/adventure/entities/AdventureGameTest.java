package adventure.entities;

import static org.junit.Assert.*;

import org.junit.*;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.exception.*;
import adventure.entities.item.*;
import adventure.entities.room.*;

public class AdventureGameTest {
	
	private AdventureGame game;
	private Room room;
	private Monster monster;
	private LifePotion lifePotion;
	
	@Before
	public void initObjects() {
		this.room = new Room();
		this.game = new AdventureGame(this.room);
		this.monster = new Monster(75, 75, 75, "Joker");
		this.lifePotion = new LifePotion(100);
	}

	@Test
	public void currentRoomTest() {
		assertEquals(this.room, this.game.currentRoom());
	}

	@Test
	public void addMonsterTest() throws MonsterAlreadyExistingException {
		assertTrue(this.game.currentRoom().getMonsters().isEmpty());
		this.game.addMonster(this.monster, this.room);
		assertEquals(1, this.game.currentRoom().getMonsters().size());
	}
	
	@Test
	public void addItem() {
		assertTrue(this.game.currentRoom().getItems().isEmpty());
		this.game.addItem(this.lifePotion, this.room);
		assertEquals(1, this.game.currentRoom().getItems().size());
	}
	
	@Test
	public void finishTheGameTest() {
		assertFalse(this.game.isFinished());
		this.game.finishTheGame();
		assertTrue(this.game.isFinished());
	}
	
	@Test
	public void playerMoveToTest() throws NeighborAlreadyExistingException {
		assertEquals(this.room, this.game.currentRoom());
		Room room2 = new Room();
		this.room.addNeighbor(Direction.NORTH, room2);
		this.game.playerMoveTo(Direction.NORTH);
		assertEquals(room2, this.game.currentRoom());
	}
	
}
