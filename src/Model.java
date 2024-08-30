
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
	private char[] coincidences = null;
	private int currentPhase = 0;
	private Scanner scan;
	private int status = 0; //0 -> Still playing, 1 -> Lost, 2 -> Win
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
		this.scan = new Scanner(System.in);
		this.setCoincidences();
	}
	
	public boolean checkCoincidences(String userInput, String word) {
		Pattern pattern = Pattern.compile(userInput.toString(), Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(word);
		if(matcher.find()) {
			return true;
		}
		
		return false;		
	}
	
	public boolean checkResult() {
		if(this.currentPhase >= 7) {
			this.status = 1;
			return true;
		}
		
		for(var letter : this.coincidences) {
			if(letter == '_') {
				return false;
			}
		}
		this.status = 2;
		return true;
	}
	
	public char[] getCoincidences() {
		return this.coincidences;
	}
	
	public int getPhase() {
		return this.currentPhase;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public String getWord() {
		Random r = new Random();
		int random_number = r.nextInt(words.length);
		return words[random_number].toUpperCase();
	}
	
	public String processInput() {		
		String user_input = null;
		boolean is_valid_input = false; 
		while(!is_valid_input) {
			try {
				user_input = this.scan.next();
				if(user_input.length() == 1) {
					is_valid_input = true;
				}
				else 
					System.out.format("Your input: %s was not valid. Please, try again:%n", user_input);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return user_input.toUpperCase();
	}
	
	public void setCoincidences() {
		this.coincidences = new char[this.word.length()];
		for(int i = 0; i < coincidences.length; i++) 
			coincidences[i] = '_';
	}
	
	public void setEndgameResult(int status) {
		switch(status) {
		case 1:
			System.out.format("Sorry, YOU LOST. The word was %s. More luck next time :( %n", this.word);
			break;
		case 2:
			System.out.format("CONGRATULATIONS! You found the secret word: %s%n", this.word);
			break;
		}
	}
	
	public void setNewCoincidences(String word, String userInput) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == userInput.charAt(0)) {
				this.coincidences[i] = word.charAt(i);
			}
		}		
	}
	
	public void setPhase(int newPhase) {
		this.currentPhase = newPhase;
	}
	
	
	public String word() {
		return word;
	}
	
	public void closeScan() {
		this.scan.close();
	}
}
