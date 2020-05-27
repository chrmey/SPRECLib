package de.spreclib.api.main;

import de.spreclib.model.warmischemiatime.WarmIschemiaTime;

/**
 * WarmIschemiaTimeOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class WarmIschemiaTimeOption extends AbstractListOption {

  private final WarmIschemiaTime warmIschemiaTime;

  WarmIschemiaTimeOption(WarmIschemiaTime warmIschemiaTime) {
    this.warmIschemiaTime = warmIschemiaTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.warmIschemiaTime.name());
  }

  @Override
  WarmIschemiaTime getContainedObject() {
    return this.warmIschemiaTime;
  }

  boolean hasDuration(long durationMinutes) {
    if (this.warmIschemiaTime.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }

  boolean hasCodeString(String codeString) {
    if (this.warmIschemiaTime
        .getCodeFromSprecFactor()
        .getStringRepresentation()
        .equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((warmIschemiaTime == null) ? 0 : warmIschemiaTime.hashCode());
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
    WarmIschemiaTimeOption other = (WarmIschemiaTimeOption) obj;
    if (warmIschemiaTime != other.warmIschemiaTime) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "WarmIschemiaTimeOption [warmIschemiaTime=" + warmIschemiaTime + "]";
  }
}
