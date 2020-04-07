package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationTemperature;

public enum FirstCentrifugationTemperature implements ICentrifugationTemperature, IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  private final float lowerBound;
  private final float upperBound;

  FirstCentrifugationTemperature(float lowerBound, float upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
