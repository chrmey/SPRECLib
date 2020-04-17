package de.spreclib.model.centrifugation;

import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialCentrifugation extends Centrifugation {

  SpecialCentrifugation(
      CentrifugationType centrifugationType, ICodePart codePart) {
    super(centrifugationType, codePart);
  }

  @Override
  public boolean isNormalCentrifugation() {
    return false;
  }

  @Override
  public boolean isSpecialCentrifugation() {
    return true;
  }
}
