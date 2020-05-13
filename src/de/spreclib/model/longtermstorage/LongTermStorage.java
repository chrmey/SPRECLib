package de.spreclib.model.longtermstorage;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecFactor;
import de.spreclib.model.longtermstorage.enums.LongTermStorageType;

public class LongTermStorage implements ISprecFactor, IListProvideable {

  private final LongTermStorageType longTermStorageType;
  private final ICodePart codePart;

  LongTermStorage(LongTermStorageType longTermStorageType, ICodePart codePart) {
    this.longTermStorageType = longTermStorageType;
    this.codePart = codePart;
  }

  public boolean isParameterizedLongTermStorage() {
    return false;
  }

  @Override
  public ICodePart getCodeFromSprecFactor() {
    return this.codePart;
  }

  public LongTermStorageType getLongTermStorageType() {
    return this.longTermStorageType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result = prime * result + ((longTermStorageType == null) ? 0 : longTermStorageType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LongTermStorage other = (LongTermStorage) obj;
    if (codePart == null) {
      if (other.codePart != null) {
        return false;
      }
    } else if (!codePart.equals(other.codePart)) {
      return false;
    }
    if (longTermStorageType != other.longTermStorageType) {
      return false;
    }
    return true;
  }
}
