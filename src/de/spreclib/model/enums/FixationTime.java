package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;

public enum FixationTime implements ISprecPart {
  LESS_THAN_15_MINUTES(0, 15, new CodePart("A")),
  FIFTEEN_MINUTES_TO_ONE_HOUR(15, 60, new CodePart("B")),
  ONE_TO_FOUR_HOURS(60, 240, new CodePart("C")),
  FOUR_TO_EIGHT_HOURS(240, 480, new CodePart("D")),
  EIGHT_TO_TWENTYFOUR_HOURS(480, 1440, new CodePart("E")),
  TWENTYFOUR_TO_FOURTYEIGHT_HOURS(1440, 2880, new CodePart("F")),
  FOURTYEIGHT_TO_SEVENTYTWO_HOURS(2880, 4320, new CodePart("G")),
  NOT_APPLICABLE(new CodePart("N")),
  UNKNOWN(new CodePart("X")),
  OTHER(new CodePart("Z")),
  ;

  private ICodePart codePart;

  FixationTime(ICodePart code) {
    this.codePart = code;
  }

  FixationTime(int lowerBound, int upperBound, ICodePart code) {
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
