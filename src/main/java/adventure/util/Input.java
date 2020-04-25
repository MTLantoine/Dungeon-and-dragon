package adventure.util;

import java.util.*;

import adventure.entities.choosable.*;

public class Input {
	
	/** create a new scanner */
	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * @return what the player wrote
	 */
	public static String readString() {
		return Input.scanner.next();
	}
	
	/**
	 * 
	 * this function returns a type chosen from a list of selection
	 * 
	 * @param <T> the type
	 * @param list the list of all the choosable type
	 * @return the chosen type
	 */
	public <T extends Choosable> T inputChose(List<T> list) {
		String msgRecu = Input.readString();
		for (T o : list) {
			if (o.toString().toLowerCase().equals(msgRecu.toLowerCase())) {
				return o;
			}
		}
		return null;
	}

}
