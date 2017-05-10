import java.util.Random;
import java.util.Scanner;


public class Hangman {
	
	private static Random rnd = new Random();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char[] secretWord;
		//String [] temp = {"a"};
		boolean gameActive;
		boolean playerWins;
		char[] wordDisplay;
		String guess, newGame;
		int lives = 5;
		String[] wordList = {"hello", "coding", "spelling", "hangman", "zenith", "prowess"};
		
		
		System.out.print("Hello! Do you want to play a game of Hangman? ");
		newGame = scan.nextLine().trim();
		
		while (newGame.equalsIgnoreCase("yes")) {
			
			gameActive = true;
			playerWins = false;
			int wordChoose = rnd.nextInt(6);
			
			secretWord = wordList[wordChoose].toCharArray();
			wordDisplay = new char[secretWord.length];
			for (int i=0; i < wordDisplay.length; i++){
				wordDisplay[i] = '_';
			}
			
			//string.toCharArray();
			
			while(gameActive == true) {
				displayWord(wordDisplay);
				System.out.print("\nGuess a letter: ");
				guess = scan.nextLine().trim();
				while (guess.equals("")){
					System.out.println("Please enter a letter!");
					guess = scan.nextLine().trim();
				}
				
				boolean match = false;
				boolean repeat = false;
				
				for (int i = 0; i < secretWord.length; i++){
					if (guess.charAt(0) == wordDisplay[i]) {
						repeat = true;
					} else if (guess.charAt(0) == secretWord[i]) {
						wordDisplay[i] = secretWord[i];
						match = true;
					} 
				}
				
				if (new String(wordDisplay).equals(new String(secretWord))) {
					gameActive = false;
					playerWins = true;
				}
				 if (repeat) {
					System.out.println("Sorry! You already guessed that letter!");
				} else if (gameActive && match) {
					System.out.println("Congrats! You got a letter");
				} else if (gameActive && !match) {
					lives--;
					if (lives == 0) {
						gameActive = false;
					} else {
						System.out.println("Sorry! Thats not in the word!");
						System.out.println("You have " + lives + " live(s) left.");
					}
				}
			}
			
			if (playerWins) {
				System.out.println("Yay! You won!");
			} else {
				System.out.println("Sorry! You lost!");
			}
			
			System.out.print("New game? ");
			newGame = scan.nextLine().trim();
		}
	}
	
	private static void displayWord(char[] word) {
		for (int i=0; i<word.length; i++) {
			System.out.print(word[i] + " ");
		}
	}
	
}
