package adventure.entities.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class LookActionTest extends ActionTest {
	
	protected Action createAction() {
		return new LookAction();
	}

	@Test
	public void isPossibleTest() {
		assertTrue(super.action.isPossible(super.player1));
		assertTrue(super.action.isPossible(super.player2));
		assertTrue(super.action.isPossible(super.player3));
		assertTrue(super.action.isPossible(super.player4));
	}

	@Test
	public void isNotPossibleTest() {
		super.player1.die();
		super.player2.die();
		super.player3.die();
		super.player4.die();
		assertFalse(super.action.isPossible(super.player1));
		assertFalse(super.action.isPossible(super.player2));
		assertFalse(super.action.isPossible(super.player3));
		assertFalse(super.action.isPossible(super.player4));
	}

}
