package de.spreclib.model.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


public class PostCentrifugationListTest {

  Set<PostCentrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(
        new PostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N")));
    testList.add(new PostCentrifugation(PostCentrifugationType.UNKNOWN, new CodePart("X")));
    testList.add(new PostCentrifugation(PostCentrifugationType.OTHER, new CodePart("Z")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("B")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("C")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("D")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("E")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("F")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("G")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("H")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("I")));
    testList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("J")));
  }

  @Test
  public void testPostCentrifugationListSize() {
    int actualSize = PostCentrifugationList.POST_CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testPostCentrifugationListContents() {
    for (PostCentrifugation postCentrifugation : testList) {
      assertTrue(PostCentrifugationList.POST_CENTRIFUGATIONS.contains(postCentrifugation));
    }
  }

  @Test
  public void testGetUnknownPostCentrifugation() {

    PostCentrifugation unknownPostCentrifugation = PostCentrifugationList.getUnknownPostCentrifugation();
    assertEquals(PostCentrifugationType.UNKNOWN, unknownPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetNoApplicablePostCentrifugation() {

    PostCentrifugation unknownPostCentrifugation =
        PostCentrifugationList.getNoApplicablePostCentrifugation();
    assertEquals(
        PostCentrifugationType.NOT_APPLICABLE,
        unknownPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetOtherPostCentrifugation() {

    PostCentrifugation unknownPostCentrifugation =
        PostCentrifugationList.getOtherPostCentrifugation();
    assertEquals(
        PostCentrifugationType.OTHER, unknownPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testPostCentrifugationListContentTypes() {
    int expectedNormalPostCentrifugations = 0;
    int expectedSpecialPostCentrifugations = 0;
    int actualNormalPostCentrifugations = 0;
    int actualSpecialPostCentrifugations = 0;

    for (PostCentrifugation postCentrifugation : testList) {
      if (postCentrifugation instanceof PostCentrifugation) {
        expectedSpecialPostCentrifugations++;
      }
      if (postCentrifugation instanceof ParameterizedPostCentrifugation) {
        expectedNormalPostCentrifugations++;
      }
    }

    for (PostCentrifugation postCentrifugation : PostCentrifugationList.POST_CENTRIFUGATIONS) {
      if (postCentrifugation instanceof PostCentrifugation) {
        actualSpecialPostCentrifugations++;
      }
      if (postCentrifugation instanceof ParameterizedPostCentrifugation) {
        actualNormalPostCentrifugations++;
      }
    }
    assertEquals(expectedNormalPostCentrifugations, actualNormalPostCentrifugations);
    assertEquals(expectedSpecialPostCentrifugations, actualSpecialPostCentrifugations);
  }
}
