package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

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
  public ICodePart getCodePart() {
    return this;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIXATION_TIME;
  }
}
