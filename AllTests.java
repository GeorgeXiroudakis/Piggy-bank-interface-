package csd.uoc.gr.A22;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
/**
 * This class joins and runs all the Junit tests at once.
 * 
 * 
 *
 */
@Suite
@SelectClasses({ AddToBrokenTest.class, AddToFullTest.class, AddWithInvalidArgTest.class, BreakingBrokenTest.class,
		Breaktest.class, CorectAddTest.class, GetValueOfUnbrokenTest.class, IsFullTest.class })

public class AllTests {

}
