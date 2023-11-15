import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

	public Dec2HexTest(){
	}

	Dec2Hex dec2hex;

	@Before
	public void setUp(){
		dec2hex = new Dec2Hex();
	}

	@Test
	public void testInteger() {
		assertEquals("Regular integers should work","B", dec2hex.main(new String[]{"11"}));
	}

	@Test
	public void testNoInput() {
		assertEquals("No input should return an error","-1", dec2hex.main(new String[]{""}));
	}

	@Test
	public void testInvalidInput() {
		assertEquals("Should not accept a non integer","-1", dec2hex.main(new String[]{"a"}));
	}
}
