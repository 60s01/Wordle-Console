package wordle.representation;

import java.util.Scanner;
import static wordle.shared.ConstantsRepresentation.*;

public class StartMenuRepresentation{
  public static void start(){
	Scanner sc = new Scanner(System.in);
	System.out.println(BEGIN);
	
	while(true) {
      printMenu();
      String choice = sc.next();
      switch (choice) {
        case CHOISE_START_GAME:
          new GameRepresentationFacade().startGame();
          break;
        case CHOISE_WRITE_RULES:
          new RulesRepresentationFacade().showRules();
          break;
        case CHOISE_USER_EXIT:
		  sc.close();
          return;
        default:
          System.out.println(CHOISE_WRONG);
      }
    }
  }
  
  private static void printMenu() {
	for(int i = 0; i < 4; i++) {
	  System.out.print(ACTION[i]);
	}
  }
}