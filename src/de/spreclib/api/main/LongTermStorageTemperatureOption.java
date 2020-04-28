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
  protected LongTermStorageTemperature getContainedObject() {
    return this.longTermStorageTemperature;
  }

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.longTermStorageTemperature.hasValue(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
