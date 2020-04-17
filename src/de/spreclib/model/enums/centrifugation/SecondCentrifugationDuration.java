package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.centrifugation.ICentrifugationDuration;
import de.spreclib.model.interfaces.IListObject;

public enum SecondCentrifugationDuration implements ICentrifugationDuration, IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15);

  private final int lowerBoundMinutes;
  private final int upperBoundMinutes;

  SecondCentrifugationDuration(int lowerBound, int upperBound) {
    this.lowerBoundMinutes = lowerBound;
    this.upperBoundMinutes = upperBound;
  }

  public boolean hasValue(int durationMinutes) {
    if (durationMinutes >= this.lowerBoundMinutes && durationMinutes <= this.upperBoundMinutes) {
      return true;
    } else {
      return false;
    }
  }
}
