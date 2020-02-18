package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class PreCentrifugation implements ISprecPart {

  private PreCentrifugationDelay preCentrifugationDelay;
  private PreCentrifugationTemperature preCentrifugationTemperature;
  
  private ICodePart codePart;

  public PreCentrifugation() {}

  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.PRE_CENTRIFUGATION;
  }
}
