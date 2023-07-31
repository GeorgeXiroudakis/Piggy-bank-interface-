package csd.uoc.gr.A22;

/**
 * 
 * Exception thrown when the money box is not opened and it should be.
 *
 */
public class KoumparasIsNotBrokenException extends Exception {
	private static final long serialVersionUID = 3L;

	/**
	 * 
	 *default contractor
	 *
	 */
	public KoumparasIsNotBrokenException() {}
	
	/**
	 * 
	 * Contractor for messages 
	 *@param message error message
	 */
	public KoumparasIsNotBrokenException(String message) {super(message);}
}
