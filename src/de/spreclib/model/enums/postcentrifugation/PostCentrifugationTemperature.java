package de.spreclib.model.enums.postcentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PostCentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  private final float lowerBoundCelsius;
  private final float upperBoundCelsius;

  PostCentrifugationTemperature(float lowerBound, float upperBound) {
    this.lowerBoundCelsius = lowerBound;
    this.upperBoundCelsius = upperBound;
  }

  public boolean hasValueFor(float temperatureCelsius) {

    if (temperatureCelsius >= this.lowerBoundCelsius
        && temperatureCelsius < this.upperBoundCelsius + 1) {
      return true;
    } else {
      return false;
    }
  }
}
