package Logic;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

import Storage.DictionaryStorage;

import static Shared.ConstantsLogic.ERROR_FILE_DICTIONARY;

public class DictionaryLogic {
  private final DictionaryStorage dictionaryStorage;
  
  public DictionaryLogic(DictionaryStorage dictionaryStorage) {
	this.dictionaryStorage = dictionaryStorage;
  }
  
  public List<String> getDictionary() {
    try {
      return dictionaryStorage.loadDictionary();
    } 
	catch (FileNotFoundException e) {
	  System.out.println(ERROR_FILE_DICTIONARY);
	  return List.of();
    }
  }
  
  public String getRandomWord() {
    List<String> dictionary = getDictionary();
    if (dictionary.isEmpty()) {
      return "";
    }
    return dictionary.get(new Random().nextInt(dictionary.size()));
  }
}  