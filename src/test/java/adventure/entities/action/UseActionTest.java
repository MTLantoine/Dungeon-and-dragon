package adventure.entities.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class UseActionTest extends ActionTest {
	
	protected Action createAction() {
		return new UseAction();
	}

	@Test
	public void isPossibleTest() {
		assertTrue(super.action.isPossible(player1));
		assertTrue(super.action.isPossible(player3));
	}

	@Test
	public void isNotPossibleTest() {
		assertFalse(super.action.isPossible(player2));
		assertFalse(super.action.isPossible(player4));
	}

}
