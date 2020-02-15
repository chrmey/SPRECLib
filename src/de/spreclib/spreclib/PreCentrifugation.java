package de.spreclib.spreclib;

import de.spreclib.enums.PreCentrifugationDelay;
import de.spreclib.enums.PreCentrifugationTemperature;
import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public class PreCentrifugation implements ICodePart, ISprecPart {

  private PreCentrifugationDelay preCentrifugationDelay;
  private PreCentrifugationTemperature preCentrifugationTemperature;

  public PreCentrifugation() {
  }

  public String getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }
}
