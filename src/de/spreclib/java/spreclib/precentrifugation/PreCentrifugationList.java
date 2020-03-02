package de.spreclib.java.spreclib.precentrifugation;

import java.util.HashSet;
import java.util.Set;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.spreclib.CodePart;

public class PreCentrifugationList {

  private static final Set<PreCentrifugation> preCentrifugations;

  static {
    preCentrifugations = new HashSet<>();
    preCentrifugations.add(
        new SpecialPreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")));
    preCentrifugations.add(
        new SpecialPreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("F")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("G")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("H")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("I")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("J")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("K")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("L")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("M")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("N")));
    preCentrifugations.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
            new CodePart("O")));
  }
}
