package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import java.util.ArrayList;
import java.util.List;

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

  private final List<FirstCentrifugationSpeedOption> firstCentrifugationSpeedOptions;

  public FirstCentrifugationSpeedListProvider() {
    this.firstCentrifugationSpeedOptions = generateList();
  }

  private List<FirstCentrifugationSpeedOption> generateList() {
    List<FirstCentrifugationSpeedOption> firstCentrifugationSpeedOptions = new ArrayList<>();
    for (FirstCentrifugationSpeed firstCentrifugationSpeed : FirstCentrifugationSpeed.values()) {
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
          new FirstCentrifugationSpeedOption(firstCentrifugationSpeed);
      firstCentrifugationSpeedOptions.add(firstCentrifugationSpeedOption);
    }
    return firstCentrifugationSpeedOptions;
  }

  public List<FirstCentrifugationSpeedOption> getList() {
    return this.firstCentrifugationSpeedOptions;
  }

  /**
   * Takes a speed in G integer and returns a FirstCentrifugationSpeedOption if a
   * FirstCentrifugationSpeedOption with that speed is found. Returns null otherwise.
   *
   * @param speed Centrifugation speed in g
   * @return FirstCentrifugationSpeedOption
   */
  public FirstCentrifugationSpeedOption valueOf(int speed) {
    for (FirstCentrifugationSpeedOption firstCentrifugationSpeedOption :
        firstCentrifugationSpeedOptions) {

      if (firstCentrifugationSpeedOption.hasSpeed(speed)) {
        return firstCentrifugationSpeedOption;
      }
    }
    return null;
  }
}
