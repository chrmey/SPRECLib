package de.spreclib.api.lists;

import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PreCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.PreCentrifugationTemperatureOption
 */
public final class PreCentrifugationTemperatureListProvider
    extends AbstractListProvider<PreCentrifugationTemperatureOption> {;

  public PreCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  protected List<PreCentrifugationTemperatureOption> generateList() {
    List<PreCentrifugationTemperatureOption> preCentrifugationTemperatureOptions =
        new ArrayList<>();
    for (PreCentrifugationTemperature preCentrifugationTemperature :
        PreCentrifugationTemperature.values()) {
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption =
          new PreCentrifugationTemperatureOption(preCentrifugationTemperature);
      preCentrifugationTemperatureOptions.add(preCentrifugationTemperatureOption);
    }
    return preCentrifugationTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a PreCentrifugationTemperatureOption if a
   * PreCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return PreCentrifugationTemperatureOption
   */
  public PreCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (PreCentrifugationTemperatureOption preCentrifugationTemperatureOption : this.listOptions) {
      if (preCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return preCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
