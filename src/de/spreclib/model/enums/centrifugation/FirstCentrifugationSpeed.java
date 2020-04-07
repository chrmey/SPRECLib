package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationSpeed;

public enum FirstCentrifugationSpeed implements ICentrifugationSpeed, IListObject {
  LESS_THREETHOUSAND_G(0, 3000),
  THREETHOUSAND_TO_SIXTHOUSAND_G(3000, 6000),
  SIXTHOUSAND_TO_TENTHOUSAND_G(6000, 10000),
  GREATER_TENTHOUSAND_G(10000, 99999),
  LESS_THOUSAND_G(0, 1000);

  private final int lowerBound;
  private final int upperBound;

  private FirstCentrifugationSpeed(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
