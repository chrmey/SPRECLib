package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;

public enum WarmIschemiaTime implements ISprecPart {
  LESS_TWO_MINUTES(new CodePart("A")),
  TWO_TO_TEN_MINUTES(new CodePart("B")),
  TEN_TO_TWENTY_MINUTES(new CodePart("C")),
  TWENTY_TO_THIRTY_MINUTES(new CodePart("D")),
  THIRTY_TO_SIXTY_MINUTES(new CodePart("E")),
  GREATER_SIXTY_MINUTES(new CodePart("F")),
  UNKNOWN(new CodePart("X")),
  NOT_APPLICABLE(new CodePart("N")),
  OTHER(new CodePart("Z")),
  ;

  private ICodePart codePart;

  WarmIschemiaTime(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.WARM_ISCHEMIA_TIME;
  }
}
