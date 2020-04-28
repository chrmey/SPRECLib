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
  protected PreCentrifugationDelay getContainedObject() {
    return this.preCentrifugationDelay;
  }

  protected boolean hasDelay(int delayMinutes) {
    if (this.preCentrifugationDelay.hasValue(delayMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
