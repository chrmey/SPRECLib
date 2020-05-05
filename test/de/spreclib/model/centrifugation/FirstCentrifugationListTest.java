package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationListTest {

  Set<Centrifugation> referenceList;

  @Before
  public void setUp() {
    referenceList = new HashSet<>();
    referenceList.add(new Centrifugation(CentrifugationType.NO, new CodePart("N")));
    referenceList.add(new Centrifugation(CentrifugationType.UNKNOWN, new CodePart("X")));
    referenceList.add(new Centrifugation(CentrifugationType.OTHER, new CodePart("Z")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
    referenceList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            FirstCentrifugationDuration.THIRTY_MINUTES,
            FirstCentrifugationSpeed.LESS_THOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("M")));
  }


  @Test
  public void testFirstCentrifugationListContents() {
    for (Centrifugation centrifugation : referenceList) {

      assertTrue(FirstCentrifugationList.FIRST_CENTRIFUGATIONS.contains(centrifugation));
    }
  }

  @Test
  public void testGetUnknownFirstCentrifugation() {
    Centrifugation unknownCentrifugation = FirstCentrifugationList.getUnknownFirstCentrifugation();

    assertEquals(CentrifugationType.UNKNOWN, unknownCentrifugation.getCentrifugationType());
  }

  @Test
  public void testGetOtherFirstCentrifugation() {
    Centrifugation otherCentrifugation = FirstCentrifugationList.getOtherFirstCentrifugation();

    assertEquals(CentrifugationType.OTHER, otherCentrifugation.getCentrifugationType());
  }

  @Test
  public void testGetNoFirstCentrifugation() {
    Centrifugation noCentrifugation = FirstCentrifugationList.getNoFirstCentrifugation();

    assertEquals(CentrifugationType.NO, noCentrifugation.getCentrifugationType());
  }
}
