package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;

public final class SecondCentrifugationTemperatureOption extends AbstractListOption {

  private final SecondCentrifugationTemperature secondCentrifugationTemperature;

  public SecondCentrifugationTemperatureOption(
      SecondCentrifugationTemperature secondCentrifugationTemperature) {
    this.secondCentrifugationTemperature = secondCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationTemperature.name());
  }

  @Override
  public SecondCentrifugationTemperature getContainedObject() {
    return this.secondCentrifugationTemperature;
  }

  public boolean hasTemperature(float temperatureCelsius) {
    if (this.secondCentrifugationTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
