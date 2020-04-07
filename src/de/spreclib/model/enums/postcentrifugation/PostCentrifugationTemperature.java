package de.spreclib.model.enums.postcentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PostCentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  private final float lowerBound;
  private final float upperBound;

  PostCentrifugationTemperature(float lowerBound, float upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }
}
