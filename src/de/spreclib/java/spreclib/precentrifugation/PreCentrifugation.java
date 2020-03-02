package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class PreCentrifugation implements ISprecPart {

  private final SprecPartType SPRECPARTTYPE = SprecPartType.PRE_CENTRIFUGATION;
  private PreCentrifugationType preCentrifugationType;
  private ICodePart codePart;

  public PreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    this.preCentrifugationType = preCentrifugationType;
    this.codePart = codePart;
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
    return this.SPRECPARTTYPE;
  }

  public PreCentrifugationType getPreCentrifugationType() {
    return preCentrifugationType;
  }
}
