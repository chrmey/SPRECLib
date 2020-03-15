package de.spreclib.model.spreclib.longtermstorage;

import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialLongTermStorage extends LongTermStorage {

  public SpecialLongTermStorage(LongTermStorageType longTermStorageType, ICodePart codePart) {
    super(longTermStorageType, codePart);
  }
}
