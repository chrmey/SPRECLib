package de.spreclib.model.centrifugation;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationDuration;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SecondCentrifugationList {

  public static final List<Centrifugation> SECOND_CENTRIFUGATIONS;

  static {
    List<Centrifugation> modifiableSecondCentrifugations = new ArrayList<>();
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    modifiableSecondCentrifugations.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
    modifiableSecondCentrifugations.add(
        new Centrifugation(CentrifugationType.NO, new CodePart("N")));
    modifiableSecondCentrifugations.add(
        new Centrifugation(CentrifugationType.UNKNOWN, new CodePart("X")));
    modifiableSecondCentrifugations.add(
        new Centrifugation(CentrifugationType.OTHER, new CodePart("Z")));

    SECOND_CENTRIFUGATIONS = Collections.unmodifiableList(modifiableSecondCentrifugations);
  }

  public static Centrifugation getUnknownSecondCentrifugation() {
    for (Centrifugation centrifugation : SECOND_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.UNKNOWN) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getOtherSecondCentrifugation() {
    for (Centrifugation centrifugation : SECOND_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.OTHER) {
        return centrifugation;
      }
    }
    return null;
  }

  public static Centrifugation getNoSecondCentrifugation() {
    for (Centrifugation centrifugation : SECOND_CENTRIFUGATIONS) {
      if (centrifugation.getCentrifugationType() == CentrifugationType.NO) {
        return centrifugation;
      }
    }
    return null;
  }
}
