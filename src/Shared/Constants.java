package Shared;

public class Constants{
  //РАЗБИТЬ НА 3 ФАЙЛА в соответствии с слоями
  //Представление  
  public static final String END0 = "Для выхода введите ";
  public static final String RANDOM_WORD = "Ничего страшного. В следующий раз всё получится! Загаданное слово: ";
  public static final String QUANTITY_TRY = "Осталось попыток: ";
  public static final String USERWORD = "Введите слово: ";
  public static final String WINNER = "Вы угадали слово!!!";
  public static final String BEGIN = "Добро пожаловать в WORDLE";
  public static final String CHOICE = "Введите число для выбора действия";
  public static final String[] ACTION = { 
  "1 : Начать новую игру",
  "2 : Прочитать правила игры",
  "3 : Выйти из программы"
  };
  public static final String END = "Выход из программы...";
  public static final String LIMITSYMBOL = "Слово должно состоять из 5 БУКВ!!!";
  public static final String WORDNOTFOUND = "Такого слова в словаре нет, повторите попытку!!!";
  
  //логика
  public static final String ERROR_FILE = "Файл не найден!";
  public static final int MAX_ATTEMPTS = 6;
  public static final int WORD_LENGTH = 5;
  
  //Хранение
  public static final String ENCODING = "UTF-8";
  public static final String FILEPATH0 = "Dictionary.txt";
  public static final String FILEPATH1 = "Rules.txt";
  
  //Общие
  public static final String END1 = "exit";

}

