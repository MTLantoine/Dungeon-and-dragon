package adventure.entities.action;

import adventure.entities.character.*;
import adventure.entities.room.*;

public class RestAction implements Action {
	
	/**
	 * 
	 * @param player the player who will make the action
	 */
	public void action(Player player) {
		System.out.println();
		for (int i = 10; i >= 0; i--) {
			System.out.print(i);
			try {
				for (int j = 0; j < 3; j++) {
					Thread.sleep(250);
		            System.out.print(".");
				}
	            System.out.print(" ");
	            Thread.sleep(250);
	         } catch (InterruptedException e) {
	             System.out.println(e.getMessage());
	         }
		}
		player.changeLife(50);
		System.out.println("\n");
		System.out.println("You now have " + player.getLife() + " points of life.");
	}
	
	/**
	 * 
	 * @param player the player that can make an action or not
	 * @return true if the player can make the action, false else
	 */
	public boolean isPossible(Player player) {
		Room currentRoom = player.getGame().currentRoom();
		if (currentRoom.getMonsters().isEmpty() && !player.getGame().isFinished()) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return the name of the choosable
	 */
	public String toString() {
		return "Rest";
	}
	
}
