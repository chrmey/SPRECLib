package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationBrakingOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.FirstCentrifugationBrakingOption
 */
public final class FirstCentrifugationBrakingListProvider
    extends AbstractListProvider<FirstCentrifugationBrakingOption> {

  public FirstCentrifugationBrakingListProvider() {
    super();
  }

  @Override
  List<FirstCentrifugationBrakingOption> generateList() {
    List<FirstCentrifugationBrakingOption> firstCentrifugationBrakingOptions = new ArrayList<>();
    for (CentrifugationBraking centrifugationBraking : CentrifugationBraking.values()) {
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
          new FirstCentrifugationBrakingOption(centrifugationBraking);
      firstCentrifugationBrakingOptions.add(firstCentrifugationBrakingOption);
    }
    return firstCentrifugationBrakingOptions;
  }

  /**
   * Takes a boolean and returns a FirstCentrifguationBrakingOption if a
   * FirstCentrifguationBrakingOption with that is found.
   *
   * @param braking boolean
   * @return FirstCentrifugationOption
   * @throws UndefinedValueException if value for braking cannot be found
   */
  public FirstCentrifugationBrakingOption valueOf(boolean braking) throws UndefinedValueException {

    for (FirstCentrifugationBrakingOption firstCentrifugationBrakingOption : this.listOptions) {

      if (firstCentrifugationBrakingOption.hasBraking(braking)) {
        return firstCentrifugationBrakingOption;
      }
    }
    throw new UndefinedValueException(
        braking,
        "FirstCentrifugationBraking",
        "Value " + braking + " is undefined for FirstCentrifugationBraking.");
  }
}
