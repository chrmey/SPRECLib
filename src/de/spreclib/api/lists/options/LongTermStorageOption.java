package de.spreclib.api.lists.options;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.NormalLongTermStorage;

public final class LongTermStorageOption extends AbstractListOption {

  private final LongTermStorage longTermStorage;

  public LongTermStorageOption(LongTermStorage longTermStorage) {
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
    return null;
  }
}
