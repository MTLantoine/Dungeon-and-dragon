package adventure.entities.item;

import adventure.entities.character.*;
import adventure.entities.choosable.*;

public abstract class Item implements Choosable {
	
	/** the value of the item */
	protected int value;
	
	/**
	 * 
	 * @param value the value of the item
	 */
	public Item (int value) {
		this.value = value;
	}
	
	/**
	 * 
	 * @param newValue the new value of the item
	 */
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	/**
	 * 
	 * @param player the player that will use the item
	 */
	public void isUsedBy(Player player) {}
	
	/**
	 * 
	 * @return the value of the item
	 */
	public int getValue() {
		return this.value;
	}
	
}
