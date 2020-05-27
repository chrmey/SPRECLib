package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.main.interfaces.IFactorListProvider;
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
 * @see de.spreclib.api.main.PreCentrifugationOption
 */
public final class PreCentrifugationListProvider
    extends AbstractListProvider<PreCentrifugationOption>
    implements IFactorListProvider<PreCentrifugationOption> {

  public PreCentrifugationListProvider() {
    super();
  }

  @Override
  List<PreCentrifugationOption> generateList() {
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
   * that combination is found.
   *
   * @param preCentrifugationDelayOption PreCentrifugationDelayOption
   * @param preCentrifugationTemperatureOption PreCentrifugationTemperatureOption
   * @return PreCentrifugationOption
   * @throws UndefinedValueCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public PreCentrifugationOption valueOf(
      PreCentrifugationDelayOption preCentrifugationDelayOption,
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption)
      throws UndefinedValueCombinationException {

    if (preCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PreCentrifugationTemperatureOption cannot not be null.");
    }

    if (preCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayOption cannot not be null.");
    }

    for (PreCentrifugationOption preCentrifugationOption : this.listOptions) {

      if (preCentrifugationOption.hasPreCentrifugation(
          preCentrifugationDelayOption, preCentrifugationTemperatureOption)) {

        return preCentrifugationOption;
      }
    }

    throw new UndefinedValueCombinationException(
        "Parameter combination for PreCentrifugation is undefined in SPREC.");
  }

  @Override
public PreCentrifugationOption getOptionFromCodeString(String codeString) {
    for (PreCentrifugationOption preCentrifugationOption : this.listOptions) {
      if (preCentrifugationOption.hasCodeString(codeString)) {
        return preCentrifugationOption;
      }
    }
    return null;
  }
}
