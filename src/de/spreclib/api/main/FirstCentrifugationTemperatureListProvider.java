package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.FirstCentrifugationTemperatureOption
 */
public final class FirstCentrifugationTemperatureListProvider
    extends AbstractListProvider<FirstCentrifugationTemperatureOption> {

  public FirstCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  List<FirstCentrifugationTemperatureOption> generateList() {
    List<FirstCentrifugationTemperatureOption> firstCentrifugationTemperatureOptions =
        new ArrayList<>();
    for (FirstCentrifugationTemperature firstCentrifugationTemperature :
        FirstCentrifugationTemperature.values()) {
      FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
          new FirstCentrifugationTemperatureOption(firstCentrifugationTemperature);
      firstCentrifugationTemperatureOptions.add(firstCentrifugationTemperatureOption);
    }
    return firstCentrifugationTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a FirstCentrifugationTemperatureOption if a
   * FirstCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return FirstCentrifugationTemperatureOption
   * @throws UndefinedValueException if value for the temperature cannot be found in ListOptions
   * @throws IllegalArgumentException if temperature is null
   */
  public FirstCentrifugationTemperatureOption valueOf(Temperature temperature)
      throws UndefinedValueException {

    if (temperature == null) {
      throw new IllegalArgumentException("Temperature cannot be null.");
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption : listOptions) {

      if (firstCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return firstCentrifugationTemperatureOption;
      }
    }
    throw new UndefinedValueException(
        temperature,
        "FirstCentrifugationTemperature",
        "Value "
            + temperatureCelsius
            + " degrees celsius undefined for FirstCentrifugationTemperature.");
  }
}
