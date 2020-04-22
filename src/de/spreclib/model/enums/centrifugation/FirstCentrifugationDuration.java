package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListProvideable;

public enum FirstCentrifugationDuration implements ICentrifugationDuration, IListProvideable {
  TEN_TO_FIFTEEN_MINUTES(10, 15),
  THIRTY_MINUTES(30, 30);

  private final int lowerBoundMinutes;
  private final int upperBoundMinutes;

  private FirstCentrifugationDuration(int lowerBoundMinutes, int upperBoundMinutes) {
    this.lowerBoundMinutes = lowerBoundMinutes;
    this.upperBoundMinutes = upperBoundMinutes;
  }

  public boolean hasValue(int durationMinutes) {
    if (durationMinutes >= this.lowerBoundMinutes && durationMinutes <= this.upperBoundMinutes) {
      return true;
    } else {
      return false;
    }
  }
}
