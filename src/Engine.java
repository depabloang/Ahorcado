

public class Engine {
	
	private View view;
	private Model model;

	public Engine(View v, Model m) {
		view = v;
		model = m;
	}
	public void execute() {
		this.welcomeMessage();
		char user_input;
		while(true) {
			view.showWord(model.word(), model.getCoincidences());
			view.showPhase(view.getPhase());
			System.out.println("\nEnter a letter:");
			user_input = model.processInput();
			if(model.checkCoincidences(user_input, model.word())) {
				//Si hay coincidencia imprimir las letras que coinciden
			}else {
				//Si no, aumentar la fase del ahorcado en 1
			}
		}

	}
	
	
	public void welcomeMessage() {
		System.out.println("Welcome to the Hangman game. The goal is to guess the hidden word"
				+ "\nby suggesting letters. You have 7 attempts. Good luck and have fun\n");
	}
	
	
	
	

}
