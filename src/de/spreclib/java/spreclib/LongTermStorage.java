package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class LongTermStorage implements ISprecPart {

  private LongTermStorageContainer longTermStorageContainer;
  private LongTermStorageTemperature longTermStorageTemperature;

  private ICodePart codePart;

  public LongTermStorage() {}

  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.LONG_TERM_STORAGE;
  }
}
