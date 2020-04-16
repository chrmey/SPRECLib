package de.spreclib.api.lists;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;

/**
 * PreCentrifugationTemperatureOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PreCentrifugationTemperatureOption extends AbstractListOption {

  private final PreCentrifugationTemperature preCentrifugationTemperature;

  PreCentrifugationTemperatureOption(PreCentrifugationTemperature preCentrifugationTemperature) {
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

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.preCentrifugationTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
