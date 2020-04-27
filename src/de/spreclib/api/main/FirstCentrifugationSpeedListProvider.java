package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
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
 * @see de.spreclib.api.main.FirstCentrifugationSpeedOption
 */
public final class FirstCentrifugationSpeedListProvider
    extends AbstractListProvider<FirstCentrifugationSpeedOption> {

  public FirstCentrifugationSpeedListProvider() {
    super();
  }

  @Override
  protected List<FirstCentrifugationSpeedOption> generateList() {
    List<FirstCentrifugationSpeedOption> firstCentrifugationSpeedOptions = new ArrayList<>();
    for (FirstCentrifugationSpeed firstCentrifugationSpeed : FirstCentrifugationSpeed.values()) {
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
          new FirstCentrifugationSpeedOption(firstCentrifugationSpeed);
      firstCentrifugationSpeedOptions.add(firstCentrifugationSpeedOption);
    }
    return firstCentrifugationSpeedOptions;
  }

  /**
   * Takes a speed in G integer and returns a FirstCentrifugationSpeedOption if a
   * FirstCentrifugationSpeedOption with that speed is found.
   *
   * @param speed Centrifugation speed in g
   * @return FirstCentrifugationSpeedOption
   * @throws UndefinedValueException if value for speed cannot be found in ListOptions
   */
  public FirstCentrifugationSpeedOption valueOf(int speed) throws UndefinedValueException {
    for (FirstCentrifugationSpeedOption firstCentrifugationSpeedOption : listOptions) {

      if (firstCentrifugationSpeedOption.hasSpeed(speed)) {
        return firstCentrifugationSpeedOption;
      }
    }
    throw new UndefinedValueException(
        speed,
        "FirstCentrifugationSpeed",
        "Value " + speed + "g undefined for FirstCentrifugationSpeed.");
  }
}
