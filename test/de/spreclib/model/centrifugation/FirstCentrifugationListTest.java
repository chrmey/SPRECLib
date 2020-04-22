package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationListTest {

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
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
    testList.add(
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.THIRTY_MINUTES,
            FirstCentrifugationSpeed.LESS_THOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("M")));
  }

  @Test
  public void testFirstCentrifugationListSize() {
    int actualSize = FirstCentrifugationList.CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testFirstCentrifugationListContents() {
    for (Centrifugation centrifugation : testList) {
      assertTrue(FirstCentrifugationList.CENTRIFUGATIONS.contains(centrifugation));
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

  @Test
  public void testFirstCentrifugationListContentTypes() {
    int expectedNormalCentrifugations = 0;
    int expectedSpecialCentrifugations = 0;
    int actualNormalCentrifugations = 0;
    int actualSpecialCentrifugations = 0;

    for (Centrifugation centrifugation : testList) {
      if (centrifugation instanceof Centrifugation) {
        expectedSpecialCentrifugations++;
      }
      if (centrifugation instanceof ParameterizedCentrifugation) {
        expectedNormalCentrifugations++;
      }
    }

    for (Centrifugation centrifugation : FirstCentrifugationList.CENTRIFUGATIONS) {
      if (centrifugation instanceof Centrifugation) {
        actualSpecialCentrifugations++;
      }
      if (centrifugation instanceof ParameterizedCentrifugation) {
        actualNormalCentrifugations++;
      }
    }
    assertEquals(expectedNormalCentrifugations, actualNormalCentrifugations);
    assertEquals(expectedSpecialCentrifugations, actualSpecialCentrifugations);
  }
}
