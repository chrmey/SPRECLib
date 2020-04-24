package de.spreclib.api.main;

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

  FirstCentrifugationSpeedOption(FirstCentrifugationSpeed firstCentrifugationSpeed) {
    this.firstCentrifugationSpeed = firstCentrifugationSpeed;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationSpeed.name());
  }

  @Override
  protected FirstCentrifugationSpeed getContainedObject() {
    return this.firstCentrifugationSpeed;
  }

  protected boolean hasSpeed(int speed) {
    if (this.firstCentrifugationSpeed.hasValue(speed)) {
      return true;
    } else {
      return false;
    }
  }
}
