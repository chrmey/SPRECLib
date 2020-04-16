package de.spreclib.model.centrifugation;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;

public final class SecondCentrifugationList {

  public static final Set<Centrifugation> CENTRIFUGATIONS;

  static {
    CENTRIFUGATIONS = new HashSet<>();
    CENTRIFUGATIONS.add(
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N")));
    CENTRIFUGATIONS.add(
        new SpecialCentrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X")));
    CENTRIFUGATIONS.add(
        new SpecialCentrifugation(
            CentrifugationType.OTHER, new CodePart("Z")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    CENTRIFUGATIONS.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
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
