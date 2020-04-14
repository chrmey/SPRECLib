package de.spreclib.model.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialPreCentrifugation extends PreCentrifugation {

  SpecialPreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    super(preCentrifugationType, codePart);
  }

  @Override
  public boolean isNormalPreCentrifugation() {
    return false;
  }

  @Override
  public boolean isSpecialPreCentrifugation() {
    return true;
  }
}
