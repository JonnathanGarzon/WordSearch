package code.jongar.WordSearch;
import java.util.Objects;

public class Coordinate {
	private int row;
	private int column;
	
	public Coordinate(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public int row () {
		return row;
	}
	
	public int column() {
		return column;
	}
	
	public  Coordinate displace(int rowDisplace, int columnDisplace) {
		int rowFinalPosition = row + rowDisplace;
		int columnFinalPosition = column + columnDisplace;
		return new Coordinate(rowFinalPosition, columnFinalPosition);
	}
	

	public String toString() {
		return String.format("(%d, %d)", row , column);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(column, row);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		return column == other.column && row == other.row;
	}

}
