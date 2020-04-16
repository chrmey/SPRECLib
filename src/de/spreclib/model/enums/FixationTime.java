package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum FixationTime implements ISprecPart, IListObject {
  LESS_FIFTEEN_MINUTES(0, 15, new CodePart("A")),
  FIFTEEN_MINUTES_TO_ONE_HOUR(15, 60, new CodePart("B")),
  ONE_TO_FOUR_HOURS(60, 240, new CodePart("C")),
  FOUR_TO_EIGHT_HOURS(240, 480, new CodePart("D")),
  EIGHT_TO_TWENTYFOUR_HOURS(480, 1440, new CodePart("E")),
  TWENTYFOUR_TO_FOURTYEIGHT_HOURS(1440, 2880, new CodePart("F")),
  FOURTYEIGHT_TO_SEVENTYTWO_HOURS(2880, 4320, new CodePart("G")),
  NOT_APPLICABLE(null, null, new CodePart("N")),
  UNKNOWN(null, null, new CodePart("X")),
  OTHER(null, null, new CodePart("Z")),
  ;

  private ICodePart codePart;
  private final Integer lowerBoundMinutes;
  private final Integer upperBoundMinutes;

  private FixationTime(Integer lowerBoundMinutes, Integer upperBoundMinutes, ICodePart code) {
    this.lowerBoundMinutes = lowerBoundMinutes;
    this.upperBoundMinutes = upperBoundMinutes;
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }


  public boolean hasValueFor(int durationMinutes) {

    if (this.lowerBoundMinutes == null && this.upperBoundMinutes == null) {
      return false;
    }

    if (durationMinutes >= this.lowerBoundMinutes && durationMinutes < this.upperBoundMinutes) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean contains(FixationTime fixationTime) {

    if (fixationTime == null) {
      return false;
    }

    for (FixationTime listEntry : FixationTime.values()) {
      if (fixationTime.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
