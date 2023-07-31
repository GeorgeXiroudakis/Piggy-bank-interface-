package csd.uoc.gr.A22;

/**
 * 
 * Exception thrown when the money box is full when it should not be.
 *
 */
public class KoumparasIsFullException extends Exception{
	private static final long serialVersionUID = 2L;

	/**
	 * 
	 *default contractor
	 *
	 */
	public KoumparasIsFullException(){}
	
	/**
	 * Contractor for messages 
	 * @param messsage error message
	 */
	public KoumparasIsFullException(String messsage) {super(messsage);}
}
