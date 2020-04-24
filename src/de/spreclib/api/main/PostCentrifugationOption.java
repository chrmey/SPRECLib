package de.spreclib.api.main;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.postcentrifugation.ParameterizedPostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugation;

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
  protected PostCentrifugation getContainedObject() {
    return this.postCentrifugation;
  }

  protected boolean hasPostCentrifugation(
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
}
