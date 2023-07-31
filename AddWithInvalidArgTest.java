package csd.uoc.gr.A22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddWithInvalidArgTest {

	@Test
	public void test() {
		Koumparas k = new Koumparas(100);
		boolean Ex = false;
		
		try {
			k.addMoney(75);
		} catch (KoumparasIsBrokenException  e) {
			
		}catch (IllegalArgumentException e) {
			Ex = true;
		}catch(KoumparasIsFullException e) {
			
		}
		
		assertEquals(true, Ex);
	}

}
