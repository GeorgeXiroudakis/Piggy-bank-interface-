package csd.uoc.gr.A22;

/**
 * 
 * Exception thrown when the money box is opened and it should not be.
 *
 */
public class KoumparasIsBrokenException extends Exception{
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 *default contractor
	 *
	 */
	public KoumparasIsBrokenException() {}
	
	/**
	 * 
	 * Contractor for messages 
	 *@param message error message
	 */
	public KoumparasIsBrokenException(String message) {super(message);}
}
