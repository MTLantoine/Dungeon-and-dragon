package adventure.entities.action;

import org.junit.*;

import adventure.entities.*;
import adventure.entities.character.*;
import adventure.entities.item.*;
import adventure.entities.room.*;

public abstract class ActionTest {
	
	protected abstract Action createAction();
	protected Action action;
	
	protected Room noMonsterRoom;
	protected Room noItemRoom;
	protected Room fullRoom;
	protected Room emptyRoom;
	
	protected AdventureGame noMonsterGame;
	protected AdventureGame noItemGame;
	protected AdventureGame fullGame;
	protected AdventureGame emptyGame;
	
	protected Player player1;
	protected Player player2;
	protected Player player3;
	protected Player player4;

	protected Monster monster1;
	protected Monster monster2;

	protected LifePotion lifePotion;
	protected StrengthPotion strengthPotion;

	@Before
	public void initObjects() {
		this.action = this.createAction();
		
		this.noMonsterRoom = new Room();
		this.noItemRoom = new Room();
		this.fullRoom = new Room();
		this.emptyRoom = new Room();
		
		this.noMonsterGame = new AdventureGame(this.noMonsterRoom);
		this.noItemGame = new AdventureGame(this.noItemRoom);
		this.fullGame = new AdventureGame(this.fullRoom);
		this.emptyGame = new AdventureGame(this.emptyRoom);
		
		this.player1 = new Player(1, 1, 1, this.noMonsterGame);
		this.player2 = new Player(1, 1, 1, this.noItemGame);
		this.player3 = new Player(1, 1, 1, this.fullGame);
		this.player4 = new Player(1, 1, 1, this.emptyGame);

		this.monster1 = new Monster(1, 1, 1, null, this.noItemGame);
		this.monster2 = new Monster(1, 1, 1, null, this.fullGame);
		
		this.noMonsterGame.currentRoom().addItem(this.lifePotion);
		this.fullGame.currentRoom().addItem(this.lifePotion);
		this.fullGame.currentRoom().addItem(this.strengthPotion);
		
	}

}
