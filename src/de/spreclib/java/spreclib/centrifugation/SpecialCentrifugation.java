package de.spreclib.java.spreclib.centrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public final class SpecialCentrifugation extends Centrifugation {

  public SpecialCentrifugation(
      CentrifugationType centrifugationType, ICodePart codePart, SprecPartType sprecPartType) {
    super(centrifugationType, codePart, sprecPartType);
  }
}
