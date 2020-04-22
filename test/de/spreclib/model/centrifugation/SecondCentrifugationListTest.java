package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


public class SecondCentrifugationListTest {

  Set<Centrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(
        new Centrifugation(
            CentrifugationType.NO, new CodePart("N")));
    testList.add(
        new Centrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(
        new Centrifugation(
            CentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    testList.add(
        new ParameterizedCentrifugation(
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
  }



  @Test
  public void testSecondCentrifugationListContent() {
    for (Centrifugation centrifugation : testList) {
      assertTrue(SecondCentrifugationList.CENTRIFUGATIONS.contains(centrifugation));
    }
  }

  @Test
  public void testGetUnknownSecondCentrifugation() {
    Centrifugation unknownCentrifugation =
        SecondCentrifugationList.getUnknownSecondCentrifugation();
    assertEquals(CentrifugationType.UNKNOWN, unknownCentrifugation.getCentrifugationType());
  }

  @Test
  public void testGetOtherSecondCentrifugation() {
    Centrifugation otherCentrifugation = SecondCentrifugationList.getOtherSecondCentrifugation();
    assertEquals(CentrifugationType.OTHER, otherCentrifugation.getCentrifugationType());
  }

  @Test
  public void testGetNoSecondCentrifugation() {
    Centrifugation noCentrifugation = SecondCentrifugationList.getNoSecondCentrifugation();
    assertEquals(CentrifugationType.NO, noCentrifugation.getCentrifugationType());
  }

}
