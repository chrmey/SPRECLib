package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;

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

  public FirstCentrifugationBrakingOption(CentrifugationBraking firstCentrifugationBraking) {
    this.firstCentrifugationBraking = firstCentrifugationBraking;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationBraking.name());
  }

  @Override
  public CentrifugationBraking getContainedObject() {
    return this.firstCentrifugationBraking;
  }

  public boolean hasBraking(boolean braking) {
    if (this.firstCentrifugationBraking.hasValueFor(braking)) {
      return true;
    } else {
      return false;
    }
  }
}
