package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import java.util.ArrayList;

public final class FirstCentrifugationTemperatureListProvider {

  private static final ArrayList<FirstCentrifugationTemperatureOption>
      FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS;

  static {
    FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS = new ArrayList<>();
    for (FirstCentrifugationTemperature firstCentrifugationTemperature :
        FirstCentrifugationTemperature.values()) {
      FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
          new FirstCentrifugationTemperatureOption(firstCentrifugationTemperature);
      FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS.add(firstCentrifugationTemperatureOption);
    }
  }

  public static ArrayList<FirstCentrifugationTemperatureOption> getList() {
    return FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS;
  }

  public static FirstCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption :
        FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS) {

      if (firstCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return firstCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
