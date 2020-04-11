package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationDuration;

public enum FirstCentrifugationDuration implements ICentrifugationDuration, IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15),
  THIRY_MINUTES(30, 30);

  private final int lowerBoundMinutes;
  private final int upperBoundMinutes;

  private FirstCentrifugationDuration(int lowerBoundMinutes, int upperBoundMinutes) {
    this.lowerBoundMinutes = lowerBoundMinutes;
    this.upperBoundMinutes = upperBoundMinutes;
  }

  public boolean hasValueFor(int durationMinutes) {
    if (durationMinutes >= this.lowerBoundMinutes && durationMinutes <= this.upperBoundMinutes) {
      return true;
    } else {
      return false;
    }
  }
}
