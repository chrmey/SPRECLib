package de.spreclib.model.enums.precentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PreCentrifugationDelay implements IListObject {
  LESS_TWO_HOURS(0, 120),
  TWO_TO_FOUR_HOURS(120, 240),
  FOUR_TO_EIGHT_HOURS(240, 480),
  EIGHT_TO_TWELVE_HOURS(480, 720),
  TWELVE_TO_TWENTYFOUR_HOURS(720, 1440),
  TWENTYFOUR_TO_EIGHTYFOUR_HOURS(1440, 2880),
  GREATER_EIGHTYFOUR_HOURS(2880, null);

  PreCentrifugationDelay(Integer lowerBound, Integer upperBound) {}
}
