package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.FirstCentrifugationList;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.FirstCentrifugationOption
 */
public final class FirstCentrifugationListProvider
    extends AbstractListProvider<FirstCentrifugationOption>
    implements IFactorListProvider<FirstCentrifugationOption> {

  public FirstCentrifugationListProvider() {
    super();
  }

  @Override
  List<FirstCentrifugationOption> generateList() {
    List<FirstCentrifugationOption> firstCentrifugationOptions = new ArrayList<>();
    for (Centrifugation firstCentrifugation : FirstCentrifugationList.FIRST_CENTRIFUGATIONS) {
      FirstCentrifugationOption firstCentrifugationOption =
          new FirstCentrifugationOption(firstCentrifugation);
      firstCentrifugationOptions.add(firstCentrifugationOption);
    }
    return firstCentrifugationOptions;
  }

  /**
   * Takes all parameters for FirstCentrifugation and returns an option if a FirstCentrifugation
   * with that combination is found.
   *
   * @param firstCentrifugationTemperatureOption FirstCentrifugationTemperatureOption
   * @param firstCentrifugationDurationOption FirstCentrifugationDurationOption
   * @param firstCentrifugationSpeedOption FirstCentrifugationSpeedOption
   * @param firstCentrifugationBrakingOption FirstCentrifugationBrakingOption
   * @return FirstCentrifugationOption
   * @throws UndefinedValueCombinationException if value combination cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public FirstCentrifugationOption valueOf(
      FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption,
      FirstCentrifugationDurationOption firstCentrifugationDurationOption,
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption,
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption)
      throws UndefinedValueCombinationException {

    if (firstCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("FirstCentrifugationTemperatureOption cannot be null");
    }

    if (firstCentrifugationDurationOption == null) {
      throw new IllegalArgumentException("FirstCentrifugationDurationOption cannot be null");
    }

    if (firstCentrifugationSpeedOption == null) {
      throw new IllegalArgumentException("FirstCentrifugationSpeedOption cannot be null");
    }

    if (firstCentrifugationBrakingOption == null) {
      throw new IllegalArgumentException("FirstCentrifugationBrakingOption cannot be null");
    }

    for (FirstCentrifugationOption firstCentrifugationOption : this.listOptions) {
      if (firstCentrifugationOption.hasFirstCentrifugation(
          firstCentrifugationTemperatureOption,
          firstCentrifugationDurationOption,
          firstCentrifugationSpeedOption,
          firstCentrifugationBrakingOption)) {
        return firstCentrifugationOption;
      }
    }
    throw new UndefinedValueCombinationException(
        "Value combination for FirstCentrifugation is undefined in SPREC.");
  }

  @Override
public FirstCentrifugationOption getOptionFromCodeString(String codeString) {
    for (FirstCentrifugationOption firstCentrifugationOption : this.listOptions) {
      if (firstCentrifugationOption.hasCodeString(codeString)) {
        return firstCentrifugationOption;
      }
    }
    return null;
  }
}
