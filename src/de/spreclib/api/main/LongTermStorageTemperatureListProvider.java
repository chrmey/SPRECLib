package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for LongTermStorageTemperatures.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.LongTermStorageTemperatureOption
 */
public final class LongTermStorageTemperatureListProvider
    extends AbstractListProvider<LongTermStorageTemperatureOption> {

  public LongTermStorageTemperatureListProvider() {
    super();
  }

  @Override
  protected List<LongTermStorageTemperatureOption> generateList() {
    List<LongTermStorageTemperatureOption> longTermSTorageTemperatureOptions = new ArrayList<>();
    for (LongTermStorageTemperature longTermStorageTemperature :
        LongTermStorageTemperature.values()) {
      LongTermStorageTemperatureOption longTermStorageTemperatureOption =
          new LongTermStorageTemperatureOption(longTermStorageTemperature);
      longTermSTorageTemperatureOptions.add(longTermStorageTemperatureOption);
    }
    return longTermSTorageTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a LongTermStorageTemperatureOption if a
   * LongTermStorageTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return LongTermStorageTemperatureOption
   * @throws UndefinedValueException if value for the temperature cannot be found in ListOptions
   * @throws IllegalArgumentException if temperature is null
   */
  public LongTermStorageTemperatureOption valueOf(Temperature temperature)
      throws UndefinedValueException {

    if (temperature == null) {
      throw new IllegalArgumentException("Temperature cannot be null.");
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (LongTermStorageTemperatureOption longTermStorageTemperatureOption : this.listOptions) {
      if (longTermStorageTemperatureOption.hasTemperature(temperatureCelsius)) {
        return longTermStorageTemperatureOption;
      }
    }
    throw new UndefinedValueException(
        temperature,
        "LongTermStorageTemperature",
        "Value "
            + temperatureCelsius
            + " degrees celsius undefined for LongTermStorageTemperature.");
  }
}
