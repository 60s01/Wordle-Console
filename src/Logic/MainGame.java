package Logic;

import java.util.List;

import static Shared.ConstantsLogic.*;

public class MainGame {
  private static String randomWord;
  private int attemptsLeft = MAX_ATTEMPTS;
  
  public MainGame(String randomWord) {
	this.randomWord = randomWord;
  }
  
  public GameResult processGuess(String userWord, List<String> dictionary) {
    if (userWord.equalsIgnoreCase(END0)) {
      return new GameResult("", true, attemptsLeft, true);
    }
	if (userWord.length() != WORD_LENGTH) {
      return new GameResult(LIMIT_SYMBOL, false, attemptsLeft, false);
    }
	if (!dictionary.contains(userWord)) {
      return new GameResult(WORD_NOT_FOUND, false, attemptsLeft, false);
    }
	
	attemptsLeft--;
	String result = checkWord(userWord);
	String check = TRUE_RANDOM_WORD.trim();
	return new GameResult(result, check.equals(result), attemptsLeft, false);	
  }

  private String checkWord(String userWord) {
	StringBuilder result = new StringBuilder();
    for (int i = 0; i < randomWord.length(); i++) {
      char c = userWord.charAt(i);
	  if (c == randomWord.charAt(i)) {
		result.append(CORRECTLY);
      } else if (randomWord.indexOf(c) != -1) {
        result.append(GOOD);
      } else {
        result.append(BAD);
      }
    }
    return result.toString().trim();
  }

  public int getAttemptsLeft() {
	return attemptsLeft;
  }
  
  public String getRandomWord() {
	return randomWord;
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

  
}