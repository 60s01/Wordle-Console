package wordle.representation;

import java.util.List;
import java.util.Scanner;

import wordle.logic.MainGame;
import wordle.logic.DictionaryLogic;
import wordle.storage.DictionaryStorage;
import static wordle.shared.ConstantsRepresentation.*;

public class GameRepresentationFacade {
  private final MainGame mainGame;
  private final List<String> dictionary;
  
  public GameRepresentationFacade () {
	DictionaryLogic dictionaryLogic = new DictionaryLogic(new DictionaryStorage());
	this.dictionary = dictionaryLogic.getDictionary();
	this.mainGame = new MainGame(dictionaryLogic.getRandomWord());
  }
  
  public void startGame() {
	Scanner scanner = new Scanner(System.in);
	System.out.println(END1);
	
	while(true) {
	  System.out.println(QUANTITY_TRY + mainGame.getAttemptsLeft() + " " + mainGame.getRandomWord());
	  System.out.print(ENTER_WORD);
	  String input = scanner.nextLine().trim();
	  System.out.println();
	  MainGame.GameResult result = mainGame.processGuess(input, dictionary);
	  
	  System.out.println(result.message);
	  if (result.shouldExit) break;
      if (result.isGameWon) {
        System.out.println(WINNER);
        break;
      }
      if (result.attemptsLeft == 0) {
        System.out.println(LOSER + mainGame.getRandomWord() + "\n");
        break;
      }
	}
  }
  
}