package adventure;

import adventure.entities.*;
import adventure.entities.character.*;
import adventure.entities.direction.*;
import adventure.entities.exception.*;
import adventure.entities.item.*;
import adventure.entities.room.*;

import java.applet.*;

public class Main extends Applet {

	public static void main(String[] args) throws MonsterAlreadyExistingException, NeighborAlreadyExistingException {
		Room room0 = new Room();
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();
		Room room6 = new Room();
		Room room7 = new Room();
		Room room8 = new Room();
		Room room9 = new Room();
		ExitRoom roomExit = new ExitRoom();
		
		AdventureGame game = new AdventureGame(room0);

		Monster monster0 = new Monster(50,50,50,"One", game);
		Monster monster1 = new Monster(20,100,100,"Two", game);
		Monster monster2 = new Monster(50,150,50,"Three", game);
		Monster monster3 = new Monster(100,50,210,"Four", game);
		Monster monster4 = new Monster(30,200,150,"Five", game);
		Monster monster5 = new Monster(40,200,200,"Six", game);
		Monster monster6 = new Monster(80,80,140,"Seven", game);
		Monster monster7 = new Monster(70,50,100,"Height", game);
		Monster monster8 = new Monster(10,90,20,"Nine", game);
		Monster monster9 = new Monster(5,500,1000,"Ten", game);
		Monster monster10 = new Monster(1000,1000,10000,"Eleven", game);
		Monster monster11 = new Monster(50,500,190,"Twelve", game);
		Monster monster12 = new Monster(200,500,5,"Thirteen", game);
		Monster monster13 = new Monster(50,500,100,"Fourteen", game);
		Monster monster14 = new Monster(50,500,100,"Fifteen", game);
		Monster monster15 = new Monster(50,500,100,"Sixteen", game);
		Monster monster16 = new Monster(50,500,100,"Seventeen", game);
		Monster monster17 = new Monster(50,500,100,"Eightteen", game);
		Monster monster18 = new Monster(50,500,100,"Nineteen", game);
		
		LifePotion lpotion0 = new LifePotion(10);
		LifePotion lpotion1 = new LifePotion(50);
		LifePotion lpotion2 = new LifePotion(200);
		LifePotion lpotion3 = new LifePotion(500);
		
		StrengthPotion spotion0 = new StrengthPotion(10);
		StrengthPotion spotion1 = new StrengthPotion(50);
		StrengthPotion spotion2 = new StrengthPotion(200);
		StrengthPotion spotion3 = new StrengthPotion(500);


		/* -- Room 1 -- */
		room0.addMonster(monster0);
		room0.addNeighbor(Direction.NORTH, room1);
		room0.addNeighbor(Direction.EAST, room2);
		/* triche*/
		room0.addNeighbor(Direction.SOUTH, roomExit);
		
		/* -- Room 2 -- */
		
		room1.addMonster(monster1);
		room1.addMonster(monster2);
		room1.addItem(spotion1);
		room1.addNeighbor(Direction.WEST, room2);
		
		/* -- Room 3 -- */
		
		room2.addMonster(monster3);
		room2.addItem(lpotion2);
		room2.addItem(spotion2);
		room2.addNeighbor(Direction.SOUTH, room3);
		room2.addNeighbor(Direction.NORTH, room4);
		
		/* -- Room 4 -- */
		
		room3.addMonster(monster4);
		room3.addMonster(monster5);
		room3.addMonster(monster6);
		room3.addItem(lpotion3);
		room3.addItem(spotion3);
		room3.addNeighbor(Direction.EAST, room5);
		
		/* -- Room 5 -- */
		
		room4.addMonster(monster7);
		room4.addItem(spotion0);
		room4.addNeighbor(Direction.WEST, room6);
		
		/* -- Room 6 -- */
		room5.addMonster(monster8);
		room5.addMonster(monster10);
		room5.addNeighbor(Direction.SOUTH, room7);
		room5.addNeighbor(Direction.EAST, room4);
		
		/* -- Room 7 -- */
		room6.addMonster(monster9);
		room6.addNeighbor(Direction.NORTH, room7);
		room6.addItem(lpotion0);
		room6.addItem(spotion3);
		
		/* -- Room 8 -- */
		
		room7.addMonster(monster11);
		room7.addMonster(monster12);
		room7.addMonster(monster13);
		room7.addMonster(monster14);
		room7.addItem(lpotion0);
		room7.addItem(lpotion1);
		room7.addNeighbor(Direction.SOUTH, room9);
		room7.addNeighbor(Direction.WEST, room8);
		
		/* -- Room 9 -- */
		
		room8.addMonster(monster15);
		room8.addMonster(monster16);
		room8.addItem(lpotion3);
		room8.addItem(spotion1);
		
		/* -- Room 10 -- */
		
		room9.addMonster(monster17);
		room9.addMonster(monster18);
		room9.addItem(spotion2);
		room9.addNeighbor(Direction.EAST, room0);
		room9.addNeighbor(Direction.WEST, roomExit);

		game.play();
		
	}
	
}
