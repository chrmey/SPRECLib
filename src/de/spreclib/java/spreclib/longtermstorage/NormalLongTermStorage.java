package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;

public final class NormalLongTermStorage extends LongTermStorage {

  private final LongTermStorageContainer longTermStorageContainer;
  private final LongTermStorageTemperature longTermStorageTemperature;

  /**
   * Constructor for LongTermStorage.
   *
   * @param longTermStorageType enum LongTermStorageType
   * @param longTermStorageContainer enum LongTermStorageContainer
   * @param longTermStorageTemperature enum LongTermStorageTemperature
   * @param codePart Object CodePart
   */
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
    NormalLongTermStorage other = (NormalLongTermStorage) obj;
    if (longTermStorageContainer != other.longTermStorageContainer) {
      return false;
    }
    if (longTermStorageTemperature != other.longTermStorageTemperature) {
      return false;
    }
    return true;
  }
}
