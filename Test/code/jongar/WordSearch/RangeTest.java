package code.jongar.WordSearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RangeTest {

	@Test
	void test() {
		var range = new Range(new Coordinate(1,3), new Coordinate(2, 4));
		assertEquals("(1, 3) - (2, 4)", range.toString());
	}

}
