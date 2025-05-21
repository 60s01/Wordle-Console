package wordle.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

import static wordle.storage.ConstantsStorage.FILEPATH0;
import static wordle.storage.ConstantsStorage.ENCODING;

public class DictionaryStorage {
  private List<String> dictionary;
  
  public DictionaryStorage() throws FileNotFoundException {
	dictionary = new ArrayList<>();
    try (Scanner fileScanner = new Scanner(new File(FILEPATH0), ENCODING)) {
      while (fileScanner.hasNextLine()) {
        String word = fileScanner.nextLine().trim();
        if (!word.isEmpty()) {
          dictionary.add(word);
        }
      }
    }
  }
  
  public boolean checkUserWord(String userWord) {
    return (dictionary.contains(userWord));
  }
  
  public String getRandomWord() {
    if (dictionary.isEmpty()) {
      return "";
    }
    return dictionary.get(new Random().nextInt(dictionary.size()));
  }
}