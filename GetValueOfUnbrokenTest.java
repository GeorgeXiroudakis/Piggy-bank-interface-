package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetValueOfUnbrokenTest {

	@Test
	public void test() {
		boolean Ex = false;
		Koumparas k = new Koumparas(100);
		try {
			k.valueOfMoneyBox();
		} catch (KoumparasIsNotBrokenException e) {
			Ex = true;
		}
		
		assertEquals(true, Ex);
	}

}
