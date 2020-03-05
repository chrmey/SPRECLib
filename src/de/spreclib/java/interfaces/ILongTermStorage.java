package de.spreclib.java.interfaces;

import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;

public interface ILongTermStorage {

  LongTermStorageType getLongTermStorageType();

  LongTermStorageContainer getLongTermStorageContainer();

  LongTermStorageTemperature getLongTermStorageTemperature();
}
