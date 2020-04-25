package adventure.entities.room;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExitRoomTest extends RoomTest{

	@Test
	public void isExitTest() {
		assertTrue(this.exitRoom.isExit());
	}

}
