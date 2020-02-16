package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprecPart;

public class FirstCentrifugation extends Centrifugation {

  public FirstCentrifugation() {}

  @Override
  public String getCodePart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getCodeFromSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIRST_CENTRIFUGATION;
  }
}
