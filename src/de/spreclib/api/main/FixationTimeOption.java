package de.spreclib.api.main;

import de.spreclib.model.fixationtime.FixationTime;

/**
 * FixationTimeOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FixationTimeOption extends AbstractListOption {

  private FixationTime fixationTime;

  FixationTimeOption(FixationTime fixationTime) {
    this.fixationTime = fixationTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fixationTime.name());
  }

  @Override
  FixationTime getContainedObject() {
    return this.fixationTime;
  }

  boolean hasDuration(long durationMinutes) {
    if (this.fixationTime.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
