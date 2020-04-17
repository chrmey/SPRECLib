package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.centrifugation.ICentrifugationSpeed;
import de.spreclib.model.interfaces.IListObject;

public enum SecondCentrifugationSpeed implements ICentrifugationSpeed, IListObject {
  LESS_THREETHOUSAND_G(0, 3000),
  THREETHOUSAND_TO_SIXTHOUSAND_G(3000, 6000),
  SIXTHOUSAND_TO_TENTHOUSAND_G(6000, 10000),
  GREATER_TENTHOUSAND_G(10000, null);

  private final Integer lowerBoundG;
  private final Integer upperBoundG;

  SecondCentrifugationSpeed(Integer lowerBound, Integer upperBound) {
    this.lowerBoundG = lowerBound;
    this.upperBoundG = upperBound;
  }

  public boolean hasValue(int speed) {
    if (speed >= this.lowerBoundG && (this.upperBoundG == null || speed < this.upperBoundG)) {
      return true;
    } else {
      return false;
    }
  }
}
