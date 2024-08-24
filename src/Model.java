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
		this.setCoincidences();
	}
	
	public String word() {
		return word;
	}
	
	public String getWord() {
		Random r = new Random();
		int random_number = r.nextInt(words.length);
		return words[random_number].toUpperCase();
		
	}
	
	public char[] getCoincidences() {
		return this.coincidences;
	}
	
	public void setCoincidences() {
		this.coincidences = new char[this.word.length()];
		for(int i = 0; i < coincidences.length; i++) 
			coincidences[i] = '_';
	}
	
	public String processInput() {
		Scanner scan = new Scanner(System.in);
		String user_input;
		try {
			user_input = scan.nextLine();
		}catch(Exception e) {
			user_input = null;
		}
		//scan.close();
		return user_input.toUpperCase();
	}
	
	public boolean checkCoincidences(String userInput, String word) {
		Pattern pattern = Pattern.compile(userInput.toString(), Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(word);
		if(matcher.find()) {
			this.setNewCoincidences(word, userInput);
			return true;
		}else {
			return false;
		}
	
	}
	
	public void setNewCoincidences(String word, String userInput) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == userInput.charAt(0)) {
				this.coincidences[i] = word.charAt(i);
			}
		}
		
	}
}
