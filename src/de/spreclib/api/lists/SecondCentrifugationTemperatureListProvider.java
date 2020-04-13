package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import java.util.ArrayList;

/**
 * ListProvider for SecondCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption
 */
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

  /**
   * Takes a temperature object and returns a SecondCentrifugationTemperatureOption if a
   * SecondCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return SecondCentrifugationTemperatureOption
   */
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
