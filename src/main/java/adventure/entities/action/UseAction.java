package adventure.entities.action;

import java.util.*;

import adventure.entities.character.*;
import adventure.entities.item.*;
import adventure.entities.room.*;
import adventure.util.*;

public class UseAction implements Action {
	
	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player) {
		List<Item> listItems = new ArrayList<Item>();
		Room currentRoom = player.getGame().currentRoom();
		listItems = currentRoom.getItems();
		ListChoser lc = new ListChoser();
		Item chosenItem = lc.chose("Chose an item : ", listItems);
		chosenItem.isUsedBy(player);
		currentRoom.removeItem(chosenItem);
	}
	
	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public boolean isPossible(Player player) {
		Room currentRoom = player.getGame().currentRoom();
		if (currentRoom.getItems().isEmpty() || player.getGame().isFinished()) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Use";
	}
}
