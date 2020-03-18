package de.spreclib.model.enums.postcentrifugation;

public enum PostCentrifugationDelay {
  LESS_ONE_HOUR(0, 1),
  ONE_TO_TWO_HOURS(1, 2),
  TWO_TO_EIGHT_HOURS(2, 8),
  EIGHT_TO_TWENTYFOUR_HOURS(8, 24),
  GREATER_TWENTYFOUR_HOURS(24, 99999);

  PostCentrifugationDelay(int lowerBound, int upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
