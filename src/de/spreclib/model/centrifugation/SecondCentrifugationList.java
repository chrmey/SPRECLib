package de.spreclib.model.centrifugation;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationDuration;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;

public final class SecondCentrifugationList {

  public static final Set<Centrifugation> CENTRIFUGATIONS;

  static {
    CENTRIFUGATIONS = new HashSet<>();
    CENTRIFUGATIONS.add(
        new Centrifugation(
            CentrifugationType.NO, new CodePart("N")));
    CENTRIFUGATIONS.add(
        new Centrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X")));
    CENTRIFUGATIONS.add(
        new Centrifugation(
            CentrifugationType.OTHER, new CodePart("Z")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    CENTRIFUGATIONS.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
  }

  public static Centrifugation getUnknownSecondCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.UNKNOWN) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getOtherSecondCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.OTHER) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getNoSecondCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.NO) {
        return centrifugation;
      }
    }
    return null;
  }
}
