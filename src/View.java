
public class View {
	private int currentPhase = 0;
	
	public int getPhase() {
		return this.currentPhase;
	}
	public void setPhase(int newPhase) {
		this.currentPhase = newPhase;
	}
	public void showWord(char[] word) {
		for(var letter : word) 
			System.out.print(letter + " ");
	}
	public void showPhase(int phase) throws IllegalArgumentException {
		final String PHASE_0 = "\n";
		final String[] PHASE_1 = {
				"----------"
			};
			final String[] PHASE_2 = {
					"",
					"|",
					"|",
					"|",
					"|",
					"|",
					"----------"
			};
			final String[] PHASE_3 = {
					"_________",
					"|",
					"|",
					"|",
					"|",
					"|",
					"----------"
			};
			final String[] PHASE_4 = {
					"_________",
					"|       |",
					"|",
					"|",
					"|",
					"|",
					"----------"
			};
			final String[] PHASE_5 = {
					"_________",
					"|       |",
					"|       o",
					"|",
					"|",
					"|",
					"----------"
			};
			final String[] PHASE_6 = {
					"_________",
					"|       |",
					"|       o",
					"|      \\|/",
					"|",
					"|",
					"----------"
			};
			final String[] FINAL_PHASE = {
					"_________",
					"|       |",
					"|       o",
					"|      \\|/",
					"|      / \\",
					"|",
					"----------"
			};
			switch(phase) {
			case 0: 
				System.out.println(PHASE_0);
				break;
			case 1:
				for(var line : PHASE_1)
					System.out.println(line);
				break;
			case 2:
				for(var line : PHASE_2)
					System.out.println(line);
				break;
			case 3:
				for(var line : PHASE_3)
					System.out.println(line);
				break;
			case 4: 
				for(var line : PHASE_4)
					System.out.println(line);
				break;
			case 5: 
				for(var line : PHASE_5)
					System.out.println(line);
				break;
			case 6:
				for(var line : PHASE_6)
					System.out.println(line);
				break;
			case 7:
				for(var line : FINAL_PHASE)
					System.out.println(line);
				break;
			default:
				throw new IllegalArgumentException();
			}
	}
}
