package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;

public final class SecondCentrifugationBrakingOption extends AbstractListOption {

  private final CentrifugationBraking centrifugationBraking;

  public SecondCentrifugationBrakingOption(CentrifugationBraking secondCentrifugationBraking) {
    this.centrifugationBraking = secondCentrifugationBraking;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.centrifugationBraking.name());
  }

  @Override
  public CentrifugationBraking getContainedObject() {
    return this.centrifugationBraking;
  }
}
