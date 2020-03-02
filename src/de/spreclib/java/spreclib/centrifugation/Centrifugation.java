package de.spreclib.java.spreclib.centrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class Centrifugation implements ISprecPart {

  private final SprecPartType sprecPartType;
  private CentrifugationType centrifugationType;
  protected ICodePart codePart;

  public Centrifugation(
      CentrifugationType centrifugationType, ICodePart codePart, SprecPartType sprecPartType) {
    this.centrifugationType = centrifugationType;
    this.codePart = codePart;
    this.sprecPartType = sprecPartType;
  }

  public CentrifugationType getCentrifugationType() {
    return this.centrifugationType;
  }

  @Override
  public ISprecPart getSprecPart() { 
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return this.sprecPartType;
  }
}
