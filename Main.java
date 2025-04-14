import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
		
      private static final int MAX_ATTEMPTS = 6;
      private static final int WORD_LENGTH = 5;
		
	  String filePath = "Dictionary.txt";
        
      //Создаем
	  List<String> dictionary = new ArrayList<String>();
	  String randomWord;
      // Запоминаем словарь
	  {
      try {
		Scanner fileScanner = new Scanner(new File(filePath), "UTF-8");
        while (fileScanner.hasNextLine()) {
          String word = fileScanner.nextLine().trim();
          if (!word.isEmpty()) {
            dictionary.add(word);
          }
        }
        fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            return;
        }
	  }
		
	  //Выбираем слово 
	  {
	    Random random = new Random();
	    randomWord = dictionary.get(random.nextInt(dictionary.size()));
	    System.out.println("Случайное слово: " + randomWord);
	  }
		
      //Проверяем
      System.out.println("Введите 'exit' для выхода.");
	  Scanner inputScanner = new Scanner(System.in);
        
      for(int i = MAX_ATTEMPTS; i > 0; i--){
		System.out.println();
        System.out.println("Попытка: " + i);
		System.out.print("Введите слово: ");
        String userWord = inputScanner.nextLine().trim();
        
		//Выход
        if (userWord.equalsIgnoreCase("exit")) {
          break;
        }
		//Проверка длины слова
		if(userWord.lenght() != WORD_LENGTH) {
		  System.out.println("Слово должно состоять из 5 БУКВ!!!");
		  i++;
		} else //продолжить блок 
		
        if (dictionary.contains(userWord)) {
		  if(userWord.equalsIgnoreCase(randomWord)){
			System.out.println("Вы угадали слово!!!");
			break;
		  }    	
        }
		else {
          System.out.println("Такого слова в словаре нет, повторите попытку!!!");
		  i++;
        }
      }
      inputScanner.close();
    }
}