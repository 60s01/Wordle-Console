import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "Dictionary.txt";
        
        //Создаем
		List<String> dictionary = new ArrayList<>();
        
        // Запоминаем
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

        //Проверяем
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите 'exit' для выхода.");
        
        while (true) {
            System.out.print("Введите слово: ");
            String userWord = inputScanner.nextLine().trim();
            
            if (userWord.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (dictionary.contains(userWord)) {
				System.out.println("Слово найдено :)");
            } else {
				System.out.println(userWord);
                System.out.println("Слово не найдено :(");
            }
        }
        inputScanner.close();
        System.out.println("Сворачиваемся.");
    }
}