package de.spreclib.java.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.postcentrifugation.NormalPostCentrifugation;
import de.spreclib.java.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.java.spreclib.postcentrifugation.PostCentrifugationList;
import de.spreclib.java.spreclib.postcentrifugation.SpecialPostCentrifugation;

public class TestPostCentrifugationList {

  Set<PostCentrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(
        new SpecialPostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N")));
    testList.add(new SpecialPostCentrifugation(PostCentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(new SpecialPostCentrifugation(PostCentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("B")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("C")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("D")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("E")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("F")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("G")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("H")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("I")));
    testList.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("J")));
  }

  @Test
  public void testPostCentrifugationListSize() {
    int actualSize = PostCentrifugationList.postCentrifugations.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testPostCentrifugationListContents() {
    for (PostCentrifugation postCentrifugation : testList) {
      assertTrue(PostCentrifugationList.postCentrifugations.contains(postCentrifugation));
    }
  }

  @Test
  public void testPostCentrifugationListContentTypes() {
    int expectedNormalPostCentrifugations = 0;
    int expectedSpecialPostCentrifugations = 0;
    int actualNormalPostCentrifugations = 0;
    int actualSpecialPostCentrifugations = 0;

    for (PostCentrifugation postCentrifugation : testList) {
      if (postCentrifugation instanceof SpecialPostCentrifugation) {
        expectedSpecialPostCentrifugations++;
      }
      if (postCentrifugation instanceof NormalPostCentrifugation) {
        expectedNormalPostCentrifugations++;
      }
    }

    for (PostCentrifugation postCentrifugation : PostCentrifugationList.postCentrifugations) {
      if (postCentrifugation instanceof SpecialPostCentrifugation) {
        actualSpecialPostCentrifugations++;
      }
      if (postCentrifugation instanceof NormalPostCentrifugation) {
        actualNormalPostCentrifugations++;
      }
    }
    assertEquals(expectedNormalPostCentrifugations, actualNormalPostCentrifugations);
    assertEquals(expectedSpecialPostCentrifugations, actualSpecialPostCentrifugations);
  }
}
