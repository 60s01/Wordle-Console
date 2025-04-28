package Logic;

public class RulesService {
  private final RulesRepository rulesRepository;

  public RulesService(RulesRepository rulesRepository) {
    this.rulesRepository = rulesRepository;
  }

  public String getRules() {
    try {
      return rulesRepository.loadRules();
    } catch (IOException e) {
      return "Правила не найдены. Обратитесь к администратору.";
    }
  }
}