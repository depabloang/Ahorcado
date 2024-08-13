
public class Main {

	public static void main(String[] args) {
		StartApp();
		

	}//Crear tres clases, Lógica, Vista y App. App tiene dos instancias de cada una
	
	public static void StartApp() {
		
		final String palabra = "Casa";
		final char[] opciones = palabra.toUpperCase().toCharArray();
		for(int i = 0; i < opciones.length; i++) {
			System.out.format("_ ");
		}
		
		final String[] FASE_1 = {
			"----------"
		};
		final String[] FASE_2 = {
				"",
				"|",
				"|",
				"|",
				"|",
				"|",
				"----------"
		};
		final String[] FASE_3 = {
				"_________",
				"|",
				"|",
				"|",
				"|",
				"|",
				"----------"
		};
		final String[] FASE_4 = {
				"_________",
				"|       |",
				"|",
				"|",
				"|",
				"|",
				"----------"
		};
		final String[] FASE_5 = {
				"_________",
				"|       |",
				"|       o",
				"|",
				"|",
				"|",
				"----------"
		};
		final String[] FASE_6 = {
				"_________",
				"|       |",
				"|       o",
				"|      \\|/",
				"|",
				"|",
				"----------"
		};
		final String[] FASE_FINAL = {
				"_________",
				"|       |",
				"|       o",
				"|      \\|/",
				"|      / \\",
				"|",
				"----------"
		};
		
	}
}
