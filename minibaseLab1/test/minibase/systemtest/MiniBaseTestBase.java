package minibase.systemtest;

import org.junit.Before;

import minibase.Database;

/**
 * Base class for all MiniBase test classes. 
 * @author nizam
 *
 */
public class MiniBaseTestBase {
	/**
	 * Reset the database before each test is run.
	 */
	@Before	public void setUp() throws Exception {					
		Database.reset();
	}
	
}
