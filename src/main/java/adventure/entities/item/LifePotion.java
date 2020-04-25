package adventure.entities.item;

import adventure.entities.character.*;

public class LifePotion extends Item{

	/**
	 * 
	 * @param value the value of the life potion
	 */
	public LifePotion(int value) {
		super(value);
	}
	
	/**
	 * 
	 * @param player the player that will use the item
	 */
	public void isUsedBy(Player player) {
		player.changeLife(this.getValue());
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "LifePotion";
	}

}
