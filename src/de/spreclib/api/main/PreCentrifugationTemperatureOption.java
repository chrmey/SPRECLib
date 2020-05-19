package de.spreclib.api.main;

import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;

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
  PreCentrifugationTemperature getContainedObject() {
    return this.preCentrifugationTemperature;
  }

  boolean hasTemperature(float temperatureCelsius) {
    if (this.preCentrifugationTemperature.hasValue(temperatureCelsius)) {
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
            + ((preCentrifugationTemperature == null)
                ? 0
                : preCentrifugationTemperature.hashCode());
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
    PreCentrifugationTemperatureOption other = (PreCentrifugationTemperatureOption) obj;
    if (preCentrifugationTemperature != other.preCentrifugationTemperature) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PreCentrifugationTemperatureOption [preCentrifugationTemperature="
        + preCentrifugationTemperature
        + "]";
  }
}
