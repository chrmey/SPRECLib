package de.spreclib.java.spreclib.longtermstorage;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class LongTermStorage implements ISprecPart {

  private final SprecPartType sprecPartType = SprecPartType.LONG_TERM_STORAGE;
  private LongTermStorageType longTermStorageType;
  private ICodePart codePart;

  public LongTermStorage(LongTermStorageType longTermStorageType, ICodePart codePart) {
    this.longTermStorageType = longTermStorageType;
    this.codePart = codePart;
  }

  @Override
  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return this.sprecPartType;
  }

  public LongTermStorageType getLongTermStorageType() {
    return this.longTermStorageType;
  }
}
