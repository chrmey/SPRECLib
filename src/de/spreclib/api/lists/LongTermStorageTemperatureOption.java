package de.spreclib.api.lists;

import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;

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
  public LongTermStorageTemperature getContainedObject() {
    return this.longTermStorageTemperature;
  }

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.longTermStorageTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
