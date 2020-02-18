package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;

public class UnknownLongTermStorage extends LongTermStorage {

  public UnknownLongTermStorage(ICodePart codePart) {
    super(codePart);
  }

  @Override
  public LongTermStorageType getLongTermStorageType() {
    return LongTermStorageType.UNKNOWN;
  }
}
