package wordle.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static wordle.shared.ConstantsStorage.FILEPATH0;
import static wordle.shared.ConstantsStorage.ENCODING;

public class DictionaryStorage {
  public List<String> loadDictionary() throws FileNotFoundException {
    List<String> dictionary = new ArrayList<>();
      try (Scanner fileScanner = new Scanner(new File(FILEPATH0), ENCODING)) {
        while (fileScanner.hasNextLine()) {
          String word = fileScanner.nextLine().trim();
          if (!word.isEmpty()) {
            dictionary.add(word);
          }
        }
      }
	  return dictionary;
    }
}