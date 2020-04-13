package de.spreclib.api.lists.options;

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

  public boolean hasTemperature(float temperatureCelsius) {
    if (this.firstCentrifugationTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
