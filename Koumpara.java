package csd.uoc.gr.A22;

/**
 *
 * 
 * 
 * This is a interface for a money box.
 * @author George Xirudakis AM: csd5067
 */
public interface Koumpara {
	/**constructors
	  *	
	  *A constructor that creates a new money box<p>
	  *it takes int capacity (how many pieces of money can it hold
	  *not writer in interface, because constructors are not allowed
	  */
	
	//Transformers
	
		/**
		 * This is a Transformer void function that takes a bill or coin in euro(eg 5-euro bill, 0.2-20 cent coin, 0.02-2 cent coin). Throws IllegalArgumentException, KoumparasIsFullException,
		 * KoumparasIsBrokenException <p>
		 * Precondition: The money box must not be full or broken and the billORCoin == 0.01 || 0.02 || 0.05 || 0.1 || 0.2 || 0.5 || 1 || 2 || 5 || 10 || 20 || 50 || 100 || 200 || 500 <p>
		 * Postcondition: adds the given amount to the money box and updates the capacity of the money box 
		 * @param billORCoin The worth of the bill or coin to add in the money box
		 * @throws IllegalArgumentException If illegal arg is given 
		 * @throws KoumparasIsFullException If you try to add in a full money box.
		 * @throws KoumparasIsBrokenException If you try to add in a broken money box.
		 */
		public void addMoney(double billORCoin)throws KoumparasIsBrokenException ,KoumparasIsFullException, IllegalArgumentException;
		
		/**
		 * This is a Transformer void function that breaks the money box. Throws  KoumparasIsBrokenException<p>
		 * Precondition: The money box must NOT be broken already <p>
		 * Postcondition: The money box will be marked as broken
		 * @throws KoumparasIsBrokenException If the money box is broken already
		 * 
		 */
		public void breakMoneyBox()throws KoumparasIsBrokenException;
		
		
	
	//Observers
		/**
		 * This Observer boolean function determines if the money box is full. <p>
		 * Precondition: none.(we assume a broken money box can still be full.)<p>
		 * Postcondition: will observe if the money box is full.
		 * @return True if money box is full, False if the money box is not full. 
		 */
		public boolean isFull();
		
		/**
		 * This Observer boolean function determines if the money box is broken<p>
		 * Precondition: none<p>
		 * Postcondition: will determine if the money box is broken
		 * @return True if the money box is broken and false if it is NOT broken
		 */
		public boolean isBroken();
		
	
	//Accessors
		
		/**
		 * This is a Accessor double function that returns the value of the money in the money box.<p>
		 * Preconditions: The money box must be broken.<p>
		 * postconditions: Will return the value of the money in the money box
		 * @return The value of the money in the money box(Double) 
		 * @throws KoumparasIsNotBrokenException If the money box is not broken
		 */
		public double valueOfMoneyBox()throws KoumparasIsNotBrokenException;
}
