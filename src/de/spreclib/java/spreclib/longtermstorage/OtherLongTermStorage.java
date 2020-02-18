package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;

public class OtherLongTermStorage extends LongTermStorage {

  public OtherLongTermStorage(ICodePart codePart) {
    super(codePart);
  }

  @Override
  public LongTermStorageType getLongTermStorageType() {
    return LongTermStorageType.OTHER;
  }
}
