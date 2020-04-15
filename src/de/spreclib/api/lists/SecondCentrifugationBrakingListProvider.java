package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationBrakingOption;
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
 * @see de.spreclib.api.lists.options.SecondCentrifugationBrakingOption
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
   * SecondCentrifugationBrakingOption with that is found. Returns null otherwise.
   *
   * @param braking boolean
   * @return SecondCentrifugationBrakingOption
   */
  public SecondCentrifugationBrakingOption valueOf(boolean braking) {

    for (SecondCentrifugationBrakingOption secondCentrifugationBrakingOption : this.listOptions) {

      if (secondCentrifugationBrakingOption.hasBraking(braking)) {
        return secondCentrifugationBrakingOption;
      }
    }
    return null;
  }
}
