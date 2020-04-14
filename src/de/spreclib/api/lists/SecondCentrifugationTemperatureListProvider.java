package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

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

  private final List<SecondCentrifugationTemperatureOption> secondCentrifugationTemperatureOptions;

  public SecondCentrifugationTemperatureListProvider() {
    this.secondCentrifugationTemperatureOptions = generateList();
  }

  private List<SecondCentrifugationTemperatureOption> generateList() {
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

  public List<SecondCentrifugationTemperatureOption> getList() {
    return this.secondCentrifugationTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a SecondCentrifugationTemperatureOption if a
   * SecondCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return SecondCentrifugationTemperatureOption
   */
  public SecondCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption :
        this.secondCentrifugationTemperatureOptions) {

      if (secondCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return secondCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
