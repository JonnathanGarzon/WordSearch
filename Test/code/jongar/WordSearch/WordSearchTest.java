package code.jongar.WordSearch;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class WordSearchTest {
	
	private static final String[] board = { 
			"VBREEFISHRACHP",
			"ANACROCODILEEB",
			"AOSTRICHTEGRDA",
			"IADDHCHEETAHGD",
			"BHRODRAVENENEG",
			"EYWDLSAMOLELHE",
			"ARTPVPRCBOLROR",
			"RHTOAAHCROWAGH",
			"CCANNORIAZEBRA",
			"HANYTAEKNINAWA"
	};

	@Test
	void findFishTest() {
		var game = new WordSearch(10, 14, board);
		var fishCoordinates = game.find("FISH");
		assertEquals(new Range(new Coordinate(0, 5), new Coordinate(0, 8)), fishCoordinates);	
	}
	
	@Test
	void findHedgehogTest() {
		var game = new WordSearch(10, 14, board);
		var hedgehogCoordinates = game.find("HEDGEHOG");
		assertEquals(new Range(new Coordinate(0, 12), new Coordinate(7, 12)), hedgehogCoordinates);
	}
	
	@Test
	void findCrocodileTest() {
		var game = new WordSearch(10, 14, board);
		var hedgehogCoordinates = game.find("CROCODILE");
		assertEquals(new Range(new Coordinate(1, 3), new Coordinate(1, 11)), hedgehogCoordinates);
	}

	@Test
	void findBatTest() {
		var game = new WordSearch(10, 14, board);
		var hedgehogCoordinates = game.find("Bat");
		assertEquals(Optional.of( new Range(new Coordinate(0, 1), new Coordinate(2, 3))), hedgehogCoordinates);
	}
	
	@Test
	void findAralTest() {
		var game = new WordSearch(10, 14, board);
		var hedgehogCoordinates = game.find("aral");
		assertEquals(Optional.of(new Range(new Coordinate(9, 13), new Coordinate(6, 10))), hedgehogCoordinates);
	}
}
