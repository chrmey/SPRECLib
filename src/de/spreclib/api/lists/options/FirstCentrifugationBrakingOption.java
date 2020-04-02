package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;

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
}
