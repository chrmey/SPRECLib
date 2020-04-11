package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import java.util.ArrayList;

public final class SecondCentrifugationSpeedListProvider {

  private static final ArrayList<SecondCentrifugationSpeedOption>
      SECOND_CENTRIFUGATION_SPEED_OPTIONS;

  static {
    SECOND_CENTRIFUGATION_SPEED_OPTIONS = new ArrayList<>();
    for (SecondCentrifugationSpeed secondCentrifugationSpeed : SecondCentrifugationSpeed.values()) {
      SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
          new SecondCentrifugationSpeedOption(secondCentrifugationSpeed);
      SECOND_CENTRIFUGATION_SPEED_OPTIONS.add(secondCentrifugationSpeedOption);
    }
  }

  public static ArrayList<SecondCentrifugationSpeedOption> getList() {
    return SECOND_CENTRIFUGATION_SPEED_OPTIONS;
  }

  public static SecondCentrifugationSpeedOption valueOf(int speed) {
    for (SecondCentrifugationSpeedOption secondCentrifugationSpeedOption :
        SECOND_CENTRIFUGATION_SPEED_OPTIONS) {

      if (secondCentrifugationSpeedOption.hasSpeed(speed)) {
        return secondCentrifugationSpeedOption;
      }
    }
    return null;
  }
}
