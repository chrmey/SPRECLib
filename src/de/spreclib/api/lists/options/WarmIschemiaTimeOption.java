package de.spreclib.api.lists.options;

import de.spreclib.model.enums.WarmIschemiaTime;

public final class WarmIschemiaTimeOption extends AbstractListOption {

  private final WarmIschemiaTime warmIschemiaTime;

  public WarmIschemiaTimeOption(WarmIschemiaTime warmIschemiaTime) {
    this.warmIschemiaTime = warmIschemiaTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.warmIschemiaTime.name());
  }

  @Override
  public WarmIschemiaTime getContainedObject() {
    return this.warmIschemiaTime;
  }

  public boolean hasDuration(int durationMinutes) {
    if (this.warmIschemiaTime.hasValueFor(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
