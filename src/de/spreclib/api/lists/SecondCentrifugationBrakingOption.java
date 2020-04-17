package de.spreclib.api.lists;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;

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
  public CentrifugationBraking getContainedObject() {
    return this.secondCentrifugationBraking;
  }

  protected boolean hasBraking(boolean braking) {
    if (this.secondCentrifugationBraking.hasValue(braking)) {
      return true;
    } else {
      return false;
    }
  }
}
