package de.spreclib.spreclib;

import de.spreclib.enums.LongTermStorageContainer;
import de.spreclib.enums.LongTermStorageTemperature;
import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public class LongTermStorage implements ICodePart, ISprecPart {

  private LongTermStorageContainer longTermStorageContainer;
  private LongTermStorageTemperature longTermStorageTemperature;

  public LongTermStorage() {}

  public String getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }
}
