package wordle.representation;

import java.util.List;
import java.util.Scanner;

import wordle.logic.Game;
import wordle.logic.DictionaryLogic;
import wordle.storage.DictionaryStorage;
import static wordle.representation.ConstantsRepresentation.*;

public class GameRepresentationFacade {
  private final Game game;
  private final List<String> dictionary;
  Scanner scanner = new Scanner(System.in);
  
  public GameRepresentationFacade () {
	DictionaryLogic dictionaryLogic = new DictionaryLogic(new DictionaryStorage());
	this.dictionary = dictionaryLogic.getDictionary();
	this.game = new Game(dictionaryLogic.getRandomWord());
  }
  
  public void startGame() {
	System.out.println(END1);
	
	while(true) {
	  System.out.println(QUANTITY_TRY + game.getAttemptsLeft() + " -> " + game.getSecretWord());
	  System.out.print(ENTER_WORD);
	  String input = scanner.nextLine().trim();
	  System.out.println();
	  Game.GameResult result = game.processGuess(input, dictionary);
	 
	  System.out.println(result.message);
	  if (result.shouldExit) break;
      if (result.isGameWon) {
        System.out.println(WINNER);
        break;
      }
      if (result.attemptsLeft == 0) {
        System.out.println(LOSER + game.getSecretWord() + "\n");
        break;
      } 
	}
  }
}