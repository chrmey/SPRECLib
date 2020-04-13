package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import java.util.ArrayList;

/**
 * ListProvider for SecondCentrifugationSpeedOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SecondCentrifugationSpeedOption
 */
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

  /**
   * Takes a speed in G integer and returns a SecondCentrifugationSpeedOption if a
   * SecondCentrifugationSpeedOption with that speed is found. Returns null otherwise.
   *
   * @param speed Centrifugation speed in g
   * @return SecondCentrifugationSpeedOption
   */
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
