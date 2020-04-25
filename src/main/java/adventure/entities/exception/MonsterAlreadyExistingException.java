package adventure.entities.exception;

public class MonsterAlreadyExistingException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/** the message printed when there is this exception */
	private String message;
	
	/**
	 * 
	 * the message printed when there is this exception
	 */
	public MonsterAlreadyExistingException() {
		this.message = "This monster is already existing.";
	}
	
	/**
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

}
