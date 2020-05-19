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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((secondCentrifugationTemperature == null)
                ? 0
                : secondCentrifugationTemperature.hashCode());
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
    SecondCentrifugationTemperatureOption other = (SecondCentrifugationTemperatureOption) obj;
    if (secondCentrifugationTemperature != other.secondCentrifugationTemperature) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SecondCentrifugationTemperatureOption [secondCentrifugationTemperature="
        + secondCentrifugationTemperature
        + "]";
  }
}
