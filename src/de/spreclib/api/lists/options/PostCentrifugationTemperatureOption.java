package de.spreclib.api.lists.options;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;

public final class PostCentrifugationTemperatureOption extends AbstractListOption {

  private final PostCentrifugationTemperature postCentrifugationTemperature;

  public PostCentrifugationTemperatureOption(
      PostCentrifugationTemperature postCentrifugationTemperature) {
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
}
