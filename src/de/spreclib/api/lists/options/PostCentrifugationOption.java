package de.spreclib.api.lists.options;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.spreclib.postcentrifugation.NormalPostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;

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

  public PostCentrifugationOption(PostCentrifugation postCentrifugation) {
    this.postCentrifugation = postCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    PostCentrifugationType postCentrifugationType =
        this.postCentrifugation.getPostCentrifugationType();

    name.append(NAMES_DEFAULT.getString(postCentrifugationType.name()));

    if (this.postCentrifugation.isNormalPostCentrifugation()) {

      NormalPostCentrifugation normalPostCentrifugation =
          (NormalPostCentrifugation) this.postCentrifugation;

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
  public PostCentrifugation getContainedObject() {
    return this.postCentrifugation;
  }

  public boolean hasPostCentrifugation(
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption,
      PostCentrifugationDelayOption postCentrifugationDelayOption) {

    if (postCentrifugationTemperatureOption == null) {
      return false;
    }
    if (postCentrifugationDelayOption == null) {
      return false;
    }

    if (this.postCentrifugation.isNormalPostCentrifugation()) {

      PostCentrifugationTemperature postCentrifugationTemperature =
          postCentrifugationTemperatureOption.getContainedObject();
      PostCentrifugationDelay postCentrifugationDelay =
          postCentrifugationDelayOption.getContainedObject();

      NormalPostCentrifugation normalPostCentrifugation =
          (NormalPostCentrifugation) this.postCentrifugation;

      if (normalPostCentrifugation.contains(
          postCentrifugationTemperature, postCentrifugationDelay)) {
        return true;
      }
    }
    return false;
  }
}
