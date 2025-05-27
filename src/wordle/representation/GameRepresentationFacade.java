package wordle.representation;

import java.util.Scanner;
import java.io.FileNotFoundException;

import wordle.logic.Game;
import wordle.logic.DictionaryLogic;
import wordle.storage.DictionaryStorage;
import static wordle.representation.ConstantsRepresentation.*;

public class GameRepresentationFacade {
  private final Game game;
  private final DictionaryLogic dictionaryLogic;
  Scanner scanner = new Scanner(System.in);
  
  public GameRepresentationFacade() throws FileNotFoundException {
	  dictionaryLogic = new DictionaryLogic(new DictionaryStorage());
	  this.game = new Game(dictionaryLogic.getRandomWord());
  }
  
  public void startGame() {
	System.out.println(END1);
	
	while(true) {
	  System.out.println(QUANTITY_TRY + game.getAttemptsLeft() + " -> Загаданное слово: " + game.getSecretWord());
	  System.out.print(ENTER_WORD);
	  String input = scanner.nextLine().trim();
	  System.out.println();
	  Game.GameResult result = game.processGuess(input, dictionaryLogic);
	 
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