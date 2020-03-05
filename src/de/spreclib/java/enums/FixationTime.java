package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public enum FixationTime implements ISprecPart {
  LESS_THAN_15_MINUTES(new CodePart("A")),
  FIFTEEN_MINUTES_TO_ONE_HOUR(new CodePart("B")),
  ONE_TO_FOUR_HOURS(new CodePart("C")),
  FOUR_TO_EIGHT_HOURS(new CodePart("D")),
  EIGHT_TO_TWENTYFOUR_HOURS(new CodePart("E")),
  TWENTYFOUR_TO_FOURTYEIGHT_HOURS(new CodePart("F")),
  FOURTYEIGHT_TO_SEVENTYTWO_HOURS(new CodePart("G")),
  NOT_APPLICABLE(new CodePart("N")),
  UNKNOWN(new CodePart("X")),
  OTHER(new CodePart("Z")),
  ;

  private ICodePart codePart;

  FixationTime(ICodePart code) {
    this.codePart = code;
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
