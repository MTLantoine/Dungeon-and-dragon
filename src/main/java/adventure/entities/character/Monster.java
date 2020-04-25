package adventure.entities.character;

import adventure.entities.*;
import adventure.entities.choosable.*;
import adventure.entities.item.*;

public class Monster extends Character implements Choosable{
	
	/**
	 * 
	 * @param life the life of the monster
	 * @param strenght the strength of the character
	 * @param purse the purse of the monster
	 * @param name the name of the monster
	 * @param game the game played
	 */
	public Monster(int life, int strenght, int purse, String name, AdventureGame game) {
		super(life, strenght, purse, name, game);
	}
	
	/**
	 * 
	 * @param life the life of the monster
	 * @param strenght the strength of the character
	 * @param purse the purse of the monster
	 * @param name the name of the monster
	 */
	public Monster(int life, int strenght, int purse, String name) {
		super(life, strenght, purse, name);
	}
	
	/**
	 * 
	 * the monster dies and leave an purse item on the floor
	 */
	public void die() {
		Purse purse = new Purse(this.getPurse());
		this.getGame().currentRoom().addItem(purse);
		this.getGame().currentRoom().removeMonster(this);
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return super.getName();
	}

}
