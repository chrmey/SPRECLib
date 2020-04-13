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

/**
 * ListProvider for SecondCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SecondCentrifugationOption
 */
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

  /**
   * Takes all parameters for SecondCentrifugation and returns an option if a SecondCentrifugation
   * with that combination is found. Returns null otherwise.
   *
   * @param secondCentrifugationTemperatureOption SecondCentrifugationTemperatureOption
   * @param secondCentrifugationDurationOption SecondCentrifugationDurationOption
   * @param secondCentrifugationSpeedOption SecondCentrifugationSpeedOption
   * @param secondCentrifugationBrakingOption SecondCentrifugationBrakingOption
   * @return SecondCentrifugationOption
   * @throws InvalidParameterCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public static SecondCentrifugationOption valueOf(
      SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption,
      SecondCentrifugationDurationOption secondCentrifugationDurationOption,
      SecondCentrifugationSpeedOption secondCentrifugationSpeedOption,
      SecondCentrifugationBrakingOption secondCentrifugationBrakingOption) {

    if (secondCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("SecondCentrifugationTemperatureOption cannot be null.");
    }

    if (secondCentrifugationDurationOption == null) {
      throw new IllegalArgumentException("SecondCentrifugationDurationOption cannot be null.");
    }

    if (secondCentrifugationSpeedOption == null) {
      throw new IllegalArgumentException("SecondCentrifugationSpeedOption cannot be null.");
    }

    if (secondCentrifugationBrakingOption == null) {
      throw new IllegalArgumentException("SecondCentrifugationBrakingOption cannot be null.");
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
