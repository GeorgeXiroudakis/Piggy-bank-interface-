package csd.uoc.gr.A22;

/**
 * This Class implements the template koumpara.
 * @author George
 *
 */
public class Koumparas implements Koumpara{
	private boolean broken;
	private int MaxCap;
	private int activeCapacity;
	private double[] piecesOfMoney;
	
	
	public Koumparas(int maxCap) {
		this.MaxCap = maxCap;
		this.piecesOfMoney = new double[maxCap];
		this.broken = false;
		this.activeCapacity = 0;
	}
	
	
	

	@Override
	public void addMoney(double billORCoin)
			throws KoumparasIsBrokenException, KoumparasIsFullException, IllegalArgumentException {
		
		if(this.isFull())throw new KoumparasIsFullException("You can not add money to a full money box");
		
		if(this.isBroken())throw new KoumparasIsBrokenException("You can not add money to a broken money box");
		
		if( !( (billORCoin == 0.01) || (billORCoin == 0.02) || (billORCoin == 0.05) || (billORCoin == 0.1) || 
				(billORCoin == 0.2) || (billORCoin == 0.5) || (billORCoin == 1.0) || 
				(billORCoin == 2.0) || (billORCoin == 5) || (billORCoin == 10.0) || (billORCoin == 20.0 ) || 
				(billORCoin == 50) || (billORCoin == 100) || (billORCoin == 200) || (billORCoin == 500) ) )
				throw new IllegalArgumentException("Illegal Argument");
		
		this.piecesOfMoney[this.activeCapacity++] = billORCoin;
		
	}



	@Override
	public void breakMoneyBox() throws KoumparasIsBrokenException {
		if(this.isBroken())throw new 
		KoumparasIsBrokenException("Can not break a money box that is already broken");
		
		this.broken = true;
	}



	@Override
	public boolean isFull() {return this.activeCapacity == this.MaxCap;}



	@Override
	public boolean isBroken() {return this.broken;}



	@Override
	public double valueOfMoneyBox() throws KoumparasIsNotBrokenException {
		if( !(this.isBroken() ) ) throw new KoumparasIsNotBrokenException("You can not see the value of an unbroken money box");
		
		double sum = 0;
		for(int i = 0; i < this.activeCapacity; i++) {
			sum += this.piecesOfMoney[i];
		}
		
		return sum;
	}
	
	
}
