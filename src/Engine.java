import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		print("\nEnter a letter:");
		var user_input = processInput();
		boolean isCoincidence = checkCoincidences(user_input, word);
		view.showWord(word, this.coincidences);
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
	
	public boolean checkCoincidences(Character userInput, String word) {
		Pattern pattern = Pattern.compile(userInput.toString(), Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(word);
		if(matcher.find()) {
			print("Encontrada letra");
			return true;
		}else {
			return false;
		}
	
	}
	public void print(String message) {
		System.out.println(message);
	}
}
