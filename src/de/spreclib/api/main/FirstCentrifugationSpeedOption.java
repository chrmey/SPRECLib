package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.FirstCentrifugationSpeed;

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

  FirstCentrifugationSpeedOption(FirstCentrifugationSpeed firstCentrifugationSpeed) {
    this.firstCentrifugationSpeed = firstCentrifugationSpeed;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationSpeed.name());
  }

  @Override
  FirstCentrifugationSpeed getContainedObject() {
    return this.firstCentrifugationSpeed;
  }

  boolean hasSpeed(int speed) {
    if (this.firstCentrifugationSpeed.hasValue(speed)) {
      return true;
    } else {
      return false;
    }
  }
}
