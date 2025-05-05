package wordle.representation;

import wordle.logic.RulesLogic;

public class RulesRepresentation {
  private final RulesLogic rulesLogic;

  public RulesRepresentation(RulesLogic rulesLogic) {
    this.rulesLogic = rulesLogic;
  }

  public void showRules() {
    System.out.println("\n" + rulesLogic.getRules());
  }
}