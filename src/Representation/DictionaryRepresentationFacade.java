package Representation;

import java.util.List;

import Logic.DictionaryLogic;
import Storage.DictionaryStorage;

public class DictionaryRepresentationFacade {
  private final DictionaryLogic dictionaryLogic;
    
  public DictionaryRepresentationFacade() {
    this.dictionaryLogic = new DictionaryLogic(new DictionaryStorage());
  }
    
  public List<String> getDictionary() {
    return dictionaryLogic.getDictionary();
  }
    
  public String getRandomWord() {
    return dictionaryLogic.getRandomWord();
  }
}

