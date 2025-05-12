package wordle.representation;

import java.util.Scanner;
import static wordle.shared.ConstantsRepresentation.*;

public class MainRepresentation{
  public static void start(){
	DictionaryRepresentationFacade dictionaryRepresentationFacade = new DictionaryRepresentationFacade();
    String randomWord = dictionaryRepresentationFacade.getRandomWord();
	System.out.println(BEGIN);
	
	while(true) {
      printMenu();
      String choice = new Scanner(System.in).next();      
      switch (choice) {
        case START_GAME_CHOISE:
          new GameRepresentationFacade().startGame();
          break;
        case WRITE_RULES_CHOISE:
          new RulesRepresentationFacade().showRules();
          break;
        case USER_EXIT_CHOISE:
          return;
        default:
          System.out.println(WRONG_CHOISE);    
      }
    }
  } 
  
  private static void printMenu() {
	for(int i = 0; i < 4; i++) {
	  System.out.print(ACTION[i]);
	}
  }
}