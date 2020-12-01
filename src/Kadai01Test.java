import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(k.ReverseString(null));
		assertEquals("1234",k.ReverseString("4321"));
		assertEquals("12345",k.ReverseString("54321"));
		assertEquals(" ",k.ReverseString(" "));
		assertEquals("1あ2い3う",k.ReverseString("う3い2あ1"));
		assertEquals("１２３４",k.ReverseString("４３２１"));
		assertEquals("　",k.ReverseString("　"));





	}

}
