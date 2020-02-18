package de.spreclib.java.spreclib;

import de.spreclib.java.enums.LongTermStorageContainer;
import de.spreclib.java.enums.LongTermStorageTemperature;
import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class LongTermStorage implements ICodePart, ISprecPart {

  private LongTermStorageContainer longTermStorageContainer;
  private LongTermStorageTemperature longTermStorageTemperature;

  public LongTermStorage() {}

  public ICodePart getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }

  @Override
  public ICodePart getCodeFromSprecPart() { // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() { // TODO Auto-generated method stub
    return null;
  }
}
