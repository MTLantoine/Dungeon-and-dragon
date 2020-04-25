package adventure.entities.character;

import java.util.*;

import adventure.entities.*;
import adventure.entities.action.*;
import adventure.util.*;

public class Player extends Character {
	
	/** the list of all the actions */
	private List<Action> listActions;
	
	/**	the list of only the actions that can be chosen on the moment */
	private List<Action> listPossiblesActions;

	/**
	 * 
	 * @param life the life of the player
	 * @param strenght the strength of the player
	 * @param purse the purse of the player
	 * @param game the game played
	 */
	public Player(int life, int strenght, int purse, AdventureGame game) {
		super(life, strenght, purse, game);
		this.listActions = new ArrayList<Action>();
		this.listPossiblesActions = new ArrayList<Action>();
		this.listActions();
	}

	/**
	 * 
	 * @param life the life of the player
	 * @param strenght the strength of the player
	 * @param purse the purse of the player
	 */
	public Player(int life, int strenght, int purse) {
		super(life, strenght, purse);
		this.listActions = new ArrayList<Action>();
		this.listPossiblesActions = new ArrayList<Action>();
		this.listActions();
	}
	
	/**
	 * 
	 * the player dies and the game is over
	 */
	public void die() {
		this.getGame().finishTheGame();
	}
	
	/**
	 * 
	 * fill the list of actions with all the actions
	 */
	public void listActions() {
		Action fightAction = new FightAction();
		this.listActions.add(fightAction);
		Action lookAction = new LookAction();
		this.listActions.add(lookAction);
		Action moveAction = new MoveAction();
		this.listActions.add(moveAction);
		Action useAction = new UseAction();
		this.listActions.add(useAction);
		Action restAction = new RestAction();
		this.listActions.add(restAction);
	}
	
	/**
	 * 
	 * @return the list of actions
	 */
	public List<Action> getListActions() {
		return this.listActions;
	}
	
	/**
	 * 
	 * actualize the list of actions each round in order to call only the possibles actions
	 */
	public void listPossiblesActions() {
		this.listPossiblesActions.clear();
		for (Action action : this.getListActions()) {
			if (action.isPossible(this)) {
				this.listPossiblesActions.add(action);
			}
		}
	}
	
	/**
	 * 
	 * the player make a choice on the list of possibles actions
	 */
	public void act() {
		this.listPossiblesActions();
		ListChoser lc = new ListChoser();
    	Action chosenAction = lc.chose("Chose an action : ", this.listPossiblesActions);
    	chosenAction.action(this);
	}
	
}
