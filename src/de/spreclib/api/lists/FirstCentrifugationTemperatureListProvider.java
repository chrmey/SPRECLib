package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption
 */
public final class FirstCentrifugationTemperatureListProvider
    extends AbstractListProvider<FirstCentrifugationTemperatureOption> {

  public FirstCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  protected List<FirstCentrifugationTemperatureOption> generateList() {
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
   */
  public FirstCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();
    for (FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption : listOptions) {

      if (firstCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return firstCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
