package de.spreclib.api.main;

import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;

/**
 * FirstCentrifugationTemperatureOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationTemperatureOption extends AbstractListOption {

  private final FirstCentrifugationTemperature firstCentrifugationTemperature;

  FirstCentrifugationTemperatureOption(
      FirstCentrifugationTemperature firstCentrifugationTemperature) {
    this.firstCentrifugationTemperature = firstCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationTemperature.name());
  }

  @Override
  protected FirstCentrifugationTemperature getContainedObject() {
    return this.firstCentrifugationTemperature;
  }

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.firstCentrifugationTemperature.hasValue(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
