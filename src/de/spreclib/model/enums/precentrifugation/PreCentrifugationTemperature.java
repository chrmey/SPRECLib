package de.spreclib.model.enums.precentrifugation;

import de.spreclib.model.interfaces.IListProvideable;

public enum PreCentrifugationTemperature implements IListProvideable {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  THIRTYFIVE_TO_THIRTYEIGHT_DEGREES(35, 38);

  private final float lowerBoundCelsius;
  private final float upperBoundCelsius;

  private PreCentrifugationTemperature(float lowerBoundCelsius, float upperBoundCelsius) {
    this.lowerBoundCelsius = lowerBoundCelsius;
    this.upperBoundCelsius = upperBoundCelsius;
  }

  // Namig ungünstig
  public boolean hasValue(float temperatureCelsius) {

    if (temperatureCelsius >= this.lowerBoundCelsius
        && temperatureCelsius < this.upperBoundCelsius + 1) {
      return true;
    } else {
      return false;
    }
  }
}
