package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public final class SpecialPreCentrifugation extends PreCentrifugation {

  public SpecialPreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    super(preCentrifugationType, codePart);
  }
}
