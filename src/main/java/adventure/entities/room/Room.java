package adventure.entities.room;

import java.util.*;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.exception.*;
import adventure.entities.item.*;

public class Room {
	
	/** the neighbors of this room */
	protected Map<Direction, Room> neighbors;
	
	/** the monsters in this room */
	protected List<Monster> monsters;
	
	/** the items in this room */
	protected List<Item> items;
	
	/**
	 * 
	 * constructor of the room
	 */
	public Room() {
		this.neighbors = new HashMap<Direction,Room>();
		this.monsters = new ArrayList<Monster>();
		this.items = new ArrayList<Item>();
	}
	
	/**
	 * 
	 * @return false because the room is not an exit room
	 */
	public boolean isExit() {
		return false;
	}
	
	/**
	 * 
	 * @param direction the direction we want to add as a neighbor
	 * @param room the room add with its direction
	 * @throws NeighborAlreadyExistingException if the neighbor is already existing
	 */
	public void addNeighbor(Direction direction, Room room) throws NeighborAlreadyExistingException {
		if (this.neighbors.containsKey(direction)){
			throw new NeighborAlreadyExistingException();
		} else {
			this.neighbors.put(direction, room);
		}
	}
	
	/**
	 * 
	 * @param direction the direction we want to reach
	 * @return the room affiliated with its direction
	 */
	public Room getNeighbor(Direction direction) {
		return this.neighbors.get(direction);
	}
	
	/**
	 * 
	 * @return the list of all the neighbors of the room
	 */
	public List<Direction> getDirectionNeighbors() {
		List<Direction> neighborsList = new ArrayList<Direction>();
		for(Map.Entry<Direction, Room> e: neighbors.entrySet()){
			neighborsList.add(e.getKey());
		}
		return neighborsList;
	}
	
	/**
	 * 
	 * @param item the item we want to add in the room
	 */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/**
	 * 
	 * @return the list of all the items in the room
	 */
	public List<Item> getItems() {
		return this.items;
	}
	
	/**
	 * 
	 * this function removes the chosen item from the room
	 * 
	 * @param item the item we want to remove
	 */
	public void removeItem(Item item) {
		if (this.items.contains(item)) {
			this.items.remove(item);
		}
	}

	/**
	 * 
	 * @param monster the monster we want to add in the room
	 * @throws MonsterAlreadyExistingException if the monster is already in the room
	 */
	public void addMonster(Monster monster) throws MonsterAlreadyExistingException {
		for (Monster m : this.monsters) {
			if (m.equals(monster)) {
				throw new MonsterAlreadyExistingException();
			}
		}
		this.monsters.add(monster);
	}
	
	/**
	 * 
	 * @return the list of all the monsters in the room
	 */
	public List<Monster> getMonsters() {
		return this.monsters;
	}
	
	/**
	 * 
	 * @param monster the monster we want to reach
	 * @return the monster wanted
	 */
	public Monster getMonster(Monster monster) {
		for (Monster m : this.monsters) {
			if (m.equals(monster)) {
				return m;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * this function removes the chosen monster from the room
	 * 
	 * @param monster the monster we want to remove
	 */
	public void removeMonster(Monster monster) {
		if (this.monsters.contains(monster)) {
			this.monsters.remove(monster);
		}
	}

}
