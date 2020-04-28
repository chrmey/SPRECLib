package de.spreclib.model.precentrifugation;

import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class PreCentrifugationList {

  public static final Set<PreCentrifugation> PRE_CENTRIFUGATIONS;

  static {
    PRE_CENTRIFUGATIONS =
        Collections.unmodifiableSet(
            new HashSet<>(
                Arrays.asList(
                    new PreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")),
                    new PreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.LESS_TWO_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("A")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.LESS_TWO_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("B")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("C")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("D")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("E")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("F")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("G")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("H")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("I")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("J")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("K")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("L")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("M")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("N")),
                    new ParameterizedPreCentrifugation(
                        PreCentrifugationDelay.LESS_TWO_HOURS,
                        PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
                        new CodePart("O")))));
  }

  public static PreCentrifugation getUnknownPreCentrifugation() {
    for (PreCentrifugation preCentrifugation : PRE_CENTRIFUGATIONS) {
      if (preCentrifugation.getPreCentrifugationType() == PreCentrifugationType.UNKNOWN) {
        return preCentrifugation;
      }
    }
    return null;
  }

  public static PreCentrifugation getOtherPreCentrifugation() {
    for (PreCentrifugation preCentrifugation : PRE_CENTRIFUGATIONS) {
      if (preCentrifugation.getPreCentrifugationType() == PreCentrifugationType.OTHER) {
        return preCentrifugation;
      }
    }
    return null;
  }
}
