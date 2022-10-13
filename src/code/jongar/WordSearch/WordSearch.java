package code.jongar.WordSearch;

import java.util.Optional;

public class WordSearch {
	private int sizeRows;
	private int sizeColumns;
	private char[][] board;
	private int[] displacementsX = {0, 1, 1, 1, 0, -1,-1,-1};
	private int[] displacementsY = {1, 1, 0,-1,-1, -1, 0, 1};
	
	public WordSearch(int sizeRows, int sizeColumns, String[]puzzle) {
		this.sizeRows = sizeRows;
		this.sizeColumns = sizeColumns;
		this.board = new char[sizeRows][sizeColumns];
		for (var x = 0; x < sizeRows ; x++ ) {
			for(var y = 0; y < sizeColumns; y++) {
				board[x][y] = puzzle[x].charAt(y);
			}
		}
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		  for (var x = 0; x < sizeRows; x++) {
		    for (var y = 0; y < sizeColumns; y++) {
		      builder.append(board[x][y]);
		    }
		    builder.append(System.lineSeparator());
		  }
		  var finalBoard = builder.toString();
		  return finalBoard;
	}
	
	private boolean isInMatrix(Coordinate finalChar) {
		return finalChar.row() >= 0 && finalChar.row() < sizeRows && finalChar.column() >=0 && finalChar.column() < sizeColumns;
	}
	
	public Optional<Range> find (String word) {
		var uppercaseWord = word.toUpperCase();
		for (var x = 0; x < sizeRows ; x++ ) {
			for(var y = 0; y < sizeColumns; y++) {
				if (uppercaseWord.charAt(0)== board[x][y]) {
					var firstChar = new Coordinate(x, y);	
					var finalChar = FindedWord(uppercaseWord, firstChar);
					if (finalChar != null) {
						return Optional.of(finalChar);
					}
				}
			}		
		}
		return Optional.empty(); 
	}

	private Range FindedWord(String word, Coordinate firstChar) {
		for( var i = 0; i < displacementsX.length; i++) {			
			var builder = new StringBuilder();
			builder.append(board[firstChar.row()][firstChar.column()]);
			
			var sameLength = false;			
			var finalChar = firstChar.displace(displacementsX[i], displacementsY[i] );
			while (isInMatrix(finalChar) && !sameLength) {
				builder.append(board[finalChar.row()][finalChar.column()]);
				sameLength = builder.length() == word.length();
				if (!sameLength) {
					finalChar = finalChar.displace(displacementsX[i], displacementsY[i] );
				}
			}
			
			var findWord = builder.toString();
			if(word.equals(findWord)) {
				return new Range(firstChar , finalChar);
			}
		}
		return null;
	}

	

}
