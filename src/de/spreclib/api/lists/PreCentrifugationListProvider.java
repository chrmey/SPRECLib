package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;
import java.util.ArrayList;

/**
 * ListProvider for PreCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.PreCentrifugationOption
 */
public final class PreCentrifugationListProvider {

  private static final ArrayList<PreCentrifugationOption> PRE_CENTRIFUGATION_OPTIONS;

  static {
    PRE_CENTRIFUGATION_OPTIONS = new ArrayList<>();
    for (PreCentrifugation preCentrifugation : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      PreCentrifugationOption preCentrifugationOption =
          new PreCentrifugationOption(preCentrifugation);
      PRE_CENTRIFUGATION_OPTIONS.add(preCentrifugationOption);
    }
  }

  public static ArrayList<PreCentrifugationOption> getList() {
    return PRE_CENTRIFUGATION_OPTIONS;
  }

  /**
   * Takes all parameters for PreCentrifugation and returns an option if a PreCentrifugation with
   * that combination is found. Returns null otherwise.
   *
   * @param preCentrifugationTemperatureOption PreCentrifugationTemperatureOption
   * @param preCentrifugationDelayOption PreCentrifugationDelayOption
   * @return PreCentrifugationOption
   * @throws InvalidParameterCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public static PreCentrifugationOption valueOf(
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption,
      PreCentrifugationDelayOption preCentrifugationDelayOption) {

    if (preCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PreCentrifugationTemperatureOption cannot not be null.");
    }

    if (preCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayOption cannot not be null.");
    }

    for (PreCentrifugationOption preCentrifugationOption : PRE_CENTRIFUGATION_OPTIONS) {

      if (preCentrifugationOption.hasPreCentrifugation(
          preCentrifugationTemperatureOption, preCentrifugationDelayOption)) {

        return preCentrifugationOption;
      }
    }

    throw new InvalidParameterCombinationException(
        "Parameter combination for PreCentrifugation is no valid combination.");
  }
}
