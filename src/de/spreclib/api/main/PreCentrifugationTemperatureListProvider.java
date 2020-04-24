package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
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
 * @see de.spreclib.api.main.PreCentrifugationTemperatureOption
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
   * @throws UndefinedValueException if value for the temperature cannot be found in ListOptions
   * @throws IllegalArgumentException if temperature is null
   */
  public PreCentrifugationTemperatureOption valueOf(Temperature temperature)
      throws UndefinedValueException {

    if (temperature == null) {
      throw new IllegalArgumentException("Temperature cannot be null.");
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (PreCentrifugationTemperatureOption preCentrifugationTemperatureOption : this.listOptions) {
      if (preCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return preCentrifugationTemperatureOption;
      }
    }
    throw new UndefinedValueException(
        temperature,
        "PreCentrifugationTemperature",
        "Value "
            + temperatureCelsius
            + " degrees celsius undefined for PreCentrifugationTemperature.");
  }
}
