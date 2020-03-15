package de.spreclib.model.interfaces;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageType;

public interface ILongTermStorage {

  LongTermStorageType getLongTermStorageType();

  LongTermStorageContainer getLongTermStorageContainer();

  LongTermStorageTemperature getLongTermStorageTemperature();
}
