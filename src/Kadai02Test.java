import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test {

	@Test
	void testCountString() {
		Kadai02 k = new Kadai02();
		assertEquals(3,k.countString("aaabcdd", 'a'));
		assertEquals(0,k.countString("aaabcdd", 'あ'));
		assertEquals(1,k.countString("aaabcdd", 'b'));
		assertEquals(0,k.countString(null, 'a'));
		assertEquals(0,k.countString("bcd", 'a'));
	}

}
