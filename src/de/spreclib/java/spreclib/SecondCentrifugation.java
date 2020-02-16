package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprecPart;

public class SecondCentrifugation extends Centrifugation {

  public SecondCentrifugation() {}

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
    return SprecPartType.SECOND_CENTRIFUGATION;
  }
}
