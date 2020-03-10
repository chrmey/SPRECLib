package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class LongTermStorage implements ISprecPart {

  private static final SprecPartType SPREC_PART_TYPE = SprecPartType.LONG_TERM_STORAGE;
  private LongTermStorageType longTermStorageType;
  private ICodePart codePart;

  public LongTermStorage(LongTermStorageType longTermStorageType, ICodePart codePart) {
    this.longTermStorageType = longTermStorageType;
    this.codePart = codePart;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return LongTermStorage.SPREC_PART_TYPE;
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
    result = prime * result + ((SPREC_PART_TYPE == null) ? 0 : SPREC_PART_TYPE.hashCode());
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
