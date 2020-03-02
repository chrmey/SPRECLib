package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;

public class NormalLongTermStorage extends LongTermStorage {

  private LongTermStorageContainer longTermStorageContainer;
  private LongTermStorageTemperature longTermStorageTemperature;

  public NormalLongTermStorage(
      LongTermStorageType longTermStorageType,
      LongTermStorageContainer longTermStorageContainer,
      LongTermStorageTemperature longTermStorageTemperature,
      ICodePart codePart) {
    super(longTermStorageType, codePart);
    this.longTermStorageContainer = longTermStorageContainer;
    this.longTermStorageTemperature = longTermStorageTemperature;
  }

  public LongTermStorageContainer getLongTermStorageContainer() {
    return this.longTermStorageContainer;
  }

  public LongTermStorageTemperature getLongTermStorageTemperature() {
    return this.longTermStorageTemperature;
  }
}
