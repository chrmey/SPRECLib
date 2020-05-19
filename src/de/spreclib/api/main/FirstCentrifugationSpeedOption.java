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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((firstCentrifugationSpeed == null) ? 0 : firstCentrifugationSpeed.hashCode());
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
    FirstCentrifugationSpeedOption other = (FirstCentrifugationSpeedOption) obj;
    if (firstCentrifugationSpeed != other.firstCentrifugationSpeed) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FirstCentrifugationSpeedOption [firstCentrifugationSpeed="
        + firstCentrifugationSpeed
        + "]";
  }
}
