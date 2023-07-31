package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddToBrokenTest {

	@Test
	public void test() {
		Koumparas k = new Koumparas(100);
		boolean Ex = false;
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			
		}
		
		try {
			k.addMoney(100);
		} catch (KoumparasIsBrokenException  e) {
			Ex = true;
		}catch (IllegalArgumentException e) {
			
		}catch(KoumparasIsFullException e) {
			
		}
		
		assertEquals(true, Ex);
	}

}
