package de.spreclib.model.enums.precentrifugation;

import de.spreclib.model.exceptions.InvalidTemperatureValueException;
import de.spreclib.model.interfaces.IListObject;

public enum PreCentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  THIRTYFIVE_TO_THIRTYEIGHT_DEGREES(35, 38);

  private final float lowerBoundCelsius;
  private final float upperBoundCelsius;

  private PreCentrifugationTemperature(float lowerBoundCelsius, float upperBoundCelsius) {
    this.lowerBoundCelsius = lowerBoundCelsius;
    this.upperBoundCelsius = upperBoundCelsius;
  }

  public static PreCentrifugationTemperature valueOf(float temperatureCelsius) {

    for (PreCentrifugationTemperature temperatureEnum : PreCentrifugationTemperature.values()) {
      if (temperatureCelsius >= temperatureEnum.lowerBoundCelsius
          && temperatureCelsius < temperatureEnum.upperBoundCelsius + 1) {
        return temperatureEnum;
      }
    }

    throw new InvalidTemperatureValueException(
        temperatureCelsius,
        "Temperature value "
            + temperatureCelsius
            + " is no valid value for parameter PreCentrifugationTemperature.");
  }
}
