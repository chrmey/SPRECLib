package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public enum ColdIschemiaTime implements ISprecPart {
  LESS_THAN_TWO_MINUTES(new CodePart("A")),
  TWO_TO_TEN_MINUTES(new CodePart("B")),
  TEN_TO_TWENTY_MINUTES(new CodePart("C")),
  TWENTY_TO_THIRTY_MINUTES(new CodePart("D")),
  THIRTY_TO_SIXTY_MINUTES(new CodePart("E")),
  MORE_THAN_SIXTY_MINUTES(new CodePart("F")),
  UNKNOWN(new CodePart("X")),
  NOT_APPLICABLE(new CodePart("N")),
  OTHER(new CodePart("Z")),
  ;

  private ICodePart codePart;

  ColdIschemiaTime(ICodePart code) {
    this.codePart = code;
  }


  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.COLD_ISCHEMIA_TIME;
  }
}
