package wordle.logic;

import java.io.FileNotFoundException;
import java.util.List;

import wordle.storage.DictionaryStorage;

public class DictionaryLogic {
  private final DictionaryStorage dictionaryStorage;
  
  public DictionaryLogic(DictionaryStorage dictionaryStorage) throws FileNotFoundException {
	  this.dictionaryStorage = dictionaryStorage;
  }
  
  public String getRandomWord() {
	return dictionaryStorage.getRandomWord();
  }

  public boolean check(String userWord) {
    return dictionaryStorage.checkUserWord(userWord);
  }   
}  