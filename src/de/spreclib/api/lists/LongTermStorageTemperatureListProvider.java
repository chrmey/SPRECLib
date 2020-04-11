package de.spreclib.api.lists;

import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import java.util.ArrayList;

public final class LongTermStorageTemperatureListProvider {

  private static final ArrayList<LongTermStorageTemperatureOption>
      LONG_TERM_STORAGE_TEMPERATURE_OPTIONS;

  static {
    LONG_TERM_STORAGE_TEMPERATURE_OPTIONS = new ArrayList<>();
    for (LongTermStorageTemperature longTermStorageTemperature :
        LongTermStorageTemperature.values()) {
      LongTermStorageTemperatureOption longTermStorageTemperatureOption =
          new LongTermStorageTemperatureOption(longTermStorageTemperature);
      LONG_TERM_STORAGE_TEMPERATURE_OPTIONS.add(longTermStorageTemperatureOption);
    }
  }

  public static ArrayList<LongTermStorageTemperatureOption> getList() {
    return LONG_TERM_STORAGE_TEMPERATURE_OPTIONS;
  }

  public static LongTermStorageTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (LongTermStorageTemperatureOption longTermStorageTemperatureOption :
        LONG_TERM_STORAGE_TEMPERATURE_OPTIONS) {
      if (longTermStorageTemperatureOption.hasTemperature(temperatureCelsius)) {
        return longTermStorageTemperatureOption;
      }
    }
    return null;
  }
}
