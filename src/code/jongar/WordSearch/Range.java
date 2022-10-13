package code.jongar.WordSearch;

import java.util.Objects;

public class Range {
	private Coordinate start;
	private Coordinate end;
	
	public Range(Coordinate start , Coordinate end) {
		this.start = start;
		this.end = end;
	}
	
	public String toString() {
		return String.format("(%d, %d) - (%d, %d)", start.row(), start.column(), end.row(), end.column());
	}

	@Override
	public int hashCode() {
		return Objects.hash(end, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range other = (Range) obj;
		return Objects.equals(end, other.end) && Objects.equals(start, other.start);
	}

}
