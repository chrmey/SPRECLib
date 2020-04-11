package de.spreclib.api.lists.options;

import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;

public final class LongTermStorageTemperatureOption extends AbstractListOption {

  private final LongTermStorageTemperature longTermStorageTemperature;

  public LongTermStorageTemperatureOption(LongTermStorageTemperature longTermStorageTemperature) {
    this.longTermStorageTemperature = longTermStorageTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.longTermStorageTemperature.name());
  }

  @Override
  public LongTermStorageTemperature getContainedObject() {
    return this.longTermStorageTemperature;
  }

  public boolean hasTemperature(float temperatureCelsius) {
    if (this.longTermStorageTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
