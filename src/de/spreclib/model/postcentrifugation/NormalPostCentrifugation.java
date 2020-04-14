package de.spreclib.model.postcentrifugation;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class NormalPostCentrifugation extends PostCentrifugation {

  private final PostCentrifugationDelay postCentrifugationDelay;
  private final PostCentrifugationTemperature postCentrifugationTemperature;

  /**
   * Constructor for NormalPostCentrifugation.
   *
   * @param postCentrifugationType enum PostCentrifugationType
   * @param postCentrifugationDelay enum PostCentrifugationDelay
   * @param postCentrifugationTemperature enum PostCentrifugationTemperature
   * @param codePart object CodePart
   */
  NormalPostCentrifugation(
      PostCentrifugationType postCentrifugationType,
      PostCentrifugationDelay postCentrifugationDelay,
      PostCentrifugationTemperature postCentrifugationTemperature,
      ICodePart codePart) {
    super(postCentrifugationType, codePart);
    this.postCentrifugationDelay = postCentrifugationDelay;
    this.postCentrifugationTemperature = postCentrifugationTemperature;
  }

  @Override
  public boolean isNormalPostCentrifugation() {
    return true;
  }

  @Override
  public boolean isSpecialPostCentrifugation() {
    return false;
  }

  public PostCentrifugationDelay getPostCentrifugationDelay() {
    return this.postCentrifugationDelay;
  }

  public PostCentrifugationTemperature getPostCentrifugationTemperature() {
    return this.postCentrifugationTemperature;
  }

  public boolean contains(
      PostCentrifugationTemperature postCentrifugationTemperature,
      PostCentrifugationDelay postCentrifugationDelay) {

    if (this.postCentrifugationTemperature == postCentrifugationTemperature
        && this.postCentrifugationDelay == postCentrifugationDelay) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result =
        prime * result
            + ((postCentrifugationDelay == null) ? 0 : postCentrifugationDelay.hashCode());
    result =
        prime * result
            + ((postCentrifugationTemperature == null)
                ? 0
                : postCentrifugationTemperature.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    NormalPostCentrifugation other = (NormalPostCentrifugation) obj;
    if (postCentrifugationDelay != other.postCentrifugationDelay) {
      return false;
    }
    if (postCentrifugationTemperature != other.postCentrifugationTemperature) {
      return false;
    }
    return true;
  }
}
