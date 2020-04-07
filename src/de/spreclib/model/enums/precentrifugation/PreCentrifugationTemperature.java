package de.spreclib.model.enums.precentrifugation;

import de.spreclib.model.exceptions.InvalidValueException;
import de.spreclib.model.interfaces.IListObject;

public enum PreCentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  THIRTYFIVE_TO_THIRTYEIGHT_DEGREES(35, 38);

  private final float lowerBound;
  private final float upperBound;

  private PreCentrifugationTemperature(float lowerBound, float upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  public static PreCentrifugationTemperature valueOf(float temperatureCelsius) {

    for (PreCentrifugationTemperature temperatureEnum : PreCentrifugationTemperature.values()) {
      if (temperatureCelsius >= temperatureEnum.lowerBound
          && temperatureCelsius < temperatureEnum.upperBound + 1) {
        return temperatureEnum;
      }
    }

    throw new InvalidValueException(
        "Temperature value "
            + temperatureCelsius
            + " is no valid value for parameter PreCentrifugationTemperature.");
  }
}
