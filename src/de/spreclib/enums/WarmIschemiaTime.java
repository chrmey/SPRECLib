package de.spreclib.enums;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public enum WarmIschemiaTime implements ISprecPart, ICodePart {
  LESS_THAN_TWO_MINUTES("A"),
  TWO_TO_TEN_MINUTES("B"),
  TEN_TO_TWENTY_MINUTES("C"),
  TWENTY_TO_THIRTY_MINUTES("D"),
  THIRTY_TO_SIXTY_MINUTES("E"),
  MORE_THAN_SIXTY_MINUTES("F"),
  UNKNOWN("X"),
  NOT_APPLICABLE("N"),
  OTHER("Z");

  WarmIschemiaTime(String string) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public String getCodePart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }
}
