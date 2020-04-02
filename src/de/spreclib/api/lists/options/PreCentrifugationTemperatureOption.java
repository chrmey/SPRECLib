package de.spreclib.api.lists.options;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;

public final class PreCentrifugationTemperatureOption extends AbstractListOption {

  private final PreCentrifugationTemperature preCentrifugationTemperature;

  public PreCentrifugationTemperatureOption(
      PreCentrifugationTemperature preCentrifugationTemperature) {
    this.preCentrifugationTemperature = preCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.preCentrifugationTemperature.name());
  }

  @Override
  public PreCentrifugationTemperature getContainedObject() {
    return this.preCentrifugationTemperature;
  }
}
