
public class Engine {
	
	private Model model;
	private View view;
	

	public Engine(View v, Model m) {
		view = v;
		model = m;
	}
	public void execute() {
		this.welcomeMessage();
		String user_input;
		while(true) {
			view.showWord(model.getCoincidences());
			view.showPhase(model.getPhase());
			System.out.println("\nEnter a letter:");
			user_input = model.processInput();
			if(model.checkCoincidences(user_input, model.word())) {
				model.setNewCoincidences(model.word(), user_input);
			}else {
				model.setPhase(model.getPhase() + 1);
			}
			if(model.checkResult()) {
				view.showWord(model.getCoincidences());
				view.showPhase(model.getPhase());
				break;
			}
				
		}
		model.setEndgameResult(model.getStatus());
		model.closeScan();
	}
		
	public void welcomeMessage() {
		System.out.println("Welcome to the Hangman game. The goal is to guess the hidden word"
				+ "\nby suggesting letters. You have 7 attempts. Good luck and have fun\n");
	}
}
