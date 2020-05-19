package de.spreclib.api.main;

import de.spreclib.model.postcentrifugation.enums.PostCentrifugationTemperature;

/**
 * PostCentrifugationTemperatureOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PostCentrifugationTemperatureOption extends AbstractListOption {

  private final PostCentrifugationTemperature postCentrifugationTemperature;

  PostCentrifugationTemperatureOption(PostCentrifugationTemperature postCentrifugationTemperature) {
    this.postCentrifugationTemperature = postCentrifugationTemperature;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.postCentrifugationTemperature.name());
  }

  @Override
  PostCentrifugationTemperature getContainedObject() {
    return this.postCentrifugationTemperature;
  }

  boolean hasTemperature(float temperatureCelsius) {
    if (this.postCentrifugationTemperature.hasValue(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    PostCentrifugationTemperatureOption other = (PostCentrifugationTemperatureOption) obj;
    if (postCentrifugationTemperature != other.postCentrifugationTemperature) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PostCentrifugationTemperatureOption [postCentrifugationTemperature="
        + postCentrifugationTemperature
        + "]";
  }
}
