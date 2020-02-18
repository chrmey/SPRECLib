package de.spreclib.java.spreclib.centrifugation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public class FirstCentrifugation extends Centrifugation implements ICodePart, ISprecPart {

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

  private static final Map<String, List<Object>> staticMap = new HashMap<>();

  static {
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("B")));
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIRST_CENTRIFUGATION;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return null;
  }

  @Override
  public ICodePart getCodePart() {
    return this;
  }
}
