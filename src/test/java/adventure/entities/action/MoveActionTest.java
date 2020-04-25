package adventure.entities.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveActionTest extends ActionTest {
	
	protected Action createAction() {
		return new MoveAction();
	}

	@Test
	public void isPossibleTest() {
		assertFalse(super.action.isPossible(player1));
		assertFalse(super.action.isPossible(player4));
	}

	@Test
	public void isNotPossibleTest() {
		assertFalse(super.action.isPossible(player2));
		assertFalse(super.action.isPossible(player3));
	}

}
