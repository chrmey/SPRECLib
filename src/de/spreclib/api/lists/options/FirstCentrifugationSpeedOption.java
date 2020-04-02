package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;

public final class FirstCentrifugationSpeedOption extends AbstractListOption {

  private final FirstCentrifugationSpeed firstCentrifugationSpeed;

  public FirstCentrifugationSpeedOption(FirstCentrifugationSpeed firstCentrifugationSpeed) {
    this.firstCentrifugationSpeed = firstCentrifugationSpeed;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationSpeed.name());
  }

  @Override
  public FirstCentrifugationSpeed getContainedObject() {
    return this.firstCentrifugationSpeed;
  }
}
