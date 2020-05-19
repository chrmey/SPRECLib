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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fixationTime == null) ? 0 : fixationTime.hashCode());
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
    FixationTimeOption other = (FixationTimeOption) obj;
    if (fixationTime != other.fixationTime) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FixationTimeOption [fixationTime=" + fixationTime + "]";
  }
}
