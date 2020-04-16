package de.spreclib.api.lists;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;

/**
 * SecondCentrifugationSpeedOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationSpeedOption extends AbstractListOption {

  private final SecondCentrifugationSpeed secondCentrifugationSpeed;

  SecondCentrifugationSpeedOption(SecondCentrifugationSpeed secondCentrifugationSpeed) {
    this.secondCentrifugationSpeed = secondCentrifugationSpeed;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationSpeed.name());
  }

  @Override
  public SecondCentrifugationSpeed getContainedObject() {
    return this.secondCentrifugationSpeed;
  }

  protected boolean hasSpeed(int speed) {
    if (this.secondCentrifugationSpeed.hasValueFor(speed)) {
      return true;
    } else {
      return false;
    }
  }
}
