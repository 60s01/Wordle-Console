package wordle.representation;

public class ConstantsRepresentation {
  //StartMenuRepresentation
  public static final String BEGIN = "Добро пожаловать в WORDLE";
  public static final String[] ACTION = { "\n1 : Начать новую игру\n", "2 : Прочитать правила игры\n", "3 : Выйти из программы\n", "\nВведите число для выбора действия: " };
  public static final String CHOISE_START_GAME = "1";
  public static final String CHOISE_WRITE_RULES = "2";
  public static final String CHOISE_USER_EXIT = "3";
  public static final String CHOISE_WRONG = "\nДля выбора действия введите число!!! Например: '1'";
  
  //GameRepresentationFacade
  public static final String END0 = "exit";
  public static final String END1 = "\nДля выхода введите: " + END0;
  public static final String QUANTITY_TRY = "\nПопыток осталось: ";
  public static final String ENTER_WORD = "Введите слово: ";
  public static final String WINNER = "\nВЫ ВЫЙГРАЛИ!!!";
  public static final String LOSER = "\nНичего страшного. В следующий раз всё получится! Загаданное слово: ";
  
  
  
  public static final String END = "Выход из программы...";
}