package de.spreclib.api.lists;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;

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
  public PreCentrifugationDelay getContainedObject() {
    return this.preCentrifugationDelay;
  }

  protected boolean hasDelay(int delayMinutes) {
    if (this.preCentrifugationDelay.hasValueFor(delayMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
