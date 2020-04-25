package adventure.entities.action;

import java.util.*;

import adventure.entities.character.*;
import adventure.entities.room.*;
import adventure.util.*;

public class FightAction implements Action {

	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player) {
		List<Monster> listMonsters = new ArrayList<Monster>();
		Room currentRoom = player.getGame().currentRoom();
		listMonsters = currentRoom.getMonsters();
		ListChoser lc = new ListChoser();
		Monster chosenMonster = lc.chose("Chose a monster to attack : ", listMonsters);
		boolean isFightOver = false;
		while (!isFightOver) {
			player.action(chosenMonster);
			if (!(chosenMonster.isDead())) {
				chosenMonster.action(player);
			}
			if (player.isDead()) {
				isFightOver = true;
				player.die();
			}
			if (chosenMonster.isDead()) {
				isFightOver = true;
				chosenMonster.die();
			}
		}
	}
	
	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public boolean isPossible(Player player) {
		Room currentRoom = player.getGame().currentRoom();
		if (currentRoom.getMonsters().isEmpty() || player.getGame().isFinished()) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Fight";
	}
	
}
