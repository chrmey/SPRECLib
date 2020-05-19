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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((postCentrifugationDelay == null) ? 0 : postCentrifugationDelay.hashCode());
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
    PostCentrifugationDelayOption other = (PostCentrifugationDelayOption) obj;
    if (postCentrifugationDelay != other.postCentrifugationDelay) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PostCentrifugationDelayOption [postCentrifugationDelay="
        + postCentrifugationDelay
        + "]";
  }
}
