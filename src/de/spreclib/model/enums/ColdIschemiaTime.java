package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum ColdIschemiaTime implements ISprecPart, IListObject {
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

  private final ICodePart codePart;
  private final Integer lowerBoundMinutes;
  private final Integer upperBoundMinutes;

  private ColdIschemiaTime(Integer lowerBoundMinutes, Integer upperBoundMinutes, ICodePart code) {
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

    if (durationMinutes >= this.lowerBoundMinutes
        && (this.upperBoundMinutes == null || durationMinutes < this.upperBoundMinutes)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean contains(ColdIschemiaTime coldIschemiaTime) {

    if (coldIschemiaTime == null) {
      return false;
    }

    for (ColdIschemiaTime listEntry : ColdIschemiaTime.values()) {
      if (coldIschemiaTime.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
