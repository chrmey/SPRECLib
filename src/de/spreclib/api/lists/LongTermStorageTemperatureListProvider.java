package de.spreclib.api.lists;

import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for LongTermStorageTemperatures.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.LongTermStorageTemperatureOption
 */
public final class LongTermStorageTemperatureListProvider {

  private final List<LongTermStorageTemperatureOption> longTermSTorageTemperatureOptions;

  public LongTermStorageTemperatureListProvider() {
    this.longTermSTorageTemperatureOptions = generateList();
  }

  private List<LongTermStorageTemperatureOption> generateList() {
    List<LongTermStorageTemperatureOption> longTermSTorageTemperatureOptions = new ArrayList<>();
    for (LongTermStorageTemperature longTermStorageTemperature :
        LongTermStorageTemperature.values()) {
      LongTermStorageTemperatureOption longTermStorageTemperatureOption =
          new LongTermStorageTemperatureOption(longTermStorageTemperature);
      longTermSTorageTemperatureOptions.add(longTermStorageTemperatureOption);
    }
    return longTermSTorageTemperatureOptions;
  }

  public List<LongTermStorageTemperatureOption> getList() {
    return this.longTermSTorageTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a LongTermStorageTemperatureOption if a
   * LongTermStorageTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return LongTermStorageTemperatureOption
   */
  public LongTermStorageTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (LongTermStorageTemperatureOption longTermStorageTemperatureOption :
        this.longTermSTorageTemperatureOptions) {
      if (longTermStorageTemperatureOption.hasTemperature(temperatureCelsius)) {
        return longTermStorageTemperatureOption;
      }
    }
    return null;
  }
}
