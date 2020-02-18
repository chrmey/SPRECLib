package de.spreclib.java.spreclib;

import de.spreclib.java.enums.PostCentrifugationDelay;
import de.spreclib.java.enums.PostCentrifugationTemperature;
import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class PostCentrifugation implements ICodePart, ISprecPart {

  private PostCentrifugationDelay postCentrifugationDelay;
  private PostCentrifugationTemperature postCentrifugationTemperature;

  public PostCentrifugation() {}

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
  public SprecPartType getSprecPartType() {
    return SprecPartType.POST_CENTRIFUGATION;
  }
}
