package de.spreclib.model.enums.postcentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PostCentrifugationDelay implements IListObject {
  LESS_ONE_HOUR(0, 60),
  ONE_TO_TWO_HOURS(60, 120),
  TWO_TO_EIGHT_HOURS(120, 480),
  EIGHT_TO_TWENTYFOUR_HOURS(480, 1140),
  GREATER_TWENTYFOUR_HOURS(1140, null);

  private final Integer lowerBoundMinutes;
  private final Integer upperBoundMinutes;

  PostCentrifugationDelay(Integer lowerBound, Integer upperBound) {
    this.lowerBoundMinutes = lowerBound;
    this.upperBoundMinutes = upperBound;
  }

  public boolean hasValueFor(int delayMinutes) {

    if (delayMinutes >= this.lowerBoundMinutes && delayMinutes <= this.upperBoundMinutes) {
      return true;
    } else {
      return false;
    }
  }
}
