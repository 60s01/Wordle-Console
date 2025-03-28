import java.util.Scanner;

class Main{
  final static String InputChar = "Введите слово: ";
  final static String End = "Завершение программмы...";
  final static String EndWhile = "exit";
  final static String Limit = "Слово состоит не из 5 букв";
  
  
  public static void main(String[] args){	
	Scanner scanner = new Scanner(System.in);
	String str = "";
	
	do {
	  p(InputChar);
	  str = scanner.nextLine();
	  if(str.length() != 5) {
		pln(Limit); 
		break;
	  }
	  pln(""); 
	} while(str.equals(EndWhile) == false);
	pln(End);
  }
  
  static void p(String str){
	System.out.print(str);
  }
  
  static void pln(String str){
	System.out.println(str);
  }
}