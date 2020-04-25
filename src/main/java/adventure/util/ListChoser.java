package adventure.util;

import java.util.*;

import adventure.entities.choosable.*;

public class ListChoser {
	
	/** the chosen type */
	Input input = new Input();
	
	/**
	 * 
	 * @param <T> the type
	 * @param msg the message that will be printed before a choice
	 * @param list the list of all the choosable type
	 * @return the chosen type
	 */
	public <T extends Choosable> T chose(String msg, List<T> list) {
		T result = null;
		System.out.println();
		for (T o : list) {
			System.out.println(o.toString());
		}
		System.out.println();
		System.out.print(msg);
		while (result == null) {
			result = input.inputChose(list);
			if (result == null) {
				System.out.println();
				System.out.println("Your choice is not in the list. Try again !");
				System.out.println();
				System.out.print(msg);
			}
		}
		return result;
	}

}
