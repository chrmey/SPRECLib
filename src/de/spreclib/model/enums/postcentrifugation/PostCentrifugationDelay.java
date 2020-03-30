package de.spreclib.model.enums.postcentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PostCentrifugationDelay implements IListObject {
  LESS_ONE_HOUR(0, 60),
  ONE_TO_TWO_HOURS(60, 120),
  TWO_TO_EIGHT_HOURS(120, 480),
  EIGHT_TO_TWENTYFOUR_HOURS(480, 1140),
  GREATER_TWENTYFOUR_HOURS(1140, null);

  PostCentrifugationDelay(Integer lowerBound, Integer upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
