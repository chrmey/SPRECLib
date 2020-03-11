package de.spreclib.java.enums.precentrifugation;

public enum PreCentrifugationDelay {
  LESS_TWO_HOURS(0, 2),
  TWO_TO_FOUR_HOURS(2, 4),
  FOUR_TO_EIGHT_HOURS(4, 8),
  EIGHT_TO_TWELVE_HOURS(8, 12),
  TWELVE_TO_TWENTYFOUR_HOURS(12, 24),
  TWENTYFOUR_TO_EIGHTYFOUR_HOURS(24, 48),
  GREATER_EIGHTYFOUR_HOURS(48, 99999);

  PreCentrifugationDelay(int lowerBound, int upperBound) {
    // TODO Bounds überarbeiten
  }
}
