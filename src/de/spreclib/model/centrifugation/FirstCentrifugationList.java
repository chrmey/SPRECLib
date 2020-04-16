package de.spreclib.model.centrifugation;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class FirstCentrifugationList {

  public static final Set<Centrifugation> CENTRIFUGATIONS;

  static {
    CENTRIFUGATIONS =
        Collections.unmodifiableSet(
            new HashSet<>(
                Arrays.asList(
                    new SpecialCentrifugation(
                        CentrifugationType.NO,
                        new CodePart("N")),
                    new SpecialCentrifugation(
                        CentrifugationType.UNKNOWN,
                        new CodePart("X")),
                    new SpecialCentrifugation(
                        CentrifugationType.OTHER,
                        new CodePart("Z")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.NO_BRAKING,
                        new CodePart("A")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("B")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
                        FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        CentrifugationBraking.NO_BRAKING,
                        new CodePart("C")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
                        FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("D")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("E")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
                        FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("F")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("G")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
                        FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("F")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("I")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                        FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
                        FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        CentrifugationBraking.WITH_BRAKING,
                        new CodePart("J")),
                    new NormalCentrifugation(
                        FirstCentrifugationDuration.THIRTY_MINUTES,
                        FirstCentrifugationSpeed.LESS_THOUSAND_G,
                        FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                        CentrifugationBraking.NO_BRAKING,
                        new CodePart("M")))));
  }


  public static Centrifugation getUnknownFirstCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.UNKNOWN) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getOtherFirstCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.OTHER) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getNoFirstCentrifugation() {
    for (Centrifugation centrifugation : CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.NO) {
        return centrifugation;
      }
    }
    return null;
  }
}
