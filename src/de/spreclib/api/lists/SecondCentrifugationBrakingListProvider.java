package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationBrakingOption;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.ArrayList;

public final class SecondCentrifugationBrakingListProvider {

  public static final ArrayList<SecondCentrifugationBrakingOption>
      SECOND_CENTRIFUGATION_BRAKING_OPTIONS;

  static {
    SECOND_CENTRIFUGATION_BRAKING_OPTIONS = new ArrayList<>();
    for (CentrifugationBraking centrifugationBraking : CentrifugationBraking.values()) {
      SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
          new SecondCentrifugationBrakingOption(centrifugationBraking);
      SECOND_CENTRIFUGATION_BRAKING_OPTIONS.add(secondCentrifugationBrakingOption);
    }
  }

  public static ArrayList<SecondCentrifugationBrakingOption> getList() {
    return SECOND_CENTRIFUGATION_BRAKING_OPTIONS;
  }

  public static SecondCentrifugationBrakingOption valueOf(boolean braking) {

    for (SecondCentrifugationBrakingOption secondCentrifugationBrakingOption :
        SECOND_CENTRIFUGATION_BRAKING_OPTIONS) {

      if (secondCentrifugationBrakingOption.hasBraking(braking)) {
        return secondCentrifugationBrakingOption;
      }
    }
    return null;
  }
}
