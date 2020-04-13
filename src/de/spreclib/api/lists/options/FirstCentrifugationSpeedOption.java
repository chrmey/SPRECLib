package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;

/**
 * FirstCentrifugationSpeedOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationSpeedOption extends AbstractListOption {

  private final FirstCentrifugationSpeed firstCentrifugationSpeed;

  public FirstCentrifugationSpeedOption(FirstCentrifugationSpeed firstCentrifugationSpeed) {
    this.firstCentrifugationSpeed = firstCentrifugationSpeed;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationSpeed.name());
  }

  @Override
  public FirstCentrifugationSpeed getContainedObject() {
    return this.firstCentrifugationSpeed;
  }

  public boolean hasSpeed(int speed) {
    if (this.firstCentrifugationSpeed.hasValueFor(speed)) {
      return true;
    } else {
      return false;
    }
  }
}
