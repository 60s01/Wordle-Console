package Representation;

import java.util.Scanner;
import static Shared.Constants.*;
import static Representation.RulesRepresentation.*;

public class Main{
  public static void start(){
	System.out.println(BEGIN);
	boolean infinity = true;
	do{
	  choiseAction();
	  infinity = userChoise(infinity);
	}while(infinity);
  }
  
  static boolean userChoise(boolean infinity){
	Scanner scanner = new Scanner(System.in);
	String userActions = scanner.nextLine();
	switch(userActions){
	  case "1": 
	    
		break;
	  case "2": 
	    ();
		break;
	  case "3": 
	    System.out.println(END);
	    infinity = false;
		break;
	  default :
	    System.out.println("!!!");
	}
	System.out.println();
	return infinity;
  }
  
  static void choiseAction(){
    System.out.println(CHOICE + ": ");
	for(int i = 0; i < 3; i++){
	  System.out.println(ACTION[i]);
	}
	System.out.println();
  }
}