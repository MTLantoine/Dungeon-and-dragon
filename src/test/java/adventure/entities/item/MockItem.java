package adventure.entities.item;

import adventure.entities.character.*;

public class MockItem extends Item {
	
	private int cmpt;

	public MockItem(int value) {
		super(value);
		this.cmpt = 0;
	}

	public void isUsedBy(Player player) {
		this.cmpt++;
	}
	
	public int getCmpt() {
		return this.cmpt;
	}

}
