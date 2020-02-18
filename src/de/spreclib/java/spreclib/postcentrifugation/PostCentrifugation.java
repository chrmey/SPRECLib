package de.spreclib.java.spreclib.postcentrifugation;

import java.util.HashSet;
import java.util.Set;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.IPostCentrifugation;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public class PostCentrifugation implements IPostCentrifugation, ISprecPart {

  private static final Set<IPostCentrifugation> postCentrifugations;

  private PostCentrifugationType postCentrifugationType;
  private PostCentrifugationDelay postCentrifugationDelay;
  private PostCentrifugationTemperature postCentrifugationTemperature;

  private ICodePart codePart;

  static {
    postCentrifugations = new HashSet<>();
    postCentrifugations.add(new NotApplicablePostCentrifugation(new CodePart("N")));
    postCentrifugations.add(new UnknownPostCentrifugation(new CodePart("X")));
    postCentrifugations.add(new OtherPostCentrifugation(new CodePart("Z")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("B")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("C")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.ONE_TO_TWO_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("D")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("E")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("F")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("G")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.EIGHT_TO_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("H")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("I")));
    postCentrifugations.add(
        new PostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
            PostCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("J")));
  }

  public PostCentrifugation(ICodePart codePart) {
    this.codePart = codePart;
  }

  public PostCentrifugation(
      PostCentrifugationType postCentrifugationType,
      PostCentrifugationDelay postCentrifugationDelay,
      PostCentrifugationTemperature postCentrifugationTemperature,
      ICodePart codePart) {
    this.postCentrifugationType = postCentrifugationType;
    this.postCentrifugationDelay = postCentrifugationDelay;
    this.postCentrifugationTemperature = postCentrifugationTemperature;
    this.codePart = codePart;
  }

  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.POST_CENTRIFUGATION;
  }

  @Override
  public PostCentrifugationType getPostCentrifugationType() {
    return this.postCentrifugationType;
  }

  @Override
  public PostCentrifugationDelay getPostCentrifugationDelay() {
    return this.postCentrifugationDelay;
  }

  @Override
  public PostCentrifugationTemperature getPostCentrifugationTemperature() {
    return this.postCentrifugationTemperature;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result =
        prime * result
            + ((postCentrifugationDelay == null) ? 0 : postCentrifugationDelay.hashCode());
    result =
        prime * result
            + ((postCentrifugationTemperature == null)
                ? 0
                : postCentrifugationTemperature.hashCode());
    result =
        prime * result + ((postCentrifugationType == null) ? 0 : postCentrifugationType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PostCentrifugation other = (PostCentrifugation) obj;
    if (codePart == null) {
      if (other.codePart != null) return false;
    } else if (!codePart.equals(other.codePart)) return false;
    if (postCentrifugationDelay != other.postCentrifugationDelay) return false;
    if (postCentrifugationTemperature != other.postCentrifugationTemperature) return false;
    if (postCentrifugationType != other.postCentrifugationType) return false;
    return true;
  }
}
