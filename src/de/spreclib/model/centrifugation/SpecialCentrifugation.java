package de.spreclib.model.centrifugation;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialCentrifugation extends Centrifugation {

  SpecialCentrifugation(
      CentrifugationType centrifugationType, ICodePart codePart, SprecPartType sprecPartType) {
    super(centrifugationType, codePart, sprecPartType);
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
