package code.jongar.WordSearch;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CoordinateTest {

	@Test
	void RowTest() {
		var coordinate = new Coordinate(1,3);
		assertEquals(1, coordinate.row());
	}
	
	void ColumnTest() {
		var coordinate = new Coordinate(1,3);
		assertEquals(3, coordinate.column());
	}
	
	void dispñacementTest() {
		var coordinate = new Coordinate(1,3);
		assertEquals(new Coordinate(3,5), coordinate.displace(2, 2));
	}
	
	void toStringTest() {
		var coordinate = new Coordinate(1,3);
		assertEquals("(1, 3)", coordinate.toString());
	}

}
