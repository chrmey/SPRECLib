package de.spreclib.api.lists;

import de.spreclib.model.enums.FixationTime;

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
  public FixationTime getContainedObject() {
    return this.fixationTime;
  }

  protected boolean hasDuration(int durationMinutes) {
    if (this.fixationTime.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
