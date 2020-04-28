package de.spreclib.model.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


public class PreCentrifugationListTest {

  Set<PreCentrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(new PreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(new PreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("F")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("G")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("H")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("I")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("J")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("K")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("L")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("M")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("N")));
    testList.add(
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
            new CodePart("O")));
  }

  @Test
  public void testPreCentrifugationListSize() {
    int actualSize = PreCentrifugationList.PRE_CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testPreCentrifugationListContent() {
    for (PreCentrifugation preCentrifugation : testList) {
      assertTrue(PreCentrifugationList.PRE_CENTRIFUGATIONS.contains(preCentrifugation));
    }
  }
  
  
  @Test
  public void testGetUnknownPreCentrifugation() {
      PreCentrifugation unknownPreCentrifugation = PreCentrifugationList.getUnknownPreCentrifugation();
      
      PreCentrifugationType expected = PreCentrifugationType.UNKNOWN;

    assertEquals(expected, unknownPreCentrifugation.getPreCentrifugationType());
  }

  @Test
  public void testGetOtherPreCentrifugation() {
    PreCentrifugation otherPreCentrifugation = PreCentrifugationList.getOtherPreCentrifugation();

    PreCentrifugationType expected = PreCentrifugationType.OTHER;

    assertEquals(expected, otherPreCentrifugation.getPreCentrifugationType());
  }

  @Test
  public void testPreCentrifugationListContentTypes() {
    int expectedNormalPreCentrifugations = 0;
    int expectedSpecialPreCentrifugations = 0;
    int actualNormalPreCentrifugations = 0;
    int actualSpecialPreCentrifugations = 0;

    for (PreCentrifugation preCentrifugation : testList) {
      if (preCentrifugation instanceof PreCentrifugation) {
        expectedSpecialPreCentrifugations++;
      }
      if (preCentrifugation instanceof ParameterizedPreCentrifugation) {
        expectedNormalPreCentrifugations++;
      }
    }

    for (PreCentrifugation preCentrifugation : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      if (preCentrifugation instanceof PreCentrifugation) {
        actualSpecialPreCentrifugations++;
      }
      if (preCentrifugation instanceof ParameterizedPreCentrifugation) {
        actualNormalPreCentrifugations++;
      }
    }
    assertEquals(expectedNormalPreCentrifugations, actualNormalPreCentrifugations);
    assertEquals(expectedSpecialPreCentrifugations, actualSpecialPreCentrifugations);
  }
}
