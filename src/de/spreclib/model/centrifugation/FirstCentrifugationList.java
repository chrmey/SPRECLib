package de.spreclib.model.centrifugation;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FirstCentrifugationList {

  public static final List<Centrifugation> FIRST_CENTRIFUGATIONS;

  static {
    List<Centrifugation> modifiableFirstCentrifugations = new ArrayList<>();
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
    modifiableFirstCentrifugations.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.THIRTY_MINUTES,
            FirstCentrifugationSpeed.LESS_THOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("M")));
    modifiableFirstCentrifugations.add(
        new Centrifugation(CentrifugationType.NO, new CodePart("N")));
    modifiableFirstCentrifugations.add(
        new Centrifugation(CentrifugationType.UNKNOWN, new CodePart("X")));
    modifiableFirstCentrifugations.add(
        new Centrifugation(CentrifugationType.OTHER, new CodePart("Z")));

    FIRST_CENTRIFUGATIONS = Collections.unmodifiableList(modifiableFirstCentrifugations);
  }

  public static Centrifugation getUnknownFirstCentrifugation() {
    for (Centrifugation centrifugation : FIRST_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.UNKNOWN) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getOtherFirstCentrifugation() {
    for (Centrifugation centrifugation : FIRST_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.OTHER) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getNoFirstCentrifugation() {
    for (Centrifugation centrifugation : FIRST_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.NO) {
        return centrifugation;
      }
    }
    return null;
  }
}
