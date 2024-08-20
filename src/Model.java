import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
	private char[] coincidences = null;
	private String word;
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
	
	public Model() {
		word = getWord();
	}
	
	public String word() {
		return word;
	}
	
	public String getWord() {
		Random r = new Random();
		int random_number = r.nextInt(words.length);
		return words[random_number];
	}
	
	public char[] getCoincidences() {
		return this.coincidences;
	}
	public Character processInput() {
		Scanner scan = new Scanner(System.in);
		Character user_input;
		try {
			user_input = scan.nextLine().charAt(0);
		}catch(Exception e) {
			user_input = null;
		}
		//scan.close();
		return user_input;
	}
	
	public boolean checkCoincidences(Character userInput, String word) {
		Pattern pattern = Pattern.compile(userInput.toString(), Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(word);
		if(matcher.find()) {
			System.out.println("Encontrada letra");
			return true;
		}else {
			return false;
		}
	
	}
}
