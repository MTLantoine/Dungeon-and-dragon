package adventure.entities.item;

public class StrengthPotionTest extends ItemTest {

	public Item createItem() {
		return new StrengthPotion(150);
	}

	public MockItem createMockItem() {
		return new MockItem(150);
	}

}
