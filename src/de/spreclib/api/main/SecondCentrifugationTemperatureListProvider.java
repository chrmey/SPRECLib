package de.spreclib.api.main;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.SecondCentrifugationTemperatureOption
 */
public final class SecondCentrifugationTemperatureListProvider
    extends AbstractListProvider<SecondCentrifugationTemperatureOption> {

  public SecondCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  List<SecondCentrifugationTemperatureOption> generateList() {
    List<SecondCentrifugationTemperatureOption> secondCentrifugationTemperatureOptions =
        new ArrayList<>();
    for (SecondCentrifugationTemperature secondCentrifugationTemperature :
        SecondCentrifugationTemperature.values()) {
      SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
          new SecondCentrifugationTemperatureOption(secondCentrifugationTemperature);
      secondCentrifugationTemperatureOptions.add(secondCentrifugationTemperatureOption);
    }
    return secondCentrifugationTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a SecondCentrifugationTemperatureOption if a
   * SecondCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return SecondCentrifugationTemperatureOption
   * @throws UndefinedValueException if value for the temperature cannot be found in ListOptions
   * @throws IllegalArgumentException if temperature is null
   */
  public SecondCentrifugationTemperatureOption valueOf(Temperature temperature)
      throws UndefinedValueException {

    if (temperature == null) {
      throw new IllegalArgumentException("Temperature cannot be null.");
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption :
        this.listOptions) {

      if (secondCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return secondCentrifugationTemperatureOption;
      }
    }
    throw new UndefinedValueException(
        temperature,
        "SecondCentrifugationTemperature",
        "Value "
            + temperatureCelsius
            + " degrees celsius undefined for SecondCentrifugationTemperature.");
  }
}
