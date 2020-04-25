package adventure.entities.item;

import static org.junit.Assert.*;

import org.junit.*;

import adventure.entities.character.*;

public abstract class ItemTest {

	protected Player player;
	protected Item item;
	protected MockItem mockItem;
	protected abstract Item createItem();
	protected abstract MockItem createMockItem();
	
	@Before
	public void initObjects() {
		this.item = this.createItem();
		this.mockItem = this.createMockItem();
		this.player = new Player(50, 50, 50);
	}

	@Test
	public void getValueTest() {
		assertEquals(150, this.item.getValue());
	}

	@Test
	public void setValueTest() {
		this.item.setValue(200);
		assertEquals(200, this.item.getValue());
	}
	
	@Test
	public void isUsedByTest() {
		assertEquals(0, this.mockItem.getCmpt());
		this.mockItem.isUsedBy(player);
		assertEquals(1, this.mockItem.getCmpt());
	}

}
