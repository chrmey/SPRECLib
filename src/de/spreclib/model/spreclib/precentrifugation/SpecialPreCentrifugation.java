package de.spreclib.model.spreclib.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialPreCentrifugation extends PreCentrifugation {

  public SpecialPreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    super(preCentrifugationType, codePart);
  }
}
