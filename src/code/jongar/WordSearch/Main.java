package code.jongar.WordSearch;

public class Main {

	public static void main(String[] args) {
		String[] board = { 
				"VBREEFISHRACHP",
				"ANACROCODILEEB",
				"AOSTRICHTEGRDA",
				"IADDHCHEETAHGD",
				"BHRODRAVENENEG",
				"EYWDLSAMOLELHE",
				"ARTPVPRCBOLROR",
				"RHTOAAHCROWAGH",
				"CCANNORIAZEBRA",
				"HANYTAEKNINAWA"};
		
		var game = new WordSearch(10, 14, board);
		var coordenada = game.find("bat");
		
		
		coordenada.map(r -> r.toString()).orElse("<NO SE ENCUENTRA>");
		coordenada.map(Range::toString).orElse("<NO SE ENCUENTRA>");
		coordenada.ifPresent(System.out::println);
		coordenada.isPresent();
		
	}
	
	

}
