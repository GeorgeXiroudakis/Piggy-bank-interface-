package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BreakingBrokenTest {

	@Test
	public void test() {
		boolean Ex = false;
		Koumparas k = new Koumparas(100);
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
		}
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			Ex = true;
		}
		
		assertEquals(true, Ex);
	}

}
