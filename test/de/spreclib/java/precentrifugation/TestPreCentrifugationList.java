package de.spreclib.java.precentrifugation;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.precentrifugation.NormalPreCentrifugation;
import de.spreclib.java.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.java.spreclib.precentrifugation.PreCentrifugationList;
import de.spreclib.java.spreclib.precentrifugation.SpecialPreCentrifugation;

public class TestPreCentrifugationList {

  Set<PreCentrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(new SpecialPreCentrifugation(PreCentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(new SpecialPreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("F")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("G")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("H")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("I")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("J")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("K")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("L")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("M")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("N")));
    testList.add(
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
            new CodePart("O")));
  }

  @Test
  public void testPreCentrifugationListSize() {
    int actualSize = PreCentrifugationList.preCentrifugations.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testPreCentrifugationListContent() {
    Object[] actual = PreCentrifugationList.preCentrifugations.toArray();
    Object[] expected = testList.toArray();
    Assert.assertArrayEquals(expected, actual);
  }
}
