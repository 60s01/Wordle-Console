package Logic;

import Storage.RulesStorage;
import java.io.IOException;
import static Shared.ConstantsLogic.ERROR_FILE_RULES;

public class RulesLogic {
  private final RulesStorage rulesStorage;

  public RulesLogic(RulesStorage rulesStorage) {
    this.rulesStorage = rulesStorage;
  }

  public String getRules() {
    try {
      return rulesStorage.loadRules();
    } catch (IOException e) {
      return ERROR_FILE_RULES;
    }
  }
}