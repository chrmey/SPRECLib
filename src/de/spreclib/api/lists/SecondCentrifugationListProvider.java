package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidValueCombinationException;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.SecondCentrifugationList;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.SecondCentrifugationOption
 */
public final class SecondCentrifugationListProvider
    extends AbstractListProvider<SecondCentrifugationOption> {

  public SecondCentrifugationListProvider() {
    super();
  }

  @Override
  protected List<SecondCentrifugationOption> generateList() {
    List<SecondCentrifugationOption> secondCentrifugationOptions = new ArrayList<>();
    for (Centrifugation secondCentrifugation : SecondCentrifugationList.CENTRIFUGATIONS) {
      SecondCentrifugationOption secondCentrifugationOption =
          new SecondCentrifugationOption(secondCentrifugation);
      secondCentrifugationOptions.add(secondCentrifugationOption);
    }
    return secondCentrifugationOptions;
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
   * @throws InvalidValueCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public SecondCentrifugationOption valueOf(
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

    for (SecondCentrifugationOption secondCentrifugationOption : this.listOptions) {
      if (secondCentrifugationOption.hasSecondCentrifugation(
          secondCentrifugationTemperatureOption,
          secondCentrifugationDurationOption,
          secondCentrifugationSpeedOption,
          secondCentrifugationBrakingOption)) {
        return secondCentrifugationOption;
      }
    }
    throw new InvalidValueCombinationException(
        "Parameter combination for SecondCentrifugation is no valid combination.");
  }
}
