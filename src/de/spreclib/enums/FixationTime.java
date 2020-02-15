package de.spreclib.enums;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public enum FixationTime implements ISprecPart, ICodePart {
  LESS_THAN_15_MINUTES("A"),
  FIFTEEN_MINUTES_TO_ONE_HOUR("B"),
  ONE_TO_FOUR_HOURS("C"),
  FOUR_TO_EIGHT_HOURS("D"),
  EIGHT_TO_TWENTYFOUR_HOURS("E"),
  TWENTYFOUR_TO_FOURTYEIGHT_HOURS("F"),
  FOURTYEIGHT_TO_SEVENTYTWO_HOURS("G"),
  NOT_APPLICABLE("N"),
  UNKNOWN("X"),
  OTHER("Z");

  private String codePart;

  FixationTime(String code) {
    this.codePart = code;
  }

  @Override
  public String getCodePart() {
    return this.codePart;
  }

  @Override
  public ISprecPart getSprecPart() { // TODO Auto-generated method stub
    return null;
  }
}
