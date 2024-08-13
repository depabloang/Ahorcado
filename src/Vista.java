
public class Vista {

	
	public void mostrarFase(int fase) throws IllegalArgumentException {
		
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
			switch(fase) {
			case 1:
				for(var linea : FASE_1)
					System.out.println(linea);
				break;
			case 2:
				for(var linea : FASE_2)
					System.out.println(linea);
				break;
			case 3:
				for(var linea : FASE_3)
					System.out.println(linea);
				break;
			case 4: 
				for(var linea : FASE_4)
					System.out.println(linea);
				break;
			case 5: 
				for(var linea : FASE_5)
					System.out.println(linea);
				break;
			case 6:
				for(var linea : FASE_6)
					System.out.println(linea);
				break;
			case 7:
				for(var linea : FASE_FINAL)
					System.out.println(linea);
				break;
			default:
				throw new IllegalArgumentException();
			}
	}
}
