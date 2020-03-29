package de.spreclib.model.spreclib.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.spreclib.CodePart;
import java.util.HashSet;
import java.util.Set;

public final class PreCentrifugationList {

  public static final Set<PreCentrifugation> PRE_CENTRIFUGATIONS;

  static {
    PRE_CENTRIFUGATIONS = new HashSet<>();
    PRE_CENTRIFUGATIONS.add(
        new SpecialPreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")));
    PRE_CENTRIFUGATIONS.add(
        new SpecialPreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("F")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("G")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("H")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("I")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("J")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("K")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("L")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("M")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("N")));
    PRE_CENTRIFUGATIONS.add(
        new NormalPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
            new CodePart("O")));
  }
}
