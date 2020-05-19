package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.SecondCentrifugationDuration;

/**
 * SecondCentrifugationDurationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationDurationOption extends AbstractListOption {
  private final SecondCentrifugationDuration secondCentrifugationDuration;

  SecondCentrifugationDurationOption(
      SecondCentrifugationDuration secondCentrifugationDurationOption) {
    this.secondCentrifugationDuration = secondCentrifugationDurationOption;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationDuration.name());
  }

  @Override
  SecondCentrifugationDuration getContainedObject() {
    return this.secondCentrifugationDuration;
  }

  boolean hasDuration(long durationMinutes) {
    if (this.secondCentrifugationDuration.hasValue(durationMinutes)) {
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
            + ((secondCentrifugationDuration == null)
                ? 0
                : secondCentrifugationDuration.hashCode());
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
    SecondCentrifugationDurationOption other = (SecondCentrifugationDurationOption) obj;
    if (secondCentrifugationDuration != other.secondCentrifugationDuration) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SecondCentrifugationDurationOption [secondCentrifugationDuration="
        + secondCentrifugationDuration
        + "]";
  }
}
