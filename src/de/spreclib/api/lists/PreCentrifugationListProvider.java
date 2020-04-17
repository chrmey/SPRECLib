package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidValueCombinationException;
import de.spreclib.model.precentrifugation.PreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugationList;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PreCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.PreCentrifugationOption
 */
public final class PreCentrifugationListProvider
    extends AbstractListProvider<PreCentrifugationOption> {

  public PreCentrifugationListProvider() {
    super();
  }

  @Override
  protected List<PreCentrifugationOption> generateList() {
    List<PreCentrifugationOption> preCentrifguationOptions = new ArrayList<>();
    for (PreCentrifugation preCentrifugation : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      PreCentrifugationOption preCentrifugationOption =
          new PreCentrifugationOption(preCentrifugation);
      preCentrifguationOptions.add(preCentrifugationOption);
    }
    return preCentrifguationOptions;
  }

  /**
   * Takes all parameters for PreCentrifugation and returns an option if a PreCentrifugation with
   * that combination is found. Returns null otherwise.
   *
   * @param preCentrifugationTemperatureOption PreCentrifugationTemperatureOption
   * @param preCentrifugationDelayOption PreCentrifugationDelayOption
   * @return PreCentrifugationOption
   * @throws InvalidValueCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public PreCentrifugationOption valueOf(
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption,
      PreCentrifugationDelayOption preCentrifugationDelayOption) {

    if (preCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PreCentrifugationTemperatureOption cannot not be null.");
    }

    if (preCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayOption cannot not be null.");
    }

    for (PreCentrifugationOption preCentrifugationOption : this.listOptions) {

      if (preCentrifugationOption.hasPreCentrifugation(
          preCentrifugationTemperatureOption, preCentrifugationDelayOption)) {

        return preCentrifugationOption;
      }
    }

    throw new InvalidValueCombinationException(
        "Parameter combination for PreCentrifugation is no valid combination.");
  }
}
