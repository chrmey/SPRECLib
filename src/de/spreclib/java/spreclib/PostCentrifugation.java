package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class PostCentrifugation implements ISprecPart {

  private PostCentrifugationDelay postCentrifugationDelay;
  private PostCentrifugationTemperature postCentrifugationTemperature;

  private ICodePart codePart;

  public PostCentrifugation() {}

  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.POST_CENTRIFUGATION;
  }
}
