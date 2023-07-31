package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Breaktest {

	@Test
	public void test() {
		boolean Ex = false;
		Koumparas k = new Koumparas(100);
		
		try {
			k.breakMoneyBox();
		} catch (KoumparasIsBrokenException e) {
			e.printStackTrace();
		}
		
		if( k.isBroken())Ex = true;
		
		assertEquals(true, Ex);
	}

}
