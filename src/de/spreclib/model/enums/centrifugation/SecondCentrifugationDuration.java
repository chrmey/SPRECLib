package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationDuration;

public enum SecondCentrifugationDuration implements ICentrifugationDuration, IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15);

  private final int lowerBound;
  private final int upperBound;

  SecondCentrifugationDuration(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
