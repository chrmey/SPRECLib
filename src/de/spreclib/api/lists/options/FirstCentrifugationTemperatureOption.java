package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;

public final class FirstCentrifugationTemperatureOption extends AbstractListOption {

  private final FirstCentrifugationTemperature firstCentrifugationTemperature;

  public FirstCentrifugationTemperatureOption(
      FirstCentrifugationTemperature firstCentrifugationTemperature) {
    this.firstCentrifugationTemperature = firstCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationTemperature.name());
  }

  @Override
  public FirstCentrifugationTemperature getContainedObject() {
    return this.firstCentrifugationTemperature;
  }
}
