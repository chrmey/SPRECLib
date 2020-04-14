package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationBrakingOption;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationBrakingOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FirstCentrifugationBrakingOption
 */
public final class FirstCentrifugationBrakingListProvider {

  public final List<FirstCentrifugationBrakingOption> firstCentrifugationBrakingOptions;

  public FirstCentrifugationBrakingListProvider() {
    this.firstCentrifugationBrakingOptions = generateList();
  }

  private List<FirstCentrifugationBrakingOption> generateList() {
    List<FirstCentrifugationBrakingOption> firstCentrifugationBrakingOptions = new ArrayList<>();
    for (CentrifugationBraking centrifugationBraking : CentrifugationBraking.values()) {
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
          new FirstCentrifugationBrakingOption(centrifugationBraking);
      firstCentrifugationBrakingOptions.add(firstCentrifugationBrakingOption);
    }
    return firstCentrifugationBrakingOptions;
  }

  public List<FirstCentrifugationBrakingOption> getList() {
    return this.firstCentrifugationBrakingOptions;
  }

  /**
   * Takes a boolean and returns a FirstCentrifguationBrakingOption if a
   * FirstCentrifguationBrakingOption with that is found. Returns null otherwise.
   *
   * @param braking boolean
   * @return FirstCentrifugationOption
   */
  public FirstCentrifugationBrakingOption valueOf(boolean braking) {
    for (FirstCentrifugationBrakingOption firstCentrifugationBrakingOption :
        this.firstCentrifugationBrakingOptions) {

      if (firstCentrifugationBrakingOption.hasBraking(braking)) {
        return firstCentrifugationBrakingOption;
      }
    }
    return null;
  }
}
