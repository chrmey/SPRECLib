package de.spreclib.model.fixationtime;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecFactor;
import de.spreclib.model.sprec.CodePart;

public enum FixationTime implements ISprecFactor, IListProvideable {
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
  public ICodePart getCodeFromSprecFactor() {
    return this.codePart;
  }

  public boolean hasValue(long durationMinutes) {

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
