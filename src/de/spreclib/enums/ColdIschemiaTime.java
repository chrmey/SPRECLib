package de.spreclib.enums;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public enum ColdIschemiaTime implements ISprecPart, ICodePart {
  LESS_THAN_TWO_MINUTES("A"),
  TWO_TO_TEN_MINUTES("B"),
  TEN_TO_TWENTY_MINUTES("C"),
  TWENTY_TO_THIRTY_MINUTES("D"),
  THIRTY_TO_SIXTY_MINUTES("E"),
  MORE_THAN_SIXTY_MINUTES("F"),
  UNKNOWN("X"),
  NOT_APPLICABLE("N"),
  OTHER("Z");

  private String codePart;
  private String sprecType;

  ColdIschemiaTime(String code) {
    this.codePart = code;
    this.sprecType = "Cold Ischemia Time";
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
}
