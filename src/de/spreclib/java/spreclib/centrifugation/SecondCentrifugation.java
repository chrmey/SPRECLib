package de.spreclib.java.spreclib.centrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public class SecondCentrifugation extends Centrifugation implements ISprecPart {

  public SecondCentrifugation(
      CentrifugationType centrifugationType,
      CentrifugationDuration centrifugationDuration,
      CentrifugationSpeed centrifugationSpeed,
      CentrifugationTemperature centrifugationTemperature,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart) {
    super(
        centrifugationType,
        centrifugationDuration,
        centrifugationSpeed,
        centrifugationTemperature,
        centrifugationBraking,
        codePart);
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
    return SprecPartType.SECOND_CENTRIFUGATION;
  }
}
