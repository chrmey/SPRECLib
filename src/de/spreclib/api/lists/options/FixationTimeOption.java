package de.spreclib.api.lists.options;

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

  public FixationTimeOption(FixationTime fixationTime) {
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

  public boolean hasDuration(int durationMinutes) {
    if (this.fixationTime.hasValueFor(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
