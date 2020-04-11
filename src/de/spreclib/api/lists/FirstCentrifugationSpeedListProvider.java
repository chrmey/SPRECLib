package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import java.util.ArrayList;

public final class FirstCentrifugationSpeedListProvider {

  private static final ArrayList<FirstCentrifugationSpeedOption> FIRST_CENTRIFUGATION_SPEED_OPTIONS;

  static {
    FIRST_CENTRIFUGATION_SPEED_OPTIONS = new ArrayList<>();
    for (FirstCentrifugationSpeed firstCentrifugationSpeed : FirstCentrifugationSpeed.values()) {
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
          new FirstCentrifugationSpeedOption(firstCentrifugationSpeed);
      FIRST_CENTRIFUGATION_SPEED_OPTIONS.add(firstCentrifugationSpeedOption);
    }
  }

  public static ArrayList<FirstCentrifugationSpeedOption> getList() {
    return FIRST_CENTRIFUGATION_SPEED_OPTIONS;
  }

  public static FirstCentrifugationSpeedOption valueOf(int speed) {
    for (FirstCentrifugationSpeedOption firstCentrifugationSpeedOption :
        FIRST_CENTRIFUGATION_SPEED_OPTIONS) {

      if (firstCentrifugationSpeedOption.hasSpeed(speed)) {
        return firstCentrifugationSpeedOption;
      }
    }
    return null;
  }
}
