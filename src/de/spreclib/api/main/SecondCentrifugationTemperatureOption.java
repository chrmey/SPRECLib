package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;

/**
 * SecondCentrifugationTemperatureOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationTemperatureOption extends AbstractListOption {

  private final SecondCentrifugationTemperature secondCentrifugationTemperature;

  SecondCentrifugationTemperatureOption(
      SecondCentrifugationTemperature secondCentrifugationTemperature) {
    this.secondCentrifugationTemperature = secondCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationTemperature.name());
  }

  @Override
  SecondCentrifugationTemperature getContainedObject() {
    return this.secondCentrifugationTemperature;
  }

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.secondCentrifugationTemperature.hasValue(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
