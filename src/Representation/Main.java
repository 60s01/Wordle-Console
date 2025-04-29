package Representation;

import java.util.Scanner;
import static Shared.ConstantsRepresentation.*;

public class Main{
  public static void start(){
	DictionaryRepresentationFacade dictionaryRepresentationFacade = new DictionaryRepresentationFacade();
    String randomWord = dictionaryRepresentationFacade.getRandomWord();
	
	while (true) {
      printMenu();
      String choice = new Scanner(System.in).nextLine();
            
      switch (choice) {
        case "1":
          new GameRepresentationFacade().startGame();
          break;
        case "2":
          new RulesRepresentationFacade().showRules();
          break;
        case "3":
          return;
        default:
          System.out.println("Неверный ввод");
        }
    }
  } 
  
  private static void printMenu() {
	System.out.println("\n" + BEGIN);
    System.out.println("1. Начать игру");
    System.out.println("2. Показать правила");
    System.out.println("3. Выход");
    System.out.print("\nВыберите действие: ");
  }
}