package Representation;

import Logic.RulesLogic;
import Storage.RulesStorage;

public final class RulesRepresentationFacade {
  private final RulesRepresentation rulesRepresentation;
  
  public RulesRepresentationFacade(){
	this.rulesRepresentation = new RulesRepresentation(new RulesLogic(new RulesStorage()));
  }
  
  public void showRules() {
    rulesRepresentation.showRules();
  }
}