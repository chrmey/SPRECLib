package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationSpeed;

public enum SecondCentrifugationSpeed implements ICentrifugationSpeed, IListObject {
  LESS_THREETHOUSAND_G(0, 3000),
  THREETHOUSAND_TO_SIXTHOUSAND_G(3000, 6000),
  SIXTHOUSAND_TO_TENTHOUSAND_G(6000, 10000),
  GREATER_TENTHOUSAND_G(10000, 99999),
  ;

  private final int lowerBound;
  private final int upperBound;

  SecondCentrifugationSpeed(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
