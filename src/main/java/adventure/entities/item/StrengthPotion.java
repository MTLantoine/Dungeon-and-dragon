package adventure.entities.item;

import adventure.entities.character.*;

public class StrengthPotion extends Item{

	/**
	 *
	 * @param value the value of the strength potion
	 */
	public StrengthPotion(int value) {
		super(value);
	}
	
	/**
	 * 
	 * @param player the player that will use the item
	 */
	public void isUsedBy(Player player) {
		player.changeStrength(this.getValue());
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "StrengthPotion";
	}

}
