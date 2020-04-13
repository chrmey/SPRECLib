package de.spreclib.api.lists.options;

import de.spreclib.model.enums.ColdIschemiaTime;

/**
 * ColdIschemiaTimeListOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class ColdIschemiaTimeOption extends AbstractListOption {

  private final ColdIschemiaTime coldIschemiaTime;

  public ColdIschemiaTimeOption(ColdIschemiaTime coldIschemiaTime) {
    this.coldIschemiaTime = coldIschemiaTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.coldIschemiaTime.name());
  }


  @Override
  public ColdIschemiaTime getContainedObject() {
    return this.coldIschemiaTime;
  }

  public boolean hasDuration(int durationMinutes) {
    if (this.coldIschemiaTime.hasValueFor(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
