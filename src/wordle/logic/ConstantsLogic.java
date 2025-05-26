package wordle.logic;

public class ConstantsLogic{
  //RulesLogic
  public static final String ERROR_FILE_RULES = "Файл с правилами игры не найден!";
  
  //Game
  public static final int MAX_ATTEMPTS = 6;
  public static final int WORD_LENGTH = 5;
  public static final String END0 = "exit";
  public static final String LIMIT_SYMBOL = "Слово должно состоять из " + WORD_LENGTH + " БУКВ!!!";
  public static final String WORD_NOT_FOUND = "Такого слова в словаре нет, повторите попытку!!!";
  public static final String CORRECTLY = "+ ";
  public static final String GOOD = "- ";
  public static final String BAD = ". ";
  public static final String TRUE_RANDOM_WORD = CORRECTLY + CORRECTLY + CORRECTLY + CORRECTLY + CORRECTLY;
  
  
  
  
  
  
}