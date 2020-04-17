package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.NormalCentrifugation;
import de.spreclib.model.centrifugation.SecondCentrifugationList;
import de.spreclib.model.centrifugation.SpecialCentrifugation;
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
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N")));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            SecondCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    testList.add(
        new NormalCentrifugation(
            SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
  }

  @Test
  public void testSecondCentrifugationListSize() {
    int actualSize = SecondCentrifugationList.CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testSecondCentrifugationListContents() {
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

  @Test
  public void testSecondCentrifugationListContentTypes() {
    int expectedNormalCentrifugations = 0;
    int expectedSpecialCentrifugations = 0;
    int actualNormalCentrifugations = 0;
    int actualSpecialCentrifugations = 0;

    for (Centrifugation centrifugation : testList) {
      if (centrifugation instanceof SpecialCentrifugation) {
        expectedSpecialCentrifugations++;
      }
      if (centrifugation instanceof NormalCentrifugation) {
        expectedNormalCentrifugations++;
      }
    }

    for (Centrifugation centrifugation : SecondCentrifugationList.CENTRIFUGATIONS) {
      if (centrifugation instanceof SpecialCentrifugation) {
        actualSpecialCentrifugations++;
      }
      if (centrifugation instanceof NormalCentrifugation) {
        actualNormalCentrifugations++;
      }
    }
    assertEquals(expectedNormalCentrifugations, actualNormalCentrifugations);
    assertEquals(expectedSpecialCentrifugations, actualSpecialCentrifugations);
  }
}
