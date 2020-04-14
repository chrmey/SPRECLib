package de.spreclib.model.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
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
                    new SpecialPreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")),
                    new SpecialPreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.LESS_TWO_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("A")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.LESS_TWO_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("B")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("C")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("D")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("E")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("F")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("G")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("H")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("I")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("J")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("K")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("L")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.ROOM_TEMPERATURE,
                        new CodePart("M")),
                    new NormalPreCentrifugation(
                        PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                        new CodePart("N")),
                    new NormalPreCentrifugation(
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
