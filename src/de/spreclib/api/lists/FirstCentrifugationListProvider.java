package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.FirstCentrifugationBrakingOption;
import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;
import java.util.ArrayList;

public final class FirstCentrifugationListProvider {

  private static final ArrayList<FirstCentrifugationOption> FIRST_CENTRIFUGATION_OPTIONS;

  static {
    FIRST_CENTRIFUGATION_OPTIONS = new ArrayList<>();
    for (Centrifugation firstCentrifugation : FirstCentrifugationList.CENTRIFUGATIONS) {
      FirstCentrifugationOption firstCentrifugationOption =
          new FirstCentrifugationOption(firstCentrifugation);
      FIRST_CENTRIFUGATION_OPTIONS.add(firstCentrifugationOption);
    }
  }

  public static ArrayList<FirstCentrifugationOption> getList() {
    return FIRST_CENTRIFUGATION_OPTIONS;
  }

  public static FirstCentrifugationOption valueOf(
      FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption,
      FirstCentrifugationDurationOption firstCentrifugationDurationOption,
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption,
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption) {

    if (firstCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException();
    }

    if (firstCentrifugationDurationOption == null) {
      throw new IllegalArgumentException();
    }

    if (firstCentrifugationSpeedOption == null) {
      throw new IllegalArgumentException();
    }

    if (firstCentrifugationBrakingOption == null) {
      throw new IllegalArgumentException();
    }

    for (FirstCentrifugationOption firstCentrifugationOption : FIRST_CENTRIFUGATION_OPTIONS) {
      if (firstCentrifugationOption.hasFirstCentrifugation(
          firstCentrifugationTemperatureOption,
          firstCentrifugationDurationOption,
          firstCentrifugationSpeedOption,
          firstCentrifugationBrakingOption)) {
        return firstCentrifugationOption;
      }
    }
    throw new InvalidParameterCombinationException(
        "Parameter combination for FirstCentrifugation is no valid combination.");
  }
}
