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
}
