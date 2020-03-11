package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;

public final class SpecialLongTermStorage extends LongTermStorage {

  public SpecialLongTermStorage(LongTermStorageType longTermStorageType, ICodePart codePart) {
    super(longTermStorageType, codePart);
  }
}
