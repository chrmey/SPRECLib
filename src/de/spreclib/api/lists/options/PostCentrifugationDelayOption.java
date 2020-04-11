package de.spreclib.api.lists.options;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;

public final class PostCentrifugationDelayOption extends AbstractListOption {

  private final PostCentrifugationDelay postCentrifugationDelay;

  public PostCentrifugationDelayOption(PostCentrifugationDelay postCentrifugationDelay) {
    this.postCentrifugationDelay = postCentrifugationDelay;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.postCentrifugationDelay.name());
  }

  @Override
  public PostCentrifugationDelay getContainedObject() {
    return this.postCentrifugationDelay;
  }

  public boolean hasDelay(int delayMinutes) {
    if (this.postCentrifugationDelay.hasValueFor(delayMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
