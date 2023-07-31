package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CorectAddTest {

	@Test
	public void test() {
		boolean Eq = false;
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
			if( samCur == k.valueOfMoneyBox()) Eq = true;
		} catch (KoumparasIsNotBrokenException e) {
			
			e.printStackTrace();
		}
		
		assertEquals(true, Eq);

	}

}
