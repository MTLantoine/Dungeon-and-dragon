package adventure.entities.room;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.exception.*;
import adventure.entities.item.*;

public class RoomTest {
	
	private Room room1;
	private Room room2; 
	protected ExitRoom exitRoom;
	private LifePotion lifePotion;
	private List<Item> itemsList;
	private Monster monster;
	
	@Before
	public void initObjects() throws NeighborAlreadyExistingException, MonsterAlreadyExistingException {
		this.room1 = new Room();
		this.room2 = new Room();
		this.exitRoom = new ExitRoom();
		this.room1.addNeighbor(Direction.NORTH, this.room2);
		this.lifePotion = new LifePotion(50);
		this.itemsList = new ArrayList<Item>();
		this.monster = new Monster(100, 100, 100, "Kratos");
		this.room1.addMonster(monster);
	}

	@Test
	public void isExitTest() {
		assertFalse(this.room1.isExit());
	}
	
	@Test
	public void addNeighborTest() throws NeighborAlreadyExistingException {
		assertEquals(1, this.room1.neighbors.size());
		this.room1.addNeighbor(Direction.WEST, this.exitRoom);
		assertEquals(2, this.room1.neighbors.size());
	}
	
	@Test (expected = NeighborAlreadyExistingException.class)
	public void addNeighborExceptionTest() throws NeighborAlreadyExistingException {
		this.room1.addNeighbor(Direction.NORTH, this.exitRoom);
	}
	
	@Test
	public void getNeighborTest() throws NeighborAlreadyExistingException {
		assertEquals(this.room2, this.room1.getNeighbor(Direction.NORTH));
		this.room1.addNeighbor(Direction.WEST, this.exitRoom);
		assertEquals(this.exitRoom, this.room1.getNeighbor(Direction.WEST));
	}
	
	@Test
	public void getDirectionNeighbors() throws NeighborAlreadyExistingException {
		List<Direction> neighborsList = new ArrayList<Direction>();
		neighborsList.add(Direction.NORTH);
		assertEquals(neighborsList, this.room1.getDirectionNeighbors());
	}
	
	@Test
	public void addItemTest() {
		itemsList.add(this.lifePotion);
		itemsList.add(this.lifePotion);
		this.room1.addItem(this.lifePotion);
		this.room1.addItem(this.lifePotion);
		assertEquals(itemsList, this.room1.items);
	}
	
	@Test
	public void getItemTest() {
		itemsList.add(this.lifePotion);
		itemsList.add(this.lifePotion);
		this.room1.addItem(this.lifePotion);
		this.room1.addItem(this.lifePotion);
		assertEquals(itemsList, this.room1.getItems());
	}
	
	@Test
	public void removeItemTest() {
		this.room1.addItem(this.lifePotion);
		assertEquals(1, this.room1.getItems().size());
		this.room1.removeItem(lifePotion);
		assertTrue(this.room1.getItems().isEmpty());
	}
	
	@Test
	public void addMonsterTest() throws MonsterAlreadyExistingException {
		assertEquals(1, this.room1.monsters.size());
		Monster monster2 = new Monster(50, 50, 50, "Monstro");
		this.room1.addMonster(monster2);
		assertEquals(2, this.room1.monsters.size());
	}
	
	@Test (expected = MonsterAlreadyExistingException.class)
	public void addMonsterExceptionTest() throws MonsterAlreadyExistingException {
		this.room1.addMonster(monster);
	}
	
	@Test
	public void getMonstersTest() {
		List<Monster> monstersList = new ArrayList<Monster>();
		monstersList.add(monster);
		assertEquals(monstersList, this.room1.getMonsters());
	}
	
	@Test
	public void getMonsterTest() {
		assertEquals(this.monster, this.room1.getMonster(this.monster));
	}
	
	@Test
	public void removeMonsterTest() {
		assertTrue(this.room1.getMonsters().contains(monster));
		this.room1.removeMonster(monster);
		assertFalse(this.room1.getMonsters().contains(monster));
	}

}
