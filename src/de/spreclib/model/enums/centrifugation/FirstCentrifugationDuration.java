package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationDuration;

public enum FirstCentrifugationDuration implements ICentrifugationDuration, IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15),
  THIRY_MINUTES(30, 30);

  private final int lowerBound;
  private final int upperBound;

  private FirstCentrifugationDuration(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
