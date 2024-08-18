import java.util.Random;
import java.util.Scanner;

public class Engine {
	private int currentPhase = 0;
	private char[] coincidences = null;
	final private String[] words = {
			"random",
			"public",
			"void",
			"static",
			"string",
			"boolean",
			"delegate",
			"pointer",
			"reference",
			"integer",
			"double",
			"event"
	};
	
	public String getWord() {
		Random r = new Random();
		int random_number = r.nextInt(words.length);
		return words[random_number];
	}
	
	public void execute(View view, String word) {
		view.showWord(word, this.coincidences);
		view.showPhase(currentPhase);
		showMessage("\nEnter a letter:");
		var user_input = processInput();
		char[] coincidences = checkCoincidences(user_input, word);
		view.showWord(word, coincidences);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public Character processInput() {
		Scanner scan = new Scanner(System.in);
		Character user_input;
		try {
			user_input = scan.nextLine().charAt(0);
		}catch(Exception e) {
			user_input = null;
		}
		scan.close();
		return user_input;
	}
	
	public char[] checkCoincidences(Character userInput, String word) {
		//Sería algo como hacer un bucle al string y quedarse 
		//con las posiciones en donde existe una coincidencia.
		//Crear un array de chars
		//O mejor, utilizar un REGEX
		return null;
	}
}
