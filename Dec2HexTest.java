// Imports
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {
	
	// Basic Constructor
	public Dec2HexTest(){
	}
	
	// Initialises dec2hex variable
	Dec2Hex dec2hex;

	// Executes before any tests
	@Before
	public void setUp(){
		// Declares dec2Hex as a new Dec2Hex class
		dec2hex = new Dec2Hex();
	}

	// First Test checks normal input
	@Test
	public void testInteger() {
		// Compares result of inputing 11 which should be B
		assertEquals("Regular integers should work","B", dec2hex.main(new String[]{"11"}));
	}

	// Second Test
	@Test
	public void testNoInput() {
		// Compares result of no input with should be an error
		assertEquals("No input should return an error","-1", dec2hex.main(new String[]{""}));
	}

	// Third Test
	@Test
	public void testInvalidInput() {
		// Compares result of invalid input which should be an error
		assertEquals("Should not accept a non integer","-1", dec2hex.main(new String[]{"a"}));
	}
}
