package Representation;

import Logic.MainGame;
import Logic.DictionaryLogic;
import Storage.DictionaryStorage;

import java.util.List;
import java.util.Scanner;

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
	System.out.println("\nДля выхода введите 'exit'");
	
	while(true) {
	  System.out.println("\nПопыток осталось: " + mainGame.getAttemptsLeft() + " " + mainGame.getRandomWord());
	  System.out.print("Введите слово: ");
	  String input = scanner.nextLine().trim();
	  System.out.println();
	  MainGame.GameResult result = mainGame.processGuess(input, dictionary);
	  
	  System.out.println(result.message);
	  if (result.shouldExit) break;
      if (result.isGameWon) {
        System.out.println("\nВЫ ВЫЙГРАЛИ!!!");
        break;
      }
      if (result.attemptsLeft == 0) {
        System.out.println("\nСЛУЧАЙНОЕ СЛОВО: " + mainGame.getRandomWord() + "\n");
        break;
      }
	}
  }
  
}