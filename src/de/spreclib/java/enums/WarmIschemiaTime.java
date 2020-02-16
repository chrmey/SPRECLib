package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum WarmIschemiaTime implements ISprecPart, ICodePart {
  LESS_TWO_MINUTES("A"),
  TWO_TO_TEN_MINUTES("B"),
  TEN_TO_TWENTY_MINUTES("C"),
  TWENTY_TO_THIRTY_MINUTES("D"),
  THIRTY_TO_SIXTY_MINUTES("E"),
  GREATER_SIXTY_MINUTES("F"),
  UNKNOWN("X"),
  NOT_APPLICABLE("N"),
  OTHER("Z");

  private String codePart;

  WarmIschemiaTime(String code) {
    this.codePart = code;
  }

  @Override
  public String getCodePart() {
    return this.codePart;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.WARM_ISCHEMIA_TIME;
  }
}
