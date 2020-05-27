package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationSpeedOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.SecondCentrifugationSpeedOptionTest
 */
public final class SecondCentrifugationSpeedListProvider
    extends AbstractListProvider<SecondCentrifugationSpeedOption> {

  public SecondCentrifugationSpeedListProvider() {
    super();
  }

  @Override
  List<SecondCentrifugationSpeedOption> generateList() {
    List<SecondCentrifugationSpeedOption> secondCentrifugationSpeedOptions = new ArrayList<>();
    for (SecondCentrifugationSpeed secondCentrifugationSpeed : SecondCentrifugationSpeed.values()) {
      SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
          new SecondCentrifugationSpeedOption(secondCentrifugationSpeed);
      secondCentrifugationSpeedOptions.add(secondCentrifugationSpeedOption);
    }
    return secondCentrifugationSpeedOptions;
  }

  /**
   * Takes a speed in G integer and returns a SecondCentrifugationSpeedOption if a
   * SecondCentrifugationSpeedOption with that speed is found.
   *
   * @param speed Centrifugation speed in g
   * @return SecondCentrifugationSpeedOption
   * @throws UndefinedValueException if value for speed cannot be found in ListOptions
   */
  public SecondCentrifugationSpeedOption valueOf(int speed) throws UndefinedValueException {
    for (SecondCentrifugationSpeedOption secondCentrifugationSpeedOption : this.listOptions) {

      if (secondCentrifugationSpeedOption.hasSpeed(speed)) {
        return secondCentrifugationSpeedOption;
      }
    }
    throw new UndefinedValueException(
        speed,
        "SecondCentrifugationSpeed",
        "Value " + speed + "g undefined for SecondCentrifugationSpeed.");
  }
}
