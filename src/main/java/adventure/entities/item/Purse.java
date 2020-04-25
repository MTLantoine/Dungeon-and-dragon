package adventure.entities.item;

import adventure.entities.character.*;

public class Purse extends Item{

	/**
	 * 
	 * @param value the value of the purse
	 */
	public Purse(int value) {
		super(value);
	}
	
	/**
	 * 
	 * @param player the player that will use the item
	 */
	public void isUsedBy(Player player) {
		player.changePurse(this.getValue());
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Purse";
	}

}
