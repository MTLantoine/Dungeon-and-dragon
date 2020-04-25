package adventure.entities.character;

import adventure.entities.*;
import adventure.entities.choosable.*;

public abstract class Character implements Choosable {

	/** the life of the character */
	protected int life;
	
	/** the strength of the character */
	protected int strength;
	
	/** the purse of the character */
	protected int purse;
	
	/** the live state of the character */
	protected boolean isDead;
	
	/** the game played */
	protected AdventureGame game;
	
	/** the name of the character */
	protected String name;
	
	/**
	 * 
	 * @param life the life of the character
	 * @param strength the strength of the character
	 * @param purse the purse of the character
	 * @param name the name of the character
	 * @param game the game played
	 */
	public Character(int life, int strength, int purse, String name, AdventureGame game) {
		this.life = life;
		this.strength = strength;
		this.purse = purse;
		this.game = game;
		this.name = name;
	}
	
	/**
	 * 
	 * @param life the life of the character
	 * @param strength the strength of the character
	 * @param purse the purse of the character
	 * @param game the game played
	 */
	public Character(int life, int strength, int purse, AdventureGame game) {
		this.life = life;
		this.strength = strength;
		this.purse = purse;
		this.game = game;
	}
	
	/**
	 * 
	 * @param life the life of the character
	 * @param strength the strength of the character
	 * @param purse the purse of the character
	 * @param name the name of the character
	 */
	public Character(int life, int strength, int purse, String name) {
		this.life = life;
		this.strength = strength;
		this.purse = purse;
		this.name = name;
	}

	/**
	 * 
	 * @param life the life of the character
	 * @param strength the strength of the character
	 * @param purse the purse of the character
	 */
	public Character(int life, int strength, int purse) {
		this.life = life;
		this.strength = strength;
		this.purse = purse;
	}
	
	
	/**
	 * 
	 * @param newName the new name for the character
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	/**
	 * 
	 * @return the name of the character
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return the game played
	 */
	public AdventureGame getGame() {
		return this.game;
	}
	
	/**
	 * 
	 * @return the life of the character
	 */
	public int getLife() {
		return this.life;
	}
	
	/**
	 * 
	 * @param life the life which is added to the current life of the character
	 */
	public void changeLife(int life) {
		this.life += life;
	}
	
	/**
	 * 
	 * @return the strength of the character
	 */
	public int getStrength() {
		return this.strength;
	}
	
	/**
	 * 
	 * @param strength the strength which is added to the current strength of the character
	 */
	public void changeStrength(int strength) {
		this.strength += strength;
	}
	
	/**
	 * 
	 * @return the purse of the character
	 */
	public int getPurse() {
		return this.purse;
	}
	
	/**
	 * 
	 * @param purse the purse which is added to the current purse of the character
	 */
	public void changePurse(int purse) {
		this.purse += purse;
	}
	
	/**
	 * 
	 * @param character the character who suffer the action
	 */
	public void action(Character character) {
		character.changeLife(-this.getStrength());
	}
	
	/**
	 * 
	 * @return true if the character is dead, false else
	 */
	public boolean isDead() {
		if (this.getLife() <= 0) {
			return true;
		}
		return false;
	}
	
}
