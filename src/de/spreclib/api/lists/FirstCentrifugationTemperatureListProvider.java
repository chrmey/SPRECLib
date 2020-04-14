package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

public final class FirstCentrifugationTemperatureListProvider {

  /**
   * ListProvider for FirstCentrifugationTemperatureOptions.
   *
   * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
   *
   * @author Christopher Meyer
   * @version 1.0
   * @see de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption
   */
  private static final List<FirstCentrifugationTemperatureOption>
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

  public static List<FirstCentrifugationTemperatureOption> getList() {
    return FIRST_CENTRIFGUATION_TEMPERATURE_OPTIONS;
  }

  /**
   * Takes a temperature object and returns a FirstCentrifugationTemperatureOption if a
   * FirstCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return FirstCentrifugationTemperatureOption
   */
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
