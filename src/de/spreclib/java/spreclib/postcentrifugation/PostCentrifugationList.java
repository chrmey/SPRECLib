package de.spreclib.java.spreclib.postcentrifugation;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.spreclib.CodePart;
import java.util.HashSet;
import java.util.Set;

public final class PostCentrifugationList {

  public static final Set<PostCentrifugation> POST_CENTRIFUGATIONS;

  static {
    POST_CENTRIFUGATIONS = new HashSet<>();
    POST_CENTRIFUGATIONS.add(
        new SpecialPostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N")));
    POST_CENTRIFUGATIONS.add(
        new SpecialPostCentrifugation(PostCentrifugationType.UNKNOWN, new CodePart("X")));
    POST_CENTRIFUGATIONS.add(
        new SpecialPostCentrifugation(PostCentrifugationType.OTHER, new CodePart("Z")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("B")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("C")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("D")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("E")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("F")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("G")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("H")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("I")));
    POST_CENTRIFUGATIONS.add(
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("J")));
  }
}
