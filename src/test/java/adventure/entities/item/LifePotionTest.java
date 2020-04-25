package adventure.entities.item;

public class LifePotionTest extends ItemTest {

	public Item createItem() {
		return new LifePotion(150);
	}
	
	public MockItem createMockItem() {
		return new MockItem(150);
	}

}
