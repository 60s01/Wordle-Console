import java.util.Scanner;

class Main{
  final static String InputChar = "Введите слово: ";
  final static String End = "Завершение программмы...";
  
  public static void main(String[] args){	
	Scanner scanner = new Scanner(System.in);
	String str = "";
	
	do {
	  p(InputChar);
	  str = scanner.nextLine();
	  pln(""); 
	} while(str.equals("exit") == false);
	p(End);
  }
  
  static void p(String str){
	System.out.print(str);
  }
  
  static void pln(String str){
	System.out.println(str);
  }
}