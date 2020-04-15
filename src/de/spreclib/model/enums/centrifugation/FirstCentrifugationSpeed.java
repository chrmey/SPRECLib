package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.centrifugation.ICentrifugationSpeed;
import de.spreclib.model.interfaces.IListObject;

public enum FirstCentrifugationSpeed implements ICentrifugationSpeed, IListObject {
  LESS_THOUSAND_G(0, 1000),
  LESS_THREETHOUSAND_G(0, 3000),
  THREETHOUSAND_TO_SIXTHOUSAND_G(3000, 6000),
  SIXTHOUSAND_TO_TENTHOUSAND_G(6000, 10000),
  GREATER_TENTHOUSAND_G(10000, null);

  private final Integer lowerBoundG;
  private final Integer upperBoundG;

  private FirstCentrifugationSpeed(Integer lowerBoundG, Integer upperBoundG) {
    this.lowerBoundG = lowerBoundG;
    this.upperBoundG = upperBoundG;
  }

  public boolean hasValueFor(int speed) {
    if (speed >= this.lowerBoundG && speed < this.upperBoundG) {
      return true;
    } else {
      return false;
    }
  }
}
