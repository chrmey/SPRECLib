package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;

/**
 * FirstCentrifugationDurationOption.
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationDurationOption extends AbstractListOption {

  private final FirstCentrifugationDuration firstCentrifugationDuration;

  FirstCentrifugationDurationOption(FirstCentrifugationDuration firstCentrifugationDuration) {
    this.firstCentrifugationDuration = firstCentrifugationDuration;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationDuration.name());
  }

  @Override
  FirstCentrifugationDuration getContainedObject() {
    return this.firstCentrifugationDuration;
  }

  boolean hasDuration(long durationMinutes) {
    if (this.firstCentrifugationDuration.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((firstCentrifugationDuration == null) ? 0 : firstCentrifugationDuration.hashCode());
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
    FirstCentrifugationDurationOption other = (FirstCentrifugationDurationOption) obj;
    if (firstCentrifugationDuration != other.firstCentrifugationDuration) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FirstCentrifugationDurationOption [firstCentrifugationDuration="
        + firstCentrifugationDuration
        + "]";
  }
}
