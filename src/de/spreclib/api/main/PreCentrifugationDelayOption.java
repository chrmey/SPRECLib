package de.spreclib.api.main;

import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;

/**
 * PreCentrifugationDelayOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PreCentrifugationDelayOption extends AbstractListOption {

  private final PreCentrifugationDelay preCentrifugationDelay;

  PreCentrifugationDelayOption(PreCentrifugationDelay preCentrifugationDelay) {
    this.preCentrifugationDelay = preCentrifugationDelay;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.preCentrifugationDelay.name());
  }

  @Override
  PreCentrifugationDelay getContainedObject() {
    return this.preCentrifugationDelay;
  }

  boolean hasDelay(long delayMinutes) {
    if (this.preCentrifugationDelay.hasValue(delayMinutes)) {
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
        prime * result + ((preCentrifugationDelay == null) ? 0 : preCentrifugationDelay.hashCode());
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
    PreCentrifugationDelayOption other = (PreCentrifugationDelayOption) obj;
    if (preCentrifugationDelay != other.preCentrifugationDelay) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PreCentrifugationDelayOption [preCentrifugationDelay=" + preCentrifugationDelay + "]";
  }
}
