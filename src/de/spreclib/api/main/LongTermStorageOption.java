package de.spreclib.api.main;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.ParameterizedLongTermStorage;

/**
 * LongTermStorageOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class LongTermStorageOption extends AbstractListOption {

  private final LongTermStorage longTermStorage;

  LongTermStorageOption(LongTermStorage longTermStorage) {
    this.longTermStorage = longTermStorage;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    LongTermStorageType longTermStorageType = this.longTermStorage.getLongTermStorageType();

    name.append(NAMES_DEFAULT.getString(longTermStorageType.name()));

    if (this.longTermStorage.isParameterizedLongTermStorage()) {

      ParameterizedLongTermStorage normalLongTermStorage =
          (ParameterizedLongTermStorage) this.longTermStorage;

      LongTermStorageContainer longTermStorageContainer =
          normalLongTermStorage.getLongTermStorageContainer();
      LongTermStorageTemperature longTermStorageTemperature =
          normalLongTermStorage.getLongTermStorageTemperature();

      name.append(NAMES_DEFAULT.getString(longTermStorageContainer.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(longTermStorageTemperature.name()));
    }

    return name.toString();
  }

  @Override
  protected LongTermStorage getContainedObject() {
    return this.longTermStorage;
  }

  protected boolean hasLongTermStorage(
      LongTermStorageContainerOption longTermStorageContainerOption,
      LongTermStorageTemperatureOption longTermStorageTemperatureOption) {

    if (longTermStorageTemperatureOption == null) {
      return false;
    }
    if (longTermStorageContainerOption == null) {
      return false;
    }

    if (this.longTermStorage.isParameterizedLongTermStorage()) {

      LongTermStorageTemperature longTermStorageTemperature =
          longTermStorageTemperatureOption.getContainedObject();
      LongTermStorageContainer longTermStorageContainer =
          longTermStorageContainerOption.getContainedObject();

      ParameterizedLongTermStorage normalLongTermStorage =
          (ParameterizedLongTermStorage) this.longTermStorage;

      if (normalLongTermStorage.contains(longTermStorageContainer, longTermStorageTemperature)) {
        return true;
      }
    }
    return false;
  }
}
