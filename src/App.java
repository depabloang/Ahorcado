
public class App {
	private Engine engine;
	final private View view;
	private String word;
	
	public App(Engine engine, View view) {
		this.engine = engine;
		this.view = view;
		this.word = engine.getWord().toUpperCase();
	}
	
	public void StartApp() {
			welcomeMessage();
			engine.execute(this.view, this.word);
			
	}
	public void welcomeMessage() {
		System.out.println("Welcome to the Hangman game. The goal is to guess the hidden word"
				+ "\nby suggesting letters. You have 7 attempts. Good luck and have fun!");
	}
}

