package de.spreclib.model.postcentrifugation;

import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationTemperature;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PostCentrifugationList {

  public static final List<PostCentrifugation> POST_CENTRIFUGATIONS;

  static {
    List<PostCentrifugation> modifiablePostCentrifugationList = new ArrayList<>();
    modifiablePostCentrifugationList.add(
        new PostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N")));
    modifiablePostCentrifugationList.add(
        new PostCentrifugation(PostCentrifugationType.UNKNOWN, new CodePart("X")));
    modifiablePostCentrifugationList.add(
        new PostCentrifugation(PostCentrifugationType.OTHER, new CodePart("Z")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("B")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("C")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("D")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("E")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("F")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("G")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("H")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("I")));
    modifiablePostCentrifugationList.add(
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("J")));

    POST_CENTRIFUGATIONS = Collections.unmodifiableList(modifiablePostCentrifugationList);
  }

  public static PostCentrifugation getNoApplicablePostCentrifugation() {
    for (PostCentrifugation postCentrifugation : POST_CENTRIFUGATIONS) {
      if (postCentrifugation.getPostCentrifugationType() == PostCentrifugationType.NOT_APPLICABLE) {
        return postCentrifugation;
      }
    }
    return null;
  }

  public static PostCentrifugation getUnknownPostCentrifugation() {
    for (PostCentrifugation postCentrifugation : POST_CENTRIFUGATIONS) {
      if (postCentrifugation.getPostCentrifugationType() == PostCentrifugationType.UNKNOWN) {
        return postCentrifugation;
      }
    }
    return null;
  }

  public static PostCentrifugation getOtherPostCentrifugation() {
    for (PostCentrifugation postCentrifugation : POST_CENTRIFUGATIONS) {
      if (postCentrifugation.getPostCentrifugationType() == PostCentrifugationType.OTHER) {
        return postCentrifugation;
      }
    }
    return null;
  }
}
