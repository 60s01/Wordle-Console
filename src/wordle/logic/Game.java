package wordle.logic;

import java.util.List;

import wordle.logic.DictionaryLogic;
import static wordle.logic.ConstantsLogic.*;

public class Game {
  private static String secretWord;
  private int attemptsLeft = MAX_ATTEMPTS;
  
  public Game(String randomWord) {
	this.secretWord = randomWord;
  }
  
  public GameResult processGuess(String userWord, DictionaryLogic dictionaryLogic) {
    if (userWord.equalsIgnoreCase(COMMAND_EXIT)) {
      return new GameResult("", true, attemptsLeft, true);
    }
	if (userWord.length() != WORD_LENGTH) {
      return new GameResult(LIMIT_SYMBOL, false, attemptsLeft, false);
    }
	if (!dictionaryLogic.check(userWord)) {
      return new GameResult(WORD_NOT_FOUND, false, attemptsLeft, false);
    }
	
	attemptsLeft--;
	String result = checkWord(userWord);
	String check = TRUE_RANDOM_WORD.trim();
	return new GameResult(result, check.equals(result), attemptsLeft, false);	
  }

  private String checkWord(String userWord) {
	StringBuilder result = new StringBuilder();
    for (int i = 0; i < secretWord.length(); i++) {
      char c = userWord.charAt(i);
	  if (c == secretWord.charAt(i)) {
		result.append(CORRECTLY);
      } else if (secretWord.indexOf(c) != -1) {
        result.append(GOOD);
      } else {
        result.append(BAD);
      }
    }
    return result.toString().trim();
  }
	
  public static class GameResult {
    public final String message;
	public final boolean isGameWon;
	public final int attemptsLeft;
    public final boolean shouldExit;

    public GameResult(String message, boolean isGameWon, int attemptsLeft, boolean shouldExit) {
      this.message = message;
      this.isGameWon = isGameWon;
      this.attemptsLeft = attemptsLeft;
      this.shouldExit = shouldExit;
    }
  }
  
  public int getAttemptsLeft() {
	return attemptsLeft;
  }
  
  public String getSecretWord() {
	return secretWord;
  } 
}