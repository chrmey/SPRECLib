package de.spreclib.api.main;

import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;

/**
 * PostCentrifugationDelayOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PostCentrifugationDelayOption extends AbstractListOption {

  private final PostCentrifugationDelay postCentrifugationDelay;

  PostCentrifugationDelayOption(PostCentrifugationDelay postCentrifugationDelay) {
    this.postCentrifugationDelay = postCentrifugationDelay;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.postCentrifugationDelay.name());
  }

  @Override
  PostCentrifugationDelay getContainedObject() {
    return this.postCentrifugationDelay;
  }

  boolean hasDelay(long delayMinutes) {
    if (this.postCentrifugationDelay.hasValue(delayMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
