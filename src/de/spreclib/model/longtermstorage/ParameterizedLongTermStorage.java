package de.spreclib.model.longtermstorage;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageType;

public final class ParameterizedLongTermStorage extends LongTermStorage {

  private final LongTermStorageContainer longTermStorageContainer;
  private final LongTermStorageTemperature longTermStorageTemperature;

  ParameterizedLongTermStorage(
      LongTermStorageType longTermStorageType,
      LongTermStorageContainer longTermStorageContainer,
      LongTermStorageTemperature longTermStorageTemperature,
      ICodePart codePart) {
    super(longTermStorageType, codePart);
    this.longTermStorageContainer = longTermStorageContainer;
    this.longTermStorageTemperature = longTermStorageTemperature;
  }

  @Override
  public boolean isParameterizedLongTermStorage() {
    return true;
  }

  public LongTermStorageContainer getLongTermStorageContainer() {
    return this.longTermStorageContainer;
  }

  public LongTermStorageTemperature getLongTermStorageTemperature() {
    return this.longTermStorageTemperature;
  }

  public boolean contains(
      LongTermStorageContainer longTermStorageContainer,
      LongTermStorageTemperature longTermStorageTemperature) {
    if (this.longTermStorageTemperature == longTermStorageTemperature
        && this.longTermStorageContainer == longTermStorageContainer) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result =
        prime * result
            + ((longTermStorageContainer == null) ? 0 : longTermStorageContainer.hashCode());
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
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ParameterizedLongTermStorage other = (ParameterizedLongTermStorage) obj;
    if (longTermStorageContainer != other.longTermStorageContainer) {
      return false;
    }
    if (longTermStorageTemperature != other.longTermStorageTemperature) {
      return false;
    }
    return true;
  }
}
