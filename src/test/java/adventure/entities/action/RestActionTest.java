package adventure.entities.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestActionTest extends ActionTest {
	
	protected Action createAction() {
		return new RestAction();
	}

	@Test
	public void isPossibleTest() {
		assertTrue(super.action.isPossible(player1));
		assertTrue(super.action.isPossible(player4));
	}

	@Test
	public void isNotPossibleTest() {
		assertTrue(super.action.isPossible(player2));
		assertTrue(super.action.isPossible(player3));
	}

}
