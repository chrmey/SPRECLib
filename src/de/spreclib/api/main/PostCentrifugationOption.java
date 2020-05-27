package de.spreclib.api.main;

import de.spreclib.model.postcentrifugation.ParameterizedPostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationTemperature;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationType;

/**
 * PostCentrifugationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PostCentrifugationOption extends AbstractListOption {

  private final PostCentrifugation postCentrifugation;

  PostCentrifugationOption(PostCentrifugation postCentrifugation) {
    this.postCentrifugation = postCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    PostCentrifugationType postCentrifugationType =
        this.postCentrifugation.getPostCentrifugationType();

    name.append(NAMES_DEFAULT.getString(postCentrifugationType.name()));

    if (this.postCentrifugation.isDefaultPostCentrifugation()) {

      ParameterizedPostCentrifugation normalPostCentrifugation =
          (ParameterizedPostCentrifugation) this.postCentrifugation;

      PostCentrifugationTemperature postCentrifugationTemperature =
          normalPostCentrifugation.getPostCentrifugationTemperature();
      PostCentrifugationDelay postCentrifugationDelay =
          normalPostCentrifugation.getPostCentrifugationDelay();

      name.append(NAMES_DEFAULT.getString(postCentrifugationTemperature.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(postCentrifugationDelay.name()));
    }

    return name.toString();
  }

  @Override
  PostCentrifugation getContainedObject() {
    return this.postCentrifugation;
  }

  boolean hasPostCentrifugation(
      PostCentrifugationDelayOption postCentrifugationDelayOption,
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption) {

    if (postCentrifugationTemperatureOption == null) {
      return false;
    }
    if (postCentrifugationDelayOption == null) {
      return false;
    }

    if (this.postCentrifugation.isDefaultPostCentrifugation()) {

      PostCentrifugationTemperature postCentrifugationTemperature =
          postCentrifugationTemperatureOption.getContainedObject();
      PostCentrifugationDelay postCentrifugationDelay =
          postCentrifugationDelayOption.getContainedObject();

      ParameterizedPostCentrifugation normalPostCentrifugation =
          (ParameterizedPostCentrifugation) this.postCentrifugation;

      if (normalPostCentrifugation.contains(
          postCentrifugationDelay, postCentrifugationTemperature)) {
        return true;
      }
    }
    return false;
  }

  boolean hasCodeString(String codeString) {
    if (this.postCentrifugation
        .getCodeFromSprecFactor()
        .getStringRepresentation()
        .equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((postCentrifugation == null) ? 0 : postCentrifugation.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    PostCentrifugationOption other = (PostCentrifugationOption) obj;
    if (postCentrifugation == null) {
      if (other.postCentrifugation != null) {
        return false;
      }
    } else if (!postCentrifugation.equals(other.postCentrifugation)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PostCentrifugationOption [postCentrifugation=" + postCentrifugation + "]";
  }
}
