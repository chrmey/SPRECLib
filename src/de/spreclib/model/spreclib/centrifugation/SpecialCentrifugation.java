package de.spreclib.model.spreclib.centrifugation;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialCentrifugation extends Centrifugation {

  public SpecialCentrifugation(
      CentrifugationType centrifugationType, ICodePart codePart, SprecPartType sprecPartType) {
    super(centrifugationType, codePart, sprecPartType);
  }
}
