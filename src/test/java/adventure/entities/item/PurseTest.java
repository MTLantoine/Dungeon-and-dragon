package adventure.entities.item;

public class PurseTest extends ItemTest {

	public Item createItem() {
		return new Purse(150);
	}
	
	public MockItem createMockItem() {
		return new MockItem(150);
	}

}
