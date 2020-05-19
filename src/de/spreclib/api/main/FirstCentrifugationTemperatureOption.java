package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.FirstCentrifugationTemperature;

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
  FirstCentrifugationTemperature getContainedObject() {
    return this.firstCentrifugationTemperature;
  }

  boolean hasTemperature(float temperatureCelsius) {
    if (this.firstCentrifugationTemperature.hasValue(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((firstCentrifugationTemperature == null)
                ? 0
                : firstCentrifugationTemperature.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    FirstCentrifugationTemperatureOption other = (FirstCentrifugationTemperatureOption) obj;
    if (firstCentrifugationTemperature != other.firstCentrifugationTemperature) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FirstCentrifugationTemperatureOption [firstCentrifugationTemperature="
        + firstCentrifugationTemperature
        + "]";
  }
}
