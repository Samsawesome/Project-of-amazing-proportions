import java.util.Random;

public class Hangman2 {
	private static Random rnd = new Random();
	private boolean gameActive;
	private boolean playerWins;
	private String[] wordList = {"hello", "coding", "spelling", "hangman", "zenith", "prowess"};
	private int lives;
	private char[] hiddenWord;
	private char[] displayedWord;
	private final int NUM_LIVES = 6;
	
	
	public Hangman2 (){
	}
	
	public void startNewGame(){
		lives = NUM_LIVES;
		gameActive = true;
		playerWins = false;
		hiddenWord = wordList[rnd.nextInt(6)].toCharArray();
		displayedWord = new char[hiddenWord.length];
		for (int i=0; i < displayedWord.length; i++){
			displayedWord[i] = '_';
		}
	}
	public boolean gameActive(){
		return gameActive;
	}
	public boolean playerWins(){
		return playerWins;
	}
	public int lives(){
		return lives;
	}
	public String displayedWord(){
		return String.valueOf(displayedWord);
	}
	
	public String guessLetter(char letter){
		boolean match = false;
		boolean repeat = false;
		
		for (int i = 0; i < hiddenWord.length; i++){
			if (letter == displayedWord[i]) {
				repeat = true;
			} else if (letter == hiddenWord[i]) {
				displayedWord[i] = hiddenWord[i];
				match = true;
			} 
		}
		
		if (new String(displayedWord).equals(new String(hiddenWord))) {
			gameActive = false;
			playerWins = true;
			return "You Win!";
		} else if (repeat) {
			return "Sorry! You already guessed that letter!";
		} else if (match) {
			return "Congrats! You got a letter";
		} else  {
			lives--;
			if (lives == 0) {
				gameActive = false;
				return "You have Lost! Sorry!";
			} else {
				return "Sorry! That is not in the word!";
			}
		} 
	}
	
	
}
