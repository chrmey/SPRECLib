package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import java.util.ArrayList;

/**
 * ListProvider for FirstCentrifugationSpeedOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FirstCentrifugationSpeedOption
 */
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

  /**
   * Takes a speed in G integer and returns a FirstCentrifugationSpeedOption if a
   * FirstCentrifugationSpeedOption with that speed is found. Returns null otherwise.
   *
   * @param speed Centrifugation speed in g
   * @return FirstCentrifugationSpeedOption
   */
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
