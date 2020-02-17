package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprecPart;

public class SecondCentrifugation extends Centrifugation {

  public SecondCentrifugation() {}

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.SECOND_CENTRIFUGATION;
  }
}
