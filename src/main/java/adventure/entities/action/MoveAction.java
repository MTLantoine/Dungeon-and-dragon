package adventure.entities.action;

import java.util.*;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.room.*;
import adventure.util.*;

public class MoveAction implements Action {
	
	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player) {
		List<Direction> listDirections = new ArrayList<Direction>();
		Room currentRoom = player.getGame().currentRoom();
		listDirections = currentRoom.getDirectionNeighbors();
		ListChoser lc = new ListChoser();
		Direction chosenDirection = lc.chose("Chose a direction : ", listDirections);
		player.getGame().playerMoveTo(chosenDirection);
	}
	
	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public boolean isPossible(Player player) {
		Room currentRoom = player.getGame().currentRoom();
		if (currentRoom.getMonsters().isEmpty() && !(currentRoom.getDirectionNeighbors().isEmpty() && !player.getGame().isFinished())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Move";
	}
	
}
