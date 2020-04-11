package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import java.util.ArrayList;

public final class PreCentrifugationTemperatureListProvider {

  private static final ArrayList<PreCentrifugationTemperatureOption>
      PRE_CENTRIFUGATION_TEMPERATURE_OPTIONS;

  static {
    PRE_CENTRIFUGATION_TEMPERATURE_OPTIONS = new ArrayList<>();
    for (PreCentrifugationTemperature preCentrifugationTemperature : PreCentrifugationTemperature.values()) {
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption = new PreCentrifugationTemperatureOption(preCentrifugationTemperature);
      PRE_CENTRIFUGATION_TEMPERATURE_OPTIONS.add(preCentrifugationTemperatureOption);
    }
  }

  public static ArrayList<PreCentrifugationTemperatureOption> getList() {
    return PRE_CENTRIFUGATION_TEMPERATURE_OPTIONS;
  }

  public static PreCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (PreCentrifugationTemperatureOption preCentrifugationTemperatureOption :
        PRE_CENTRIFUGATION_TEMPERATURE_OPTIONS) {
      if (preCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return preCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
