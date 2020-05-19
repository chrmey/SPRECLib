package de.spreclib.api.main;

import de.spreclib.model.coldischemiatime.ColdIschemiaTime;

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

  ColdIschemiaTimeOption(ColdIschemiaTime coldIschemiaTime) {
    this.coldIschemiaTime = coldIschemiaTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.coldIschemiaTime.name());
  }

  @Override
  ColdIschemiaTime getContainedObject() {
    return this.coldIschemiaTime;
  }

  boolean hasDuration(long durationMinutes) {
    if (this.coldIschemiaTime.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((coldIschemiaTime == null) ? 0 : coldIschemiaTime.hashCode());
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
    ColdIschemiaTimeOption other = (ColdIschemiaTimeOption) obj;
    if (coldIschemiaTime != other.coldIschemiaTime) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ColdIschemiaTimeOption [coldIschemiaTime=" + coldIschemiaTime + "]";
  }
}
