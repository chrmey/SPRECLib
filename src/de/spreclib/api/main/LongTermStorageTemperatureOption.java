package de.spreclib.api.main;

import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;

/**
 * LongTermStorageTemperatureOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class LongTermStorageTemperatureOption extends AbstractListOption {

  private final LongTermStorageTemperature longTermStorageTemperature;

  LongTermStorageTemperatureOption(LongTermStorageTemperature longTermStorageTemperature) {
    this.longTermStorageTemperature = longTermStorageTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.longTermStorageTemperature.name());
  }

  @Override
  LongTermStorageTemperature getContainedObject() {
    return this.longTermStorageTemperature;
  }

  boolean hasTemperature(float temperatureCelsius) {
    if (this.longTermStorageTemperature.hasValue(temperatureCelsius)) {
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
            + ((longTermStorageTemperature == null) ? 0 : longTermStorageTemperature.hashCode());
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
    LongTermStorageTemperatureOption other = (LongTermStorageTemperatureOption) obj;
    if (longTermStorageTemperature != other.longTermStorageTemperature) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "LongTermStorageTemperatureOption [longTermStorageTemperature="
        + longTermStorageTemperature
        + "]";
  }
}
