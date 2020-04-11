package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.SecondCentrifugationBrakingOption;
import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.api.lists.options.SecondCentrifugationSpeedOption;
import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import java.util.ArrayList;

public final class SecondCentrifugationListProvider {

  private static final ArrayList<SecondCentrifugationOption> SECOND_CENTRIFUGATION_OPTIONS;

  static {
    SECOND_CENTRIFUGATION_OPTIONS = new ArrayList<>();
    for (Centrifugation secondCentrifugation : SecondCentrifugationList.CENTRIFUGATIONS) {
      SecondCentrifugationOption secondCentrifugationOption =
          new SecondCentrifugationOption(secondCentrifugation);
      SECOND_CENTRIFUGATION_OPTIONS.add(secondCentrifugationOption);
    }
  }

  public static ArrayList<SecondCentrifugationOption> getList() {
    return SECOND_CENTRIFUGATION_OPTIONS;
    }

  public static SecondCentrifugationOption valueOf(
      SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption,
      SecondCentrifugationDurationOption secondCentrifugationDurationOption,
      SecondCentrifugationSpeedOption secondCentrifugationSpeedOption,
      SecondCentrifugationBrakingOption secondCentrifugationBrakingOption) {

    if (secondCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException();
    }

    if (secondCentrifugationDurationOption == null) {
      throw new IllegalArgumentException();
    }

    if (secondCentrifugationSpeedOption == null) {
      throw new IllegalArgumentException();
    }

    if (secondCentrifugationBrakingOption == null) {
      throw new IllegalArgumentException();
    }

    for (SecondCentrifugationOption secondCentrifugationOption : SECOND_CENTRIFUGATION_OPTIONS) {
      if (secondCentrifugationOption.hasSecondCentrifugation(
          secondCentrifugationTemperatureOption,
          secondCentrifugationDurationOption,
          secondCentrifugationSpeedOption,
          secondCentrifugationBrakingOption)) {
        return secondCentrifugationOption;
      }
    }
    throw new InvalidParameterCombinationException(
        "Parameter combination for SecondCentrifugation is no valid combination.");
  }
}
