package adventure.entities.character;

import static org.junit.Assert.*;

import org.junit.*;

import adventure.entities.*;
import adventure.entities.room.*;

public abstract class CharacterTest {

	protected Character character;
	protected Player attacker;
	protected abstract Character createCharacter();
	protected Room room;
	protected AdventureGame game;
	
	@Before
	public void initObjects() {
		this.character = this.createCharacter();
		this.room = new Room();
		this.game = new AdventureGame(this.room);
		this.attacker = new Player(1, 75, 1, this.game);
	}

	@Test
	public void getLifeTest() {
		assertEquals(100, this.character.getLife());
	}
	
	@Test
	public void changeLifeTest() {
		this.character.changeLife(-this.character.getLife());
		assertEquals(0, this.character.getLife());
	}
	
	@Test
	public void getStrengthTest() {
		assertEquals(200, this.character.getStrength());
	}
	
	@Test
	public void changeStrengthTest() {
		this.character.changeStrength(-this.character.getStrength());
		assertEquals(0, this.character.getStrength());
	}
	
	@Test
	public void getPurseTest() {
		assertEquals(300, this.character.getPurse());
	}
	
	@Test
	public void changePurseTest() {
		this.character.changePurse(-this.character.getPurse());
		assertEquals(0, this.character.getPurse());
	}
	
	@Test
	public void actionTest() {
		assertEquals(100, this.character.getLife());
		this.attacker.action(this.character);
		assertEquals(25, this.character.getLife());
	}
	
	@Test
	public void isDeadTest() {
		assertFalse(this.character.isDead());
		this.attacker.action(this.character);
		assertFalse(this.character.isDead());
		this.attacker.action(this.character);
		assertTrue(this.character.isDead());
	}

}
