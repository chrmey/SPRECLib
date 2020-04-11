package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import java.util.ArrayList;

public final class SecondCentrifugationTemperatureListProvider {

  private static final ArrayList<SecondCentrifugationTemperatureOption>
      SECOND_CENTRIFGUATION_TEMPERATURE_OPTIONS;

  static {
    SECOND_CENTRIFGUATION_TEMPERATURE_OPTIONS = new ArrayList<>();
    for (SecondCentrifugationTemperature secondCentrifugationTemperature :
        SecondCentrifugationTemperature.values()) {
      SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
          new SecondCentrifugationTemperatureOption(secondCentrifugationTemperature);
      SECOND_CENTRIFGUATION_TEMPERATURE_OPTIONS.add(secondCentrifugationTemperatureOption);
    }
  }

  public static ArrayList<SecondCentrifugationTemperatureOption> getList() {
    return SECOND_CENTRIFGUATION_TEMPERATURE_OPTIONS;
  }

  public static SecondCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption :
        SECOND_CENTRIFGUATION_TEMPERATURE_OPTIONS) {

      if (secondCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return secondCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
