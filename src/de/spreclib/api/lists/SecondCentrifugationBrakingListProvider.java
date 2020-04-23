package de.spreclib.api.lists;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationBrakingOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.SecondCentrifugationBrakingOption
 */
public final class SecondCentrifugationBrakingListProvider
    extends AbstractListProvider<SecondCentrifugationBrakingOption> {

  public SecondCentrifugationBrakingListProvider() {
    super();
  }

  @Override
  protected List<SecondCentrifugationBrakingOption> generateList() {
    List<SecondCentrifugationBrakingOption> secondCentrifugationBrakingOptions = new ArrayList<>();
    for (CentrifugationBraking centrifugationBraking : CentrifugationBraking.values()) {
      SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
          new SecondCentrifugationBrakingOption(centrifugationBraking);
      secondCentrifugationBrakingOptions.add(secondCentrifugationBrakingOption);
    }
    return secondCentrifugationBrakingOptions;
  }

  /**
   * Takes a boolean and returns a SecondCentrifugationBrakingOption if a
   * SecondCentrifugationBrakingOption with that is found.
   *
   * @param braking boolean
   * @return SecondCentrifugationBrakingOption
   * @throws UndefinedValueException if value for braking cannot be found
   */
  public SecondCentrifugationBrakingOption valueOf(boolean braking) throws UndefinedValueException {

    for (SecondCentrifugationBrakingOption secondCentrifugationBrakingOption : this.listOptions) {

      if (secondCentrifugationBrakingOption.hasBraking(braking)) {
        return secondCentrifugationBrakingOption;
      }
    }
    throw new UndefinedValueException(
        braking,
        "SecondCentrifugationBraking",
        "Value " + braking + " is undefined for SecondCentrifugationBraking.");
  }
}
