package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;

/**
 * SecondCentrifugationBrakingOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationBrakingOption extends AbstractListOption {

  private final CentrifugationBraking secondCentrifugationBraking;

  SecondCentrifugationBrakingOption(CentrifugationBraking secondCentrifugationBraking) {
    this.secondCentrifugationBraking = secondCentrifugationBraking;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationBraking.name());
  }

  @Override
  CentrifugationBraking getContainedObject() {
    return this.secondCentrifugationBraking;
  }

  boolean hasBraking(boolean braking) {
    if (this.secondCentrifugationBraking.hasValue(braking)) {
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
            + ((secondCentrifugationBraking == null) ? 0 : secondCentrifugationBraking.hashCode());
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
    SecondCentrifugationBrakingOption other = (SecondCentrifugationBrakingOption) obj;
    if (secondCentrifugationBraking != other.secondCentrifugationBraking) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SecondCentrifugationBrakingOption [secondCentrifugationBraking="
        + secondCentrifugationBraking
        + "]";
  }
}
