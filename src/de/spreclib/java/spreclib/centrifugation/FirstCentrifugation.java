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

public class FirstCentrifugation extends Centrifugation implements ISprecPart {

  public FirstCentrifugation(
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

  static {
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.THIRY_MINUTES,
            CentrifugationSpeed.LESS_THOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("M")));
  }

  @Override
  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIRST_CENTRIFUGATION;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }
}
