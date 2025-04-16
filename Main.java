import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
	static final int MAX_ATTEMPTS = 6;
    static final int WORD_LENGTH = 5;
	static final String ENCODING = "UTF-8";
	static final String FILEPATH = "Dictionary.txt";
	static final String END1 = "exit";

	static final String END0 = "Для выхода введите ";
	static final String RANDOM_WORD = "Ничего страшного. В следующий раз повезёт! Загаданное слово: ";
	static final String QUANTITY_TRY = "Осталось попыток: ";
	static final String USERWORD = "Введите слово: ";
	static final String WINNER = "Вы угадали слово!!!";
	
	static final String ERROR_FILE = "Файл не найден!";
	static final String LIMITSYMBOL = "Слово должно состоять из 5 БУКВ!!!";
	static final String WORDNOTFOUND = "Такого слова в словаре нет, повторите попытку!!!";
	
    public static void main(String[] args) {
	  //Создаем и Запоминаем словарь
	  String filePath = FILEPATH;
      List<String> dictionary = new ArrayList<String>();
	  String randomWord;
	  {
      try {
		Scanner fileScanner = new Scanner(new File(filePath), ENCODING);
        while (fileScanner.hasNextLine()) {
          String word = fileScanner.nextLine().trim();
          if (!word.isEmpty()) {
            dictionary.add(word);
          }
        }
        fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(ERROR_FILE);
            return;
        }
	  }
	  //Выбираем слово 
	  {
	    Random random = new Random();
	    randomWord = dictionary.get(random.nextInt(dictionary.size()));
	  }
		
      //Проверяем
      System.out.println(END0 + " '" + END1 + "'");
	  Scanner inputScanner = new Scanner(System.in);
      int attemptsLeft = MAX_ATTEMPTS;
	  
      while(attemptsLeft >= 0){
	    if (attemptsLeft == 0) { 
	      System.out.println(RANDOM_WORD + randomWord);
		  break;
	    }
		System.out.println();
        System.out.println(QUANTITY_TRY + attemptsLeft);
		System.out.print(USERWORD);
        String userWord = inputScanner.nextLine().trim();
        
		//Выход
        if (userWord.equalsIgnoreCase(END1)) {
          break;
        }
		//Основная проверка
		
		//1. Если слово не из 5 букв
		if(userWord.length() != WORD_LENGTH) {
		  System.out.println(LIMITSYMBOL);
		}
		//Если пользователь ввёл корректное слово
		else if(dictionary.contains(userWord)) {
		  attemptsLeft -= 1; 
		  String result = "";
		  for(int i = 0; i < WORD_LENGTH; i++){
			if (userWord.charAt(i) == randomWord.charAt(i)) { 
			  result += "+ ";
			}
			else if (randomWord.indexOf(userWord.charAt(i)) != -1) { 
			  result += "- ";
			}
			else { 
			  result += ". ";
			}
		  }
		  System.out.println(result);
		  
		  if (result.equals("+ + + + + ")) { 
		    System.out.println(WINNER); 
			break; 
		  }
		}
		//Если пользователь ввёл слово некорректное, или его нет в словаре
        else {
          System.out.println(WORDNOTFOUND);
        }
      }
      inputScanner.close();
    }
}