package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;

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
  SecondCentrifugationSpeed getContainedObject() {
    return this.secondCentrifugationSpeed;
  }

  boolean hasSpeed(int speed) {
    if (this.secondCentrifugationSpeed.hasValue(speed)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((secondCentrifugationSpeed == null) ? 0 : secondCentrifugationSpeed.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    SecondCentrifugationSpeedOption other = (SecondCentrifugationSpeedOption) obj;
    if (secondCentrifugationSpeed != other.secondCentrifugationSpeed) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SecondCentrifugationSpeedOption [secondCentrifugationSpeed="
        + secondCentrifugationSpeed
        + "]";
  }
}
