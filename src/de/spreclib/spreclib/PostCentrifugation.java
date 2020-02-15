package de.spreclib.spreclib;

import de.spreclib.enums.PostCentrifugationDelay;
import de.spreclib.enums.PostCentrifugationTemperature;
import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public class PostCentrifugation implements ICodePart, ISprecPart {

  private PostCentrifugationDelay postCentrifugationDelay;
  private PostCentrifugationTemperature postCentrifugationTemperature;

  public PostCentrifugation() {}

  public String getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }
}
