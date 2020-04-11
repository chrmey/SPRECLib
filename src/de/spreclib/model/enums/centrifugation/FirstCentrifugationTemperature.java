package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationTemperature;

public enum FirstCentrifugationTemperature implements ICentrifugationTemperature, IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  private final float lowerBoundCelsius;
  private final float upperBoundCelsius;

  FirstCentrifugationTemperature(float lowerBoundCelsius, float upperBoundCelsius) {
    this.lowerBoundCelsius = lowerBoundCelsius;
    this.upperBoundCelsius = upperBoundCelsius;
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
