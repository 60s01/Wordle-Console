package Representation;

public class ConsoleView {
    private final RulesService rulesService;

    public ConsoleView(RulesService rulesService) {
        this.rulesService = rulesService;
    }

    public void showRules() {
        System.out.println(rulesService.getRules());
    }
}