package de.spreclib.api.lists;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.NormalLongTermStorage;

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

    if (this.longTermStorage.isNormalLongTermStorage()) {

      NormalLongTermStorage normalLongTermStorage = (NormalLongTermStorage) this.longTermStorage;

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
  public LongTermStorage getContainedObject() {
    return this.longTermStorage;
  }

  protected boolean hasLongTermStorage(
      LongTermStorageTemperatureOption longTermStorageTemperatureOption,
      LongTermStorageContainerOption longTermStorageContainerOption) {

    if (longTermStorageTemperatureOption == null) {
      return false;
    }
    if (longTermStorageContainerOption == null) {
      return false;
    }

    if (this.longTermStorage.isNormalLongTermStorage()) {

      LongTermStorageTemperature longTermStorageTemperature =
          longTermStorageTemperatureOption.getContainedObject();
      LongTermStorageContainer longTermStorageContainer =
          longTermStorageContainerOption.getContainedObject();

      NormalLongTermStorage normalLongTermStorage = (NormalLongTermStorage) this.longTermStorage;

      if (normalLongTermStorage.contains(longTermStorageTemperature, longTermStorageContainer)) {
        return true;
      }
    }
    return false;
  }
}
