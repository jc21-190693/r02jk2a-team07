import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai03Test {

	@Test
	void testCountString() {
		Kadai03 k = new Kadai03();
		String t1 = "apple";
		assertArrayEquals(new char[] {'A','E','L','P'},k.CharacterList(t1));
		String t2 = "ApLlEslY";
		assertArrayEquals(new char[] {'A','E','L','P','S','Y'},k.CharacterList(t2));
		String t3 = null;
		assertArrayEquals(null,k.CharacterList(t3));
		String t4 = "  ";
		assertArrayEquals(new char[] {},k.CharacterList(t4));
		String t5 = "ぺっぱいなっぽーABC";
		assertArrayEquals(new char[] {'A','B','C'},k.CharacterList(t5));
	}

}
