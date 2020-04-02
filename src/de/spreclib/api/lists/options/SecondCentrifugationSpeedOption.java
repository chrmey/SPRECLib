package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;

public final class SecondCentrifugationSpeedOption extends AbstractListOption {

  private final SecondCentrifugationSpeed secondCentrifugationSpeed;

  public SecondCentrifugationSpeedOption(SecondCentrifugationSpeed secondCentrifugationSpeed) {
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
}
