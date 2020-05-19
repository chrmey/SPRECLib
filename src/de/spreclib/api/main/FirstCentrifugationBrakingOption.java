package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;

/**
 * FirstCentrifugationBrakingOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationBrakingOption extends AbstractListOption {

  private final CentrifugationBraking firstCentrifugationBraking;

  FirstCentrifugationBrakingOption(CentrifugationBraking firstCentrifugationBraking) {
    this.firstCentrifugationBraking = firstCentrifugationBraking;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationBraking.name());
  }

  @Override
  CentrifugationBraking getContainedObject() {
    return this.firstCentrifugationBraking;
  }

  boolean hasBraking(boolean braking) {
    if (this.firstCentrifugationBraking.hasValue(braking)) {
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
            + ((firstCentrifugationBraking == null) ? 0 : firstCentrifugationBraking.hashCode());
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
    FirstCentrifugationBrakingOption other = (FirstCentrifugationBrakingOption) obj;
    if (firstCentrifugationBraking != other.firstCentrifugationBraking) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FirstCentrifugationBrakingOption [firstCentrifugationBraking="
        + firstCentrifugationBraking
        + "]";
  }
}
