package adventure.entities.action;

import adventure.entities.character.*;
import adventure.entities.choosable.*;

public interface Action extends Choosable {
	
	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player);

	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public abstract boolean isPossible(Player player);

}
