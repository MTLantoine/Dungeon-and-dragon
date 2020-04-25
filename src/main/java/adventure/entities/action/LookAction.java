package adventure.entities.action;

import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.item.*;
import adventure.entities.room.*;

public class LookAction implements Action {
	
	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player) {
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		int cmpt = 1;
		Room room = player.getGame().currentRoom();
		System.out.println("Your actual state ->");
		System.out.println("	Life : " + player.getLife());
		System.out.println("	Strength : " + player.getStrength());
		System.out.println("	Purse : " + player.getPurse());
		System.out.println();
		System.out.println("Monsters in the room ->");
		if (room.getMonsters().isEmpty()) {
			System.out.println("	None.");
		} else {
			for (Monster monster : room.getMonsters()) {
				System.out.println("	Monster " + cmpt + " ->");
				System.out.println("		Name : " + monster.getName());
				System.out.println("		Life : " + monster.getLife());
				System.out.println("		Strengh : " + monster.getStrength());
				System.out.println("		Purse : " + monster.getPurse());
				cmpt ++;
			}
		}
		System.out.println();
		System.out.println("Items in the room ->");
		if (room.getItems().isEmpty()) {
			System.out.println("	None.");
		} else {
			for (Item item : room.getItems()) {
				System.out.println("	" + item.toString() + " : " + item.getValue());
			}
		}
		System.out.println();
		System.out.println("Possible ways to escape ->");
		if (room.getDirectionNeighbors().isEmpty()) {
			System.out.println("	None.");
		} else {
			for (Direction direction : room.getDirectionNeighbors()) {
				System.out.println("	" + direction.toString());
			}
		}
		System.out.println();
		System.out.println("------------------------------");
	}
	
	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public boolean isPossible(Player player) {
		if (player.getGame().isFinished()) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Look";
	}

}
