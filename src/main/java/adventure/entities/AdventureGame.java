package adventure.entities;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.exception.*;
import adventure.entities.item.*;
import adventure.entities.room.*;

public class AdventureGame {
	
	/** the actual room where you are actually at */
	private Room currentRoom;
	
	/** the player you embody */
	private Player player;
	
	/** state of the game */
	private boolean isOver;
	
	/**
	 * 
	 * @param startingRoom the room where you play at the moment
	 */
	public AdventureGame(Room startingRoom) {
		this.currentRoom = startingRoom;
		this.isOver = false;
		this.player = new Player(150, 30, 0, this);
	}
	
	/**
	 * 
	 * @return the actual room where you play
	 */
	public Room currentRoom() {
		return this.currentRoom;
	}
	
	/**
	 * 
	 * @return the player you play
	 */
	public Player getPlayer() {
		return this.player;
	}
	
	/**
	 * 
	 * @param monster the monster to add
	 * @param room the room where the monster is added
	 * @throws MonsterAlreadyExistingException if the monster is already in the room
	 */
	public void addMonster(Monster monster, Room room) throws MonsterAlreadyExistingException {
		room.addMonster(monster);
	}
	
	/**
	 * 
	 * @param item the item to add
	 * @param room the room where the item is added
	 */
	public void addItem(Item item, Room room) {
		room.addItem(item);
	}
	
	/**
	 * 
	 * @return true if the game is over, false else
	 */
	public boolean isFinished() {
		return this.isOver;
	}
	
	/**
	 * ends the game
	 */
	public void finishTheGame() {
		this.isOver = true;
	}
	
	/**
	 * 
	 * @param direction the direction where the player is moved on
	 */
	public void playerMoveTo(Direction direction) {
		this.currentRoom = this.currentRoom.getNeighbor(direction);
	}
	
	/**
	 * launch the game until the player wins the game or die in it
	 */
	public void play() {
		System.out.println("Welcome in « Dungeon and Dragon »");
		System.out.println();
		System.out.println("You begin the game with " + this.player.getLife()
						+ " points of life, " + this.player.getStrength()
						+ " points of strength and " + this.player.getPurse()
						+ " golds. Have fun !");
		while (!(this.isFinished()) && !(this.currentRoom().isExit())){
			this.player.act();
		}
		if (this.player.isDead()){
			System.out.println("Game Over ! The game beat you...");
		} else {
			System.out.println("Congratulation ! You beat the game !");
		}

	}
}
