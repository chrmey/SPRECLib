package de.spreclib.java.spreclib;

import de.spreclib.java.enums.PreCentrifugationDelay;
import de.spreclib.java.enums.PreCentrifugationTemperature;
import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class PreCentrifugation implements ICodePart, ISprecPart {

  private PreCentrifugationDelay preCentrifugationDelay;
  private PreCentrifugationTemperature preCentrifugationTemperature;

  public PreCentrifugation() {}

  public String getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }

  @Override
  public String getCodeFromSprecPart() { // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.PRE_CENTRIFUGATION;
  }
}
