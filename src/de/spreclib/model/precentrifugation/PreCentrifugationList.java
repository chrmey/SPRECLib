package de.spreclib.model.precentrifugation;

import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PreCentrifugationList {

  public static final List<PreCentrifugation> PRE_CENTRIFUGATIONS;

  static {
    List<PreCentrifugation> modifiablePreCentrifugationList = new ArrayList<>();
    modifiablePreCentrifugationList.add(
        new PreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")));
    modifiablePreCentrifugationList.add(
        new PreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("F")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("G")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("H")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("I")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("J")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("K")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("L")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("M")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("N")));
    modifiablePreCentrifugationList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
            new CodePart("O")));

    PRE_CENTRIFUGATIONS = Collections.unmodifiableList(modifiablePreCentrifugationList);
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
