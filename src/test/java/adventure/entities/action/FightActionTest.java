package adventure.entities.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class FightActionTest extends ActionTest {
	
	protected Action createAction() {
		return new FightAction();
	}

	@Test
	public void isPossibleTest() {
		assertFalse(super.action.isPossible(player2));
		assertFalse(super.action.isPossible(player3));
	}

	@Test
	public void isNotPossibleTest() {
		assertFalse(super.action.isPossible(player1));
		assertFalse(super.action.isPossible(player4));
	}

}
