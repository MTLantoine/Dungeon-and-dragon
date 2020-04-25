package adventure.entities.exception;

public class NeighborAlreadyExistingException extends Exception {

	private static final long serialVersionUID = 110627792411212581L;
	
	/** the message printed when there is this exception */
	private String message;
	
	/**
	 * 
	 * the message printed when there is this exception
	 */
	public NeighborAlreadyExistingException() {
		this.message = "This neighbor is already existing.";
	}
	
	/**
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

}
