package de.spreclib.java.spreclib.centrifugation;

import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class UnknownCentrifugation extends Centrifugation {

  public UnknownCentrifugation(ICodePart codePart) {
    super(codePart);
  }

  @Override
  public CentrifugationType getCentrifugationType() {
    return CentrifugationType.UNKNOWN;
  }
}
