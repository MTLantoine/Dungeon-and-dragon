package adventure.entities.direction;

import adventure.entities.choosable.*;

public enum Direction implements Choosable {
	
	/**
	 * 
	 * the north direction
	 */
	NORTH {
		@Override
		public String toString() {
	        return "North";
	    }
	},
	
	/**
	 * 
	 * the east direction
	 */
	EAST {
		@Override
		public String toString() {
	        return "East";
	    }
	},
	
	/**
	 * 
	 * the south direction
	 */
	SOUTH {
		@Override
		public String toString() {
	        return "South";
	    }
	},
	
	/**
	 * 
	 * the west direction
	 */
	WEST {
		@Override
		public String toString() {
	        return "West";
	    }
	}
	
}
