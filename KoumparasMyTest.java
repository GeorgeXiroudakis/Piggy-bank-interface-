package csd.uoc.gr.A22;


/**
 * 
 * This is a test file without using junit.
 * It runs all the test at ones and if all pass it prints pass in the console
 * If at least one test fails it prints fail in the console	<p>
 * 
 *
 */
public class KoumparasMyTest {
	
	//adding money in a broken money box
	public boolean addToBrokenTest() {
		Koumparas k = new Koumparas(100);
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			return false;
		}
		
		try {
			k.addMoney(100);
		} catch (KoumparasIsBrokenException  e) {
			return true;
		}catch (IllegalArgumentException e) {
			
		}catch(KoumparasIsFullException e) {
			
		}
		
		return false; //
	}
	
	//adding money with invalid arg
	public boolean addWithInvalidArgTest() {
		Koumparas k = new Koumparas(100);
		
		try {
			k.addMoney(75);
		} catch (KoumparasIsBrokenException  e) {
			
		}catch (IllegalArgumentException e) {
			return true;
		}catch(KoumparasIsFullException e) {
			
		}
		
		return false; //
	}
	
	//adding to full money box
	public boolean addToFullTest() {
		final int capTop = 100;
		final int capBotom = 1;
		final int namberOfCurrancy = 15;
		int curn;
		double cur;
		
		int MaxCap = (int) (Math.random()*(capTop-capBotom+1)+capBotom);
		Koumparas k = new Koumparas(MaxCap);
		
		for(int i = 0; i < MaxCap; i++) {
			curn = (int) (Math.random() * (namberOfCurrancy - 1 + 1)+ 1);
			
			switch (curn) {
			case 1: {
				cur = 0.01;
				break;
			}
			case 2: {
				cur = 0.02;
				break;
			}
			case 3: {
				cur = 0.05;
				break;
			}
			case 4: {
				cur = 0.1;
				break;
			}
			case 5: {
				cur = 0.2;
				break;
			}
			case 6: {
				cur = 0.5;
				break;
			}
			case 7: {
				cur = 1.0;
				break;
			}
			case 8: {
				cur = 2.0;
				break;
			}
			case 9: {
				cur = 5.0;
				break;
			}
			case 10: {
				cur = 10.0;
				break;
			}
			case 11: {
				cur = 20.0;
				break;
			}
			case 12: {
				cur = 50.0;
				break;
			}
			case 13: {
				cur = 100.0;
				break;
			}
			case 14: {
				cur = 200.0;
				break;
			}
			case 15: {
				cur = 500.0;
				break;
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + curn);
			}
			
			try {
				k.addMoney(cur);
			} catch (IllegalArgumentException | KoumparasIsBrokenException | KoumparasIsFullException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			k.addMoney(5.0);
		} catch (KoumparasIsBrokenException  e) {
			
		}catch (IllegalArgumentException e) {
			
		}catch(KoumparasIsFullException e) {
			return true;
		}
		
		return false; //
	}
	
	
	//trying to get the value of an unbroken money box
	public boolean getValueOfUnopenTest() {
		Koumparas k = new Koumparas(100);
		try {
			k.valueOfMoneyBox();
		} catch (KoumparasIsNotBrokenException e) {
			return true;
		}
		
		return false; //
	}
	
	//breaking a broken money box
	public boolean breakingBrokenTest() {
		Koumparas k = new Koumparas(100);
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			return false;
		}
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			return true;
		}
		
		return false; //
	}
	
	//add adds correctly
	public boolean corectAddTest() {
		final int capTop = 100;
		final int capBotom = 1;
		final int namberOfCurrancy = 15;
		int curn;
		double cur;
		double samCur = 0;
		
		int MaxCap = (int) (Math.random()*(capTop-capBotom+1)+capBotom);
		Koumparas k = new Koumparas(MaxCap);
		
		for(int i = 0; i < MaxCap; i++) {
			curn = (int) (Math.random() * (namberOfCurrancy - 1 + 1)+ 1);
			
			switch (curn) {
			case 1: {
				cur = 0.01;
				break;
			}
			case 2: {
				cur = 0.02;
				break;
			}
			case 3: {
				cur = 0.05;
				break;
			}
			case 4: {
				cur = 0.1;
				break;
			}
			case 5: {
				cur = 0.2;
				break;
			}
			case 6: {
				cur = 0.5;
				break;
			}
			case 7: {
				cur = 1.0;
				break;
			}
			case 8: {
				cur = 2.0;
				break;
			}
			case 9: {
				cur = 5.0;
				break;
			}
			case 10: {
				cur = 10.0;
				break;
			}
			case 11: {
				cur = 20.0;
				break;
			}
			case 12: {
				cur = 50.0;
				break;
			}
			case 13: {
				cur = 100.0;
				break;
			}
			case 14: {
				cur = 200.0;
				break;
			}
			case 15: {
				cur = 500.0;
				break;
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + curn);
			}
			samCur += cur;
			
			try {
				k.addMoney(cur);
			} catch (IllegalArgumentException | KoumparasIsBrokenException | KoumparasIsFullException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e1) {
			e1.printStackTrace();
		}
		
		try {
			return samCur == k.valueOfMoneyBox();
		} catch (KoumparasIsNotBrokenException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	
	//breaking money box works correctly
	public boolean breaktestTest() {
		Koumparas k = new Koumparas(100);
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			e.printStackTrace();
		}
		
		return k.isBroken();
	}
	
	//test is the is full function is correct 
	public boolean isFullTest() {
		final int capTop = 100;
		final int capBotom = 1;
		final int namberOfCurrancy = 15;
		int curn;
		double cur;
		int MaxCap = (int) (Math.random()*(capTop-capBotom+1)+capBotom);
		Koumparas k = new Koumparas(MaxCap);
		
		for(int i = 0; i < MaxCap; i++) {
			curn = (int) (Math.random() * (namberOfCurrancy - 1 + 1)+ 1);
			
			switch (curn) {
			case 1: {
				cur = 0.01;
				break;
			}
			case 2: {
				cur = 0.02;
				break;
			}
			case 3: {
				cur = 0.05;
				break;
			}
			case 4: {
				cur = 0.1;
				break;
			}
			case 5: {
				cur = 0.2;
				break;
			}
			case 6: {
				cur = 0.5;
				break;
			}
			case 7: {
				cur = 1.0;
				break;
			}
			case 8: {
				cur = 2.0;
				break;
			}
			case 9: {
				cur = 5.0;
				break;
			}
			case 10: {
				cur = 10.0;
				break;
			}
			case 11: {
				cur = 20.0;
				break;
			}
			case 12: {
				cur = 50.0;
				break;
			}
			case 13: {
				cur = 100.0;
				break;
			}
			case 14: {
				cur = 200.0;
				break;
			}
			case 15: {
				cur = 500.0;
				break;
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + curn);
			}
			try {
				k.addMoney(cur);
			} catch (IllegalArgumentException | KoumparasIsBrokenException | KoumparasIsFullException e) {
				e.printStackTrace();
			}
		}
		return k.isFull();
	}
		
												
	/**
	 * Calls all the tests. prints pass if all the tests pass otherwise prints fail in the console.<p>
	 * @param args does not use it.
	 * 
	 */
	public static void main(String[] args) {
		KoumparasMyTest k = new KoumparasMyTest();
		if( k.isFullTest() &&
				k.addToBrokenTest() && 
				k.addToFullTest() &&
				k.addWithInvalidArgTest() && 
				k.breakingBrokenTest() && 
				k.breaktestTest() &&
				k.corectAddTest() && 
				k.getValueOfUnopenTest() ) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");
		}
	}
	
}
