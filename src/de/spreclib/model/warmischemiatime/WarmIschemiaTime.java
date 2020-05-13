package de.spreclib.model.warmischemiatime;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum WarmIschemiaTime implements ISprecPart, IListProvideable {
  LESS_TWO_MINUTES(0, 2, new CodePart("A")),
  TWO_TO_TEN_MINUTES(2, 10, new CodePart("B")),
  TEN_TO_TWENTY_MINUTES(10, 20, new CodePart("C")),
  TWENTY_TO_THIRTY_MINUTES(20, 30, new CodePart("D")),
  THIRTY_TO_SIXTY_MINUTES(30, 60, new CodePart("E")),
  GREATER_SIXTY_MINUTES(60, null, new CodePart("F")),
  UNKNOWN(null, null, new CodePart("X")),
  NOT_APPLICABLE(null, null, new CodePart("N")),
  OTHER(null, null, new CodePart("Z")),
  ;

  private final Integer lowerBoundMinutes;
  private final Integer upperBoundMinutes;
  private final ICodePart codePart;

  private WarmIschemiaTime(Integer lowerBoundMinutes, Integer upperBoundMinutes, ICodePart code) {
    this.codePart = code;
    this.lowerBoundMinutes = lowerBoundMinutes;
    this.upperBoundMinutes = upperBoundMinutes;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  public boolean hasValue(long durationMinutes) {

    if (this.lowerBoundMinutes == null && this.upperBoundMinutes == null) {
      return false;
    }

    if (durationMinutes >= this.lowerBoundMinutes
        && (this.upperBoundMinutes == null || durationMinutes < this.upperBoundMinutes)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean contains(WarmIschemiaTime warmIschemiaTime) {

    if (warmIschemiaTime == null) {
      return false;
    }

    for (WarmIschemiaTime listEntry : WarmIschemiaTime.values()) {
      if (warmIschemiaTime.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
