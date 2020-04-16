package de.spreclib.api.lists;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;

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
  public PostCentrifugationTemperature getContainedObject() {
    return this.postCentrifugationTemperature;
  }

  protected boolean hasTemperature(float temperatureCelsius) {
    if (this.postCentrifugationTemperature.hasValueFor(temperatureCelsius)) {
      return true;
    } else {
      return false;
    }
  }
}
