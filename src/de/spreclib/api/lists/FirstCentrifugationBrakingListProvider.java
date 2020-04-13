package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationBrakingOption;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.ArrayList;

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

  public static final ArrayList<FirstCentrifugationBrakingOption>
      FIRST_CENTRIFUGATION_BRAKING_OPTIONS;

  static {
    FIRST_CENTRIFUGATION_BRAKING_OPTIONS = new ArrayList<>();
    for (CentrifugationBraking centrifugationBraking : CentrifugationBraking.values()) {
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
          new FirstCentrifugationBrakingOption(centrifugationBraking);
      FIRST_CENTRIFUGATION_BRAKING_OPTIONS.add(firstCentrifugationBrakingOption);
    }
  }

  public static ArrayList<FirstCentrifugationBrakingOption> getList() {
    return FIRST_CENTRIFUGATION_BRAKING_OPTIONS;
  }

  /**
   * Takes a boolean and returns a FirstCentrifguationBrakingOption if a
   * FirstCentrifguationBrakingOption with that is found. Returns null otherwise.
   *
   * @param braking boolean
   * @return FirstCentrifugationOption
   */
  public static FirstCentrifugationBrakingOption valueOf(boolean braking) {

    for (FirstCentrifugationBrakingOption firstCentrifugationBrakingOption :
        FIRST_CENTRIFUGATION_BRAKING_OPTIONS) {

      if (firstCentrifugationBrakingOption.hasBraking(braking)) {
        return firstCentrifugationBrakingOption;
      }
    }
    return null;
  }
}
