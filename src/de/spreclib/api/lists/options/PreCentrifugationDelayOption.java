package de.spreclib.api.lists.options;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;

public final class PreCentrifugationDelayOption extends AbstractListOption {

  private final PreCentrifugationDelay preCentrifugationDelay;

  public PreCentrifugationDelayOption(PreCentrifugationDelay preCentrifugationDelay) {
    this.preCentrifugationDelay = preCentrifugationDelay;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.preCentrifugationDelay.name());
  }

  @Override
  public PreCentrifugationDelay getContainedObject() {
    return this.preCentrifugationDelay;
  }

  public boolean hasDelay(int delayMinutes) {
    if (this.preCentrifugationDelay.hasValueFor(delayMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
